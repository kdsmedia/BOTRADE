# Privacy Policy BOTRADE

**Terakhir diperbarui:** 13 September 2026

## 1. Pendahuluan

PT. ALTOMEDIA (selanjutnya disebut "**kami**", "**milik kami**", atau "**ALTOMEDIA**") mengembangkan dan menerbitkan aplikasi seluler **BOTRADE** (selanjutnya disebut "**Aplikasi**") yang tersedia di platform Android melalui Google Play Store. Paket aplikasi: `com.altomedia.botrade`.

Kebijakan Privasi ini menjelaskan bagaimana kami mengumpulkan, menggunakan, mengungkapkan, dan melindungi informasi ketika Anda menggunakan Aplikasi. Kami menghormati privasi Anda dan berkomitmen untuk melindungi informasi pribadi Anda. Dengan mengunduh, memasang, mengakses, atau menggunakan Aplikasi, Anda dianggap telah membaca, memahami, dan menyetujui seluruh praktik yang dijelaskan dalam Kebijakan Privasi ini.

Jika Anda tidak setuju dengan Kebijakan Privasi ini, mohon untuk tidak menggunakan Aplikasi ini.

## 2. Definisi

- **"Aplikasi"** berarti perangkat lunak seluler BOTRADE beserta semua layanan, fitur, dan fungsinya.
- **"Data Pribadi"** berarti informasi apa pun yang berkaitan dengan individu teridentifikasi atau dapat diidentifikasi.
- **"API Key"** berarti kunci API (termasuk API key dan API secret) yang diterbitkan oleh bursa pihak ketiga (seperti Bitfinex) untuk mengautentikasi permintaan atas nama akun pengguna.
- **"Layanan"** berarti seluruh layanan yang disediakan melalui Aplikasi, termasuk namun tidak terbatas pada pemantauan pasar, manajemen pesanan otomatis, dan pelaporan saldo.

## 3. Informasi yang Kami Kumpulkan

### 3.1 Informasi yang Diberikan Secara Langsung oleh Pengguna

Kami dapat mengumpulkan informasi berikut yang Anda berikan secara langsung:

- **API Key dan API Secret Bursa**: Ketika Anda memindai kode QR atau memasukkan API key dari bursa pihak ketiga (misalnya Bitfinex), Aplikasi menyimpan kredensial tersebut **secara lokal di perangkat Anda** melalui SharedPreferences Android. Kredensial ini **tidak pernah dikirim ke server kami**.
- **Preferensi Aplikasi**: Pengaturan seperti bursa yang dipilih, preferensi tampilan, dan konfigurasi perdagangan.
- **Saat Anda menghubungi kami**: Jika Anda menghubungi dukungan pelanggan, kami dapat menerima nama, alamat email, dan isi pesan Anda.

### 3.2 Informasi yang Dikumpulkan Secara Otomatis

Aplikasi dapat mengumpulkan informasi teknis dasar secara otomatis, termasuk:

- **Informasi Perangkat**: Model perangkat, versi sistem operasi Android, resolusi layar, versi aplikasi, dan pengenal perangkat non-pribadi.
- **Data Penggunaan**: Interaksi dengan fitur Aplikasi, sesi penggunaan, dan laporan kerusakan (crash log).
- **Data Jaringan**: Status koneksi internet dan alamat IP (melalui layanan pihak ketiga).

### 3.3 Informasi yang Dikumpulkan dari Bursa Pihak Ketiga

Dengan otorisasi API key Anda, Aplikasi dapat mengambil data dari bursa pihak ketiga, antara lain:

- Saldo akun dan aset (wallet balances).
- Riwayat dan status pesanan.
- Data ticker dan harga pasar real-time.

Data ini diambil langsung dari bursa ke perangkat Anda dan diproses secara lokal.

## 4. Bagaimana Kami Menggunakan Informasi

Kami menggunakan informasi yang dikumpulkan untuk:

1. **Menyediakan dan memelihara Layanan Aplikasi** — menjalankan fungsi inti seperti pemantauan saldo, pembuatan pesanan, dan pembaruan harga.
2. **Melaksanakan transaksi perdagangan** — memproses pembuatan, pembatalan, dan pengelolaan pesanan atas perintah Anda melalui bursa pihak ketiga.
3. **Pelacakan pasar real-time** — menampilkan harga pasar dan statistik kepada pengguna.
4. **Meningkatkan dan mempersonalisasi pengalaman** — memahami bagaimana Aplikasi digunakan untuk meningkatkan fitur.
5. **Pemberitahuan dan peringatan** — mengirim pemberitahuan push tentang status layanan dan pesanan.
6. **Keamanan dan pencegahan penipuan** — mendeteksi dan mencegah penyalahgunaan, aktivitas berbahaya, dan pelanggaran Kebijakan.
7. **Kepatuhan hukum** — memenuhi kewajiban hukum yang berlaku.

