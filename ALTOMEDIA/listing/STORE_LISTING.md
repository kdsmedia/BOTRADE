# Store Listing BOTRADE — Google Play Console

Disarankan diisi di Google Play Console → **Grow → Store presence → Main store listing** / **Store settings**.

---

## 1. Informasi Dasar

| Field | Nilai |
|---|---|
| **Nama Aplikasi** | BOTRADE |
| **Nama Pendek (Short description)** | Trading bot otomatis untuk aset digital Anda. |
| **Paket Aplikasi (Package name)** | com.altomedia.botrade |
| **Kategori** | Finance |
| **Kategori Tambahan** | — |
| **Rating Usia (Content rating)** | Isi kuisioner; usia 18+ (mengandung risiko finansial). |
| **Target audience** | Dewasa (18+), investor & trader aset digital. |
| **Alamat email dukungan** | altomediaindonesia@gmail.com |
| **Website** | *(opsional)* masukkan situs developer. |
| **Audiens** | Semua negara, kecuali negara yang melarang aplikasi trading crypto. |

---

## 2. Deskripsi Pendek (Short Description)

> Trading bot otomatis untuk aset digital Anda. Pantau saldo, harga real-time, dan kelola pesanan dalam satu aplikasi.

## 3. Deskripsi Panjang (Full Description) — Bahasa Indonesia

```
BOTRADE — Trading Bot Aset Digital Otomatis untuk Android

Kelola perdagangan aset digital Anda secara lebih mudah dengan BOTRADE. 
Aplikasi ini menghubungkan aplikasi Anda langsung ke bursa favorit Anda melalui API, 
sehingga Anda dapat memantau pasar, memeriksa saldo, dan menjalankan strategi 
perdagangan secara otomatis — semua dari genggaman Anda.

FITUR UTAMA:

📊 Pantau Pasar Real-Time
  Lihat harga pasar dan ticker secara langsung untuk berbagai pasangan aset digital.

💰 Saldo Wallet Lengkap
  Periksa saldo akun Anda secara real-time dalam tampilan yang bersih dan mudah dibaca.

🤖 Perdagangan Otomatis
  Aktifkan fitur Enable Trade untuk menjalankan logika perdagangan otomatis 
  berdasarkan kondisi pasar. Aplikasi berjalan di latar depan dengan notifikasi 
  sehingga Anda selalu tahu statusnya.

📈 Kelola Pesanan
  Buat, lihat, dan batalkan pesanan langsung dari aplikasi. Pantau posisi aktif 
  dan riwayat pesanan Anda.

🔐 Keamanan Terutama
  API key Anda disimpan secara lokal di perangkat Anda dan tidak pernah dikirim 
  ke server pihak ketiga. Kami menyarankan untuk membatasi izin API key hanya 
  pada aktivitas perdagangan, dan menonaktifkan izin penarikan (withdraw).

⚡ QR Scanner
  Pindai kode QR API key bursa Anda dengan mudah — tanpa perlu mengetik secara manual.

PERINGATAN RISIKO:
Perdagangan aset digital (cryptocurrency) mengandung risiko tinggi dan dapat 
mengakibatkan kerugian finansial yang signifikan, termasuk kehilangan seluruh modal. 
BOTRADE bukan penasihat keuangan. Semua keputusan perdagangan adalah tanggung jawab 
pengguna sepenuhnya. Pastikan Anda memahami risiko sebelum menggunakan fitur perdagangan.

Butuh bantuan? Hubungi kami di altomediaindonesia@gmail.com.
```

---

## 4. Bahasa Kedua — Deskripsi Pendek (EN)

> Automated trading bot for your digital assets. Monitor balances, real-time prices, and manage orders in one app.

## 5. Bahasa Kedua — Deskripsi Panjang (EN)

