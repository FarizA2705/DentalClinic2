# DentalClinic Pemrograman Berorientasi Objek 
### UTS Pemrograman Berorientasi Objek 

| Keterangan | Data |
|---|---|
| Nama | Fariz Aufarizky |
| NIM | 2509116004 |
| Kelas | A 25 Sistem Informasi |
| Judul | Manajemen Klinik Gigi |
<br>

# Deskripsi Projek 
Program ini digunakan untuk membantu mengelola data pasien dan dokter pada sebuah klinik gigi. Data dokter sudah tersedia di dalam program, sedangkan pasien dapat melakukan pendaftaran dengan memasukkan data diri dan keluhan.
Setelah pasien terdaftar, Manager dapat menentukan dokter yang akan menangani pasien berdasarkan data dan keluhan pasien.
Program dibuat menggunakan Java dan dijalankan melalui Command Line Interface (CLI).

Fitur Program
• Daftar Sebagai Pasien.
• Lihat Data Pasien.
• Lihat Daftar dokter.
• Kelola Pasien & Pilih Dokter.
• Menampilkan Informasi Manager 
• Menampilkan informasi klinik.
• Keluar dari program.

## Diagram Class
                    +-------------------------+
                    |          User           |
                    +-------------------------+
                    | # id                    |
                    | # nama                  |
                    | # noTelepon             |
                    +-------------------------+
                    | + tampilkanInfo()       |
                    | + getId()               |
                    | + getNama()             |
                    | + getNoTelepon()        |
                    +------------+------------+
                                 |
                    +------------+------------+
                    |                         |
                  extends                   extends
                    |                         |
                    ▼                         ▼
          +-------------------+     +-------------------------+
          |      Manager      |     |         Dokter          |
          +-------------------+     +-------------------------+
          |                   |     | - spesialisasi          |
          +-------------------+     +-------------------------+
          | + pilihDokter()   |     | + tampilkanInfo()       |
          | + tampilkanInfo() |     | + getSpesialisasi()     |
          +-------------------+     +-------------------------+
                                             ▲
                                             |
                                             | ditangani oleh
                                             |
                                  +----------+----------+
                                  |       Pasien        |
                                  +---------------------+
                                  | - idPasien          |
                                  | - nama              |
                                  | - umur              |
                                  | - noTelepon         |
                                  | - keluhan           |
                                  | - dokter            |
                                  +---------------------+
                                  | + setDokter()       |
                                  | + getDokter()       |
                                  | + tampilkanInfo()   |
                                  +---------------------+

                                  +---------------------+
                                  |        Main         |
                                  +---------------------+
                                  | + main()            |
                                  | + daftarPasien()    |
                                  | + tampilkanPasien() |
                                  | + tampilkanDokter() |
                                  | + pilihDokter()     |
                                  +---------------------+

### Penjelasan Diagram
• User > superclass yang menyimpan data dasar.<br>
• Manager > subclass dari User dan digunakan untuk mengelola pasien serta menentukan dokter.<br>
• Dokter > subclass dari User yang memiliki tambahan atribut spesialisasi.<br>
• Pasien > menyimpan data pasien dan memiliki hubungan dengan Dokter.<br>
• Main > class utama yang menjalankan program dan mengatur menu.<br>

### Hierarki Class 
User<br>
├── Manager<br>
└── Dokter<br>

Pasien > Dokter<br>
Main > mengatur seluruh proses program<br>
User merupakan superclass yang menyimpan data dasar seperti ID, nama, dan nomor telepon. Manager dan Dokter merupakan subclass yang mewarisi data dan method dari User. Manager digunakan untuk mengelola proses klinik, sedangkan Dokter memiliki tambahan data berupa spesialisasi.<br>

