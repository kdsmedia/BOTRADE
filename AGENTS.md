# BOTRADE — Repository Guide

Android trading-bot app `com.altomedia.botrade` (package name), Java-based,
targeting Play Store release.

## Build

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export ANDROID_HOME=/opt/android-sdk   # restore if missing
./gradlew assembleRelease bundleRelease
```

- Requires Android SDK platform 36 + Build-Tools 36.0.0 (auto-installed by Gradle if licensed).
- Signing: release uses `../keystore/ALTOMEDIA.jks` (HAS BEEN REMOVED FROM GIT — never commit keystores).
- `local.properties` points `sdk.dir` to `/opt/android-sdk`.

## Play Store readiness (source of truth)

- **No default/embedded Bitfinex API key.** `retrofit/ApiClient.java` reads
  scanned credentials from SharedPreferences (`key_user`, `key_user_pass`)
  and returns 401 "API key not configured" if absent.
- QR scanning stores the user's own Bitfinex key (see `CustomDialogClass`).
- "Enable Trade" SwitchCompat (`R.id.switchEnableTrade`) starts/stops
  `TraderMainService` (Foreground Service, `dataSync`).
- `TraderMainService` polls live prices every 10s via `MarketTickerWatcher`
  (real Bitfinex REST: `v1/symbols_details`, `v2/tickers?symbols=...`).
- NO randomized/dummy/simulated data anywhere (checked).
- Android Lint must stay at 0 errors.

## Release assets

- `ALTOMEDIA/apk/BOTRADE-release-1.0.0.apk` — signed release (CN=ALTOMEDIA).
- `ALTOMEDIA/aab/BOTRADE-release-1.0.0.aab` — Play Console upload.
- `ALTOMEDIA/screenshots/`, `ALTOMEDIA/graphics/`, `ALTOMEDIA/docs/`, `ALTOMEDIA/listing/`.
- Manual push instructions: `ALTOMEDIA/docs/PUSH_INSTRUCTIONS.md`.

## Launcher icon

- Adaptive icon: `drawable/ic_launcher_bg_gradient.xml` (indigo gradient) +
  `drawable-nodpi/ic_launcher_foreground_image.png`.
- Source generator: `/workspace/iconwork/make_icons.py`.

## Environment quirks

- The sandbox resets; `/opt/android-sdk` and the emulator can vanish.
  Reinstall via `sdkmanager --sdk_root=/opt/android-sdk "platforms;android-36" "build-tools;36.0.0"`.
- Software rendering emulator (no KVM) is unstable (System UI ANRs) — prefer
  static verification (lint/`aapt2`/`apksigner`) over UI screenshots.
- Current `GITHUB_TOKEN` (ghu_) is read-only: **cannot push**. Use a PAT with `repo` scope.