```
BOTRADE — Automated Digital Asset Trading Bot for Android

Manage your digital asset trading more easily with BOTRADE. The app connects 
directly to your favorite exchange via API so you can monitor the market, 
check balances, and run automated trading strategies — all from your hand.

KEY FEATURES:

📊 Real-Time Market Monitoring
  View live prices and tickers across multiple digital asset pairs.

💰 Full Wallet Balances
  Check your account balances in real time in a clean, readable view.

🤖 Automated Trading
  Turn on Enable Trade to run automated trading logic based on market 
  conditions. The app runs as a foreground service with notifications so 
  you always know its status.

📈 Manage Orders
  Create, view, and cancel orders right from the app. Track active positions 
  and order history.

🔐 Security First
  Your API keys are stored locally on your device and never sent to a third-party 
  server. We recommend restricting API key permissions to trading only, and 
  disabling withdrawal permissions.

⚡ QR Scanner
  Scan your exchange API-key QR code easily — no manual typing needed.

RISK WARNING:
Digital asset (cryptocurrency) trading carries high risk and may result in 
significant financial loss, including the loss of your entire capital. BOTRADE is 
not a financial advisor. All trading decisions are entirely your responsibility.

Questions? Contact altomediaindonesia@gmail.com.
```

---

## 6. Aset Grafis (Ukuran Resmi Play Console)

| Aset | File | Ukuran | Keterangan |
|---|---|---|---|
| Ikon Aplikasi | `graphics/playstore-icon-512x512.png` | 512×512 px | PNG 32-bit |
| Feature Graphic | `graphics/feature-graphic-1024x500.png` | 1024×500 px | Wajib |
| Screenshot Telepon | `screenshots/phone_*.png` | 1080×1920 px (min 320×480) | Min 2, maks 8 |
| Screenshot Tablet | `screenshots/tablet_*.png` | 2000×1200 px (opsional) | 7 inch+ |
| Screenshot TV (opsional) | — | 1280×720 px | Hanya jika dukung Android TV |

> Rekomendasi Play Console: tampilkan aplikasi pada **2–8 screenshot telepon**, orientasi portrait,
> dengan setidaknya screenshot **Atmosfer/Kenampakan Kamera** (opsional), serta **4–6** screenshot
> per kategori jika memungkinkan.

---

## 7. Peluncuran (Rollout)

- **Format App Bundle (.aab)** — Wajib untuk aplikasi baru di Play.
- **Versi Beta** (opsional) — rilis ke internal testing/closed track terlebih dahulu selama 2–5 hari.
- **Produksi** — rilis bertahap (staged rollout) 5% → naikkan bertahap jika stabil.

## 8. Data Keamanan (Data safety) — Play Console

Jawaban yang disarankan pada formulir "Data safety":

| Pertanyaan | Jawaban |
|---|---|
| Apakah aplikasi mengumpulkan/membagikan data? | Ya (data teknis) |
| Data pribadi dikoleksi | API key & secret (disimpan lokal), data perangkat/teknis |
| Apakah data dienkripsi saat transmisi? | Ya (HTTPS/TLS) |
| Apakah data dihapus saat diminta? | Ya — hapus key via menu "Remove" atau hapus aplikasi |

Data yang dinyatakan dikumpulkan (untuk formulir Data safety):
- **Informasi perangkat atau lainnya** (device or other IDs) — untuk operasi dasar & crash analysis.
- **Data akun / data keuangan** (jika relevan) — diambil dari bursa atas otorisasi pengguna.

---

## 9. Daftar Periksa Sebelum Submit

- [ ] Produksi & internal testing track sudah disiapkan
- [ ] App Bundle (.aab) release sudah diunggah
- [ ] Ikon 512×512 & feature graphic diunggah
- [ ] Min. 2 screenshot telepon diunggah
- [ ] Deskripsi pendek & panjang terisi (ID)
- [ ] Privacy Policy URL aktif (hosting di web developer)
- [ ] Logo & branding konsisten
- [ ] Disclaimer risiko keuangan ada di deskripsi
- [ ] Kontak dukungan valid (altomediaindonesia@gmail.com)
- [ ] Content rating diisi (18+)
- [ ] Target audience & negara ditentukan
- [ ] Data safety form diisi
- [ ] Harga: Gratis (Free)

---

*Dokumen listing untuk rilis Play Store BOTRADE v1.0.0.*