Pasien tidak mewarisi User, tetapi memiliki hubungan dengan Dokter karena pasien dapat memiliki dokter yang ditentukan oleh Manager. Main` digunakan untuk menjalankan dan mengatur keseluruhan program.<br>

### Struktur Class
Manajemen-Klinik-Gigi<br>
│<br>
├── User.java<br>
├── Manager.java<br>
├── Dokter.java<br>
├── Pasien.java<br>
└── Main.java<br>


### Fungsi Masing-Masing Class

• **User.java**  
Digunakan sebagai superclass yang menyimpan data dasar seperti ID, nama, dan nomor telepon. Class ini juga memiliki method `tampilkanInfo()` yang dapat diwariskan dan digunakan oleh class turunannya.

• **Manager.java**  
Digunakan sebagai subclass dari `User` yang berfungsi untuk mengelola proses pada klinik, terutama menentukan dokter yang akan menangani pasien. Class ini juga menerapkan method overriding pada `tampilkanInfo()`.

• **Dokter.java**  
Digunakan sebagai subclass dari `User` yang menyimpan data dokter seperti ID, nama, nomor telepon, dan spesialisasi. Class ini juga melakukan method overriding pada `tampilkanInfo()`.

• **Pasien.java**  
Digunakan untuk menyimpan data pasien seperti ID pasien, nama, umur, nomor telepon, keluhan, serta dokter yang menangani pasien.

• **Main.java**  
Merupakan class utama yang digunakan untuk menjalankan program. Class ini menampilkan menu, menerima input dari pengguna, membuat data dokter dan manager, mengatur pendaftaran pasien, serta mengatur proses penentuan dokter.

## Program Java
<img width="440" height="243" alt="image" src="https://github.com/user-attachments/assets/95df0c89-15c0-4d92-bb92-38165c06a9fa" /><br>
membuktikan bahwa User merupakan superclass dan memiliki data serta method yang diwariskan.<br>
<img width="458" height="186" alt="image" src="https://github.com/user-attachments/assets/5738fc26-f60a-4750-afa9-6c8f1533400d" /><br>
membuktikan Manager mewarisi User dan menerapkan method overriding.<br>
<img width="578" height="222" alt="image" src="https://github.com/user-attachments/assets/307390d0-e8a9-41f5-ad8b-dd3b8b392e7f" /><br>
penerapan inheritance, sekaligus menunjukkan polymorphism melalui method overriding.<br>
<img width="446" height="337" alt="image" src="https://github.com/user-attachments/assets/a5f60db4-29d7-4540-9949-01220df30de6" /><br>
menunjukkan bahwa Pasien memiliki hubungan dengan object Dokter.<br>
<img width="332" height="292" alt="image" src="https://github.com/user-attachments/assets/250db5bc-1cf1-4d6c-8c66-303e6af07093" /><br>
<img width="307" height="74" alt="image" src="https://github.com/user-attachments/assets/ff03a907-9b91-4e62-ba07-1802f9349638" /><br>
menunjukkan pembuatan object dari subclass.<br>

## Running Program 



























<img width="338" height="146" alt="image" src="https://github.com/user-attachments/assets/929b0537-2010-47d1-bbe1-3b8a40e8b5f6" /><br>
<img width="311" height="143" alt="image" src="https://github.com/user-attachments/assets/926aa529-caea-4387-90cd-48d2e942d941" /><br>
<img width="458" height="161" alt="image" src="https://github.com/user-attachments/assets/7642cce6-1006-4235-b60d-55691833bcae" /><br>
<img width="361" height="131" alt="image" src="https://github.com/user-attachments/assets/6e52eaa9-8701-483c-a2d8-6f5167fc1ae1" /><br>
<img width="416" height="242" alt="image" src="https://github.com/user-attachments/assets/b498c234-0aed-4cd1-9964-3e589620c7ca" /><br>
<img width="335" height="89" alt="image" src="https://github.com/user-attachments/assets/97478e8b-94e8-496c-8de8-d408671e6a60" /><br>>
<img width="431" height="101" alt="image" src="https://github.com/user-attachments/assets/e7c61282-2068-4c0a-8ecf-b1e2c1e630c2" /><br>
<img width="481" height="102" alt="image" src="https://github.com/user-attachments/assets/edcd9bd6-f8b9-4130-991a-f5ecf69a6531" /><br>










