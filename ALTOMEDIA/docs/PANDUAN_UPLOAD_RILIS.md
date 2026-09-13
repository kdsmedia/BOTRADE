# Panduan Upload Rilis & Listing BOTRADE ke Google Play Console

Panduan langkah-demi-langkah untuk mengunggah APK/AAB dan melengkapi halaman listing BOTRADE ke Google Play Console.

---

## Bagian 1 — Prasyarat

1. **Akun Google Play Developer** (biaya pendaftaran sekali: USD 25).
2. **Keystore AAB** — Jangan pernah kehilangan file `ALTOMEDIA.jks`, password, dan alias. File ini dibutuhkan untuk semua update berikutnya.
3. **Daftar informasi keystore** (simpan di tempat aman):

```
Keystore file : ALTOMEDIA.jks
Keystore password : Kdsmedia@123
Alias : kdsmedia
Key password : Kdsmedia@123
Validity : 10000
First and Last Name : ALTOMEDIA
Organizational Unit : Developer
Organization : ALTOMEDIA
City : Karawang
State : Jawa Barat
Country Code : ID
```

> ⚠️ **PENTING:** Jangan bagikan keystore/password kepada siapa pun. Simpan di lokasi yang aman (mis. password manager). Kehilangan keystore berarti Anda **tidak akan bisa update aplikasi** dengan akun yang sama.

4. **Aplikasi & paket rilis**: `ALTOMEDIA/aab/BOTRADE-release-1.0.0.aab` (build release yang sudah ditandatangani) dan/atau `ALTOMEDIA/apk/BOTRADE-release-1.0.0.apk`.

---

## Bagian 2 — Upload AAB ke Play Console

1. Login ke <https://play.google.com/console> menggunakan akun developer Anda.
2. Klik **Create app** (atau pilih aplikasi yang sudah ada).
   - App name: `BOTRADE`
   - Package name: `com.altomedia.botrade`
   - Pilih **App or game** → **App**; Private/Free → pilih sesuai.
3. Buka menu **Production** (atau **Testing → Internal testing** untuk tes dulu).
4. Di bagian **Release**, klik **Create new release**.
5. **App bundles** → klik **Upload** → pilih `BOTRADE-release-1.0.0.aab`.
6. Beri **Release name** & **Release notes** (contoh di `RELEASE_NOTES.txt`).
7. **Review & launch** → perbaiki jika ada error → **Start rollout to Production** (atau simpan sebagai draft).

> 🎯 Untuk testing awal, gunakan track **Internal testing** dengan daftar tester email; lalu naikkan ke **Closed/Open testing**, dan terakhir ke **Production**.

---

## Bagian 3 — Lengkapi Store Listing (Main Store Listing)

Ikuti isian lengkap pada `ALTOMEDIA/listing/STORE_LISTING.md`.

Ringkasan item yang wajib diisi:

| Item | Nilai |
|---|---|
| Short description | `Trading bot otomatis untuk aset digital Anda.` |
| Full description | Lihat `STORE_LISTING.md` bagian 3. |
| App icon | `graphics/playstore-icon-512x512.png` |
| Feature graphic | `graphics/feature-graphic-1024x500.png` |
| Phone screenshots | `screenshots/phone_*.png` (min 2) |
| Categorization | Finance |
| Content rating | Kuisioner (diharapkan 18+) |
| Target audience & countries | Pilih sesuai kebijakan negara Anda |
| Contact email | `altomediaindonesia@gmail.com` |
| Privacy policy URL | Hosting `PRIVACY_POLICY.md` di web (lihat Bagian 4) |

---

## Bagian 4 — Privacy Policy URL (Wajib)

Google Play mewajibkan **Privacy Policy URL** yang dapat diakses publik.

**Cara paling sederhana:**
1. Buka isi `ALTOMEDIA/docs/PRIVACY_POLICY.md`.
2. Tempel isinya pada halaman publik, mis.:
   - GitHub Pages / `.md` viewer,
   - Blog / website (WordPress, Blogger),
   - Google Sites (gratis),
   - Notion (share publik).
3. Salin URL publik dan isikan pada **Data safety & Privacy Policy** di Play Console.

**Disarankan:** buat alamat stabil seperti `https://<domain-anda>/privacy-policy`.

---

## Bagian 5 — Data Safety Form

Isi sesuai rekomendasi `STORE_LISTING.md` bagian 8.

---

## Bagian 6 — Rilis Update Berikutnya

1. Bump `versionCode` & `versionName` di `app/build.gradle`.
   - Contoh: `versionCode 2`, `versionName "1.0.1"`.
2. Build ulang: `./gradlew assembleRelease bundleRelease`.
3. Update `ALTOMEDIA/apk` dan `ALTOMEDIA/aab`, dan tambahkan catatan di `RELEASE_NOTES.txt`.
4. Upload AAB baru ke Play Console pada track yang sama; arsipkan versi lama jika perlu.

---

## Checklist Akhir

- [ ] AAB release dibuat dan terupload
- [ ] Ikon & feature graphic benar
- [ ] ≥2 screenshot telepon terpasang
- [ ] Deskripsi pendek & panjang (ID + EN) terisi
- [ ] Privacy Policy URL aktif dan bisa diakses
- [ ] Terms of Service ditautkan (jika diminta kebijakan kategori keuangan, lampirkan URL juga)
- [ ] Content rating selesai
- [ ] Data safety selesai
- [ ] Release notes diisi
- [ ] Rollout Production dimulai

---

*Disiapkan oleh ALTOMEDIA — untuk rilis BOTRADE v1.0.0.*