Kami **tidak** menggunakan data Anda untuk:

- Menjual atau menyewakan Data Pribadi kepada pihak ketiga.
- Mengiklankan produk pihak ketiga berdasarkan Data Pribadi tanpa persetujuan.
- Memprofilkan Anda untuk tujuan pemasaran lintas konteks tanpa persetujuan eksplisit.

## 5. Izin Aplikasi yang Digunakan

Aplikasi menggunakan izin berikut, dan cara penggunaannya dijelaskan di bawah:

| Izin | Tujuan | Wajib? |
|---|---|---|
| `android.permission.INTERNET` | Mengambil data ticker, saldo, dan menjalankan perdagangan dengan bursa. | Ya |
| `android.permission.CAMERA` | Memindai kode QR berisi API key bursa agar pengguna tidak perlu mengetik manual. | Tidak (opsional) |
| `android.permission.POST_NOTIFICATIONS` | Mengirim pemberitahuan status layanan dan perdagangan. | Tidak |
| `android.permission.FOREGROUND_SERVICE` | Menjalankan layanan perdagangan di latar depan. | Ya |
| `android.permission.FOREGROUND_SERVICE_DATA_SYNC` | Menjaga sinkronisasi data pasar saat layanan berjalan. | Ya |

Kamera **tidak** digunakan untuk mengambil foto/video atau merekam apa pun. Kamera hanya aktif saat dialog pemindaian QR dibuka dan langsung dimatikan setelah pemindaian berhasil.

## 6. Penyimpanan Lokal dan Keamanan Data

### 6.1 Penyimpanan API Key

- API key dan secret Anda disimpan **secara lokal** di perangkat Anda pada penyimpanan internal Android (SharedPreferences).
- Kredensial **tidak pernah** diunggah, disalin, atau dibagikan ke server ALTOMEDIA atau pihak ketiga mana pun kecuali bursa yang Anda pilih.
- Kredensial tersebut hanya digunakan untuk membuat permintaan terautentikasi ke bursa yang Anda pilih.

### 6.2 Langkah Keamanan

Kami menerapkan langkah-langkah keamanan yang wajar untuk melindungi data Anda, antara lain:

- Komunikasi terenkripsi TLS/HTTPS dengan bursa.
- Penggunaan tanda tangan HMAC-SHA384 untuk autentikasi permintaan.
- Minimasi penyimpanan data di cloud; sebagian besar pemrosesan data bersifat lokal di perangkat.

Namun, **tidak ada metode transmisi atau penyimpanan digital yang 100% aman**. Kami tidak dapat menjamin keamanan mutlak. Anda bertanggung jawab untuk:

- Menjaga kerahasiaan API key Anda.
- Tidak membagikan API key Anda kepada orang lain.
- Membatasi izin API key (misalnya menonaktifkan izin penarikan/withdraw) pada bursa.
- Mengaktifkan autentikasi dua faktor (2FA) pada akun bursa Anda.

## 7. Pembagian Data kepada Pihak Ketiga

Kami **tidak menjual, menyewakan, atau memperdagangkan** Data Pribadi Anda.

Kami hanya dapat membagikan data dalam keadaan berikut:

1. **Bursa Pihak Ketiga**: Aplikasi mengirim permintaan API (termasuk API key Anda yang dikonfigurasi) langsung ke bursa yang Anda pilih untuk menjalankan fungsi perdagangan. Data dikirim langsung dari perangkat Anda ke bursa.
2. **Layanan Analitik/Crash (jika digunakan)**: Kami dapat menggunakan layanan pihak ketiga seperti Firebase/Google Analytics untuk memahami kinerja aplikasi dan menangani laporan kerusakan. Layanan tersebut tunduk pada kebijakan privasi mereka masing-masing.
3. **Kewajiban Hukum**: Kami dapat mengungkapkan informasi jika diwajibkan oleh hukum, peraturan, proses hukum, atau permintaan pemerintah yang sah.
4. **Konsolidasi Bisnis**: Dalam hal merger, akuisisi, atau penjualan aset, data Anda dapat ditransfer sebagai bagian dari transaksi dengan pemberitahuan sebelumnya.

