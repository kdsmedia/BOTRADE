# Push Instruksi — BOTRADE

Commit lokal sudah siap (2 commit di branch `main`, *ahead of origin/main*).

## Opsi A — Push dengan Personal Access Token (PAT)

1. Buat PAT di GitHub → Settings → Developer settings → Personal access tokens → Tokens (classic), scope: **`repo`**.
2. Push:

```bash
git remote set-url origin https://<USERNAME>:<PAT>@github.com/kdsmedia/BOTRADE.git
git push origin main
```

3. (Opsional) Kembalikan remote tanpa token:

```bash
git remote set-url origin https://github.com/kdsmedia/BOTRADE.git
```

## Opsi B — Push lewat gh CLI (perlu token dgn write scope)

```bash
gh auth login          # pilih HTTPS, pilih browser, login sebagai kdsmedia
git push origin main
```

## Opsi C — Gunakan bundle (offline)

Commit sudah dibundel ke:

```
/tmp/botrade-updates.bundle
```

Di komputer lain:

```bash
git fetch /tmp/botrade-updates.bundle main:main
git push origin main
```

## Status saat ini

| Item | Status |
|---|---|
| Commit `ee71232` | Fix Android Lint errors |
| Commit `f58f9d4` | Prepare Play Store release (icons, assets, docs, signing) |
| Base `a0790b5` | Sudah ada di origin/main |

Setelah push, verifikasi: `git status -sb` → keluar `## main...origin/main` tanpa *ahead*.