## 8. Retensi Data

Kami menyimpan data selama diperlukan untuk tujuan yang dijelaskan dalam Kebijakan ini, atau selama diwajibkan oleh hukum.

- API key disimpan di perangkat Anda sampai Anda menghapusnya melalui menu aplikasi (tombol "Remove" pada dialog pemindaian) atau menghapus aplikasi.
- Jika Anda menghapus Aplikasi, semua data lokal, termasuk API key, akan terhapus dari perangkat Anda.

## 9. Hak Anda sebagai Pengguna

Bergantung pada yurisdiksi Anda, Anda mungkin memiliki hak-hak berikut:

- **Hak Akses**: Meminta salinan data pribadi yang kami pegang tentang Anda.
- **Hak Koreksi**: Meminta perbaikan data yang tidak akurat.
- **Hak Penghapusan**: Meminta penghapusan data pribadi Anda.
- **Hak Pembatasan**: Meminta pembatasan pemrosesan data Anda.
- **Hak Portabilitas**: Meminta data Anda dalam format terstruktur yang dapat dibaca mesin.
- **Hak Menarik Persetujuan**: Menarik persetujuan kapan saja tanpa memengaruhi keabsahan pemrosesan yang dilakukan sebelumnya.
- **Hak Mengadu**: Mengajukan keluhan kepada otoritas perlindungan data yang berwenang.

Untuk menggunakan hak-hak ini, hubungi kami melalui detail kontak pada Bagian 14.

## 10. Data Anak-Anak

Aplikasi **tidak ditujukan untuk anak-anak di bawah 18 tahun**. Kami tidak secara sengaja mengumpulkan Data Pribadi dari anak-anak. Jika kami mengetahui bahwa kami telah mengumpulkan Data Pribadi dari anak-anak tanpa persetujuan orang tua, kami akan mengambil langkah untuk menghapus informasi tersebut. Jika Anda percaya anak Anda telah memberikan informasi kepada kami, hubungi kami segera.

## 11. Layanan Pihak Ketiga dan Tautan Eksternal

Aplikasi dapat berisi tautan ke situs web pihak ketiga (termasuk bursa), atau menggunakan layanan pihak ketiga. Kami tidak bertanggung jawab atas praktik privasi pihak ketiga. Kami mendorong Anda untuk membaca kebijakan privasi setiap layanan yang Anda gunakan.

Layanan Bursa Utama:
- **Bitfinex** — <https://www.bitfinex.com/legal/privacy>

## 12. Keamanan Finansial dan Peringatan Risiko

Aplikasi ini berhubungan dengan perdagangan aset digital (cryptocurrency). Perdagangan aset digital mengandung risiko tinggi dan dapat mengakibatkan kerugian finansial yang signifikan, termasuk kehilangan seluruh modal.

- Pastikan Anda memahami risiko tersebut sebelum menggunakan fitur perdagangan.
- Pengaturan API key yang memberikan izin penarikan dana dapat mengekspos akun Anda pada risiko.
- Kami menyarankan untuk hanya menggunakan izin "Order" pada API key, bukan izin "Withdraw".
- Kami **tidak** memberikan nasihat keuangan atau investasi.

## 13. Perubahan pada Kebijakan Privasi Ini

Kami dapat memperbarui Kebijakan Privasi ini dari waktu ke waktu. Perubahan akan diumumkan melalui:

- Pemberitahuan dalam Aplikasi.
- Pembaruan halaman ini dengan tanggal "Terakhir diperbarui" yang baru.
- Notifikasi email (jika tersedia).

Penggunaan Aplikasi secara berkelanjutan setelah perubahan dianggap sebagai persetujuan terhadap kebijakan yang diperbarui. Kami menyarankan Anda meninjau halaman ini secara berkala.

## 14. Hubungi Kami

Jika Anda memiliki pertanyaan, komentar, atau kekhawatiran mengenai Kebijakan Privasi ini atau praktik data kami, silakan hubungi:

- **Pengembang:** ALTOMEDIA
- **Email:** altomediaindonesia@gmail.com
- **Negara:** Indonesia

Kami akan berusaha merespons dalam waktu 14 (empat belas) hari kerja.

---

*Dokumen ini dibuat untuk keperluan daftar Google Play Console dan dapat diperbarui sewaktu-waktu.*