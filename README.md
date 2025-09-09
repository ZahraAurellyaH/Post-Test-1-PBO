# Post-Test-1-PBO


Nama: Zahra Aurellya Herdiansyah
Nim: 2409116062


*PENJELASAN KODE*

<img width="390" height="27" alt="image" src="https://github.com/user-attachments/assets/1c697d74-ceb7-4fc4-9b68-7525f7aebe34" />

Menunjukkan bahwa file Main.java ini berada di dalam package bernama com.mycompany.Tugas. Package berguna untuk mengelompokkan file Java agar lebih terstruktur.

<img width="375" height="55" alt="image" src="https://github.com/user-attachments/assets/1b5ff743-2ffd-4efc-8c14-534ab7914d7a" />

ArrayList dipakai untuk menyimpan data peminjaman (seperti database sederhana).
Scanner dipakai untuk membaca input dari user.

<img width="289" height="33" alt="image" src="https://github.com/user-attachments/assets/0ae59408-bbbe-4af4-ac25-70f324ae410c" />

public class Main adalah wadah utama program Java. Semua kode, termasuk inner class Peminjaman dan method main, diletakkan di dalam kelas ini.

<img width="397" height="167" alt="image" src="https://github.com/user-attachments/assets/ed8256ab-2703-4100-805e-6814c7e9165d" />

Kelas kecil (inner class) untuk merepresentasikan satu data peminjaman barang. Punya atribut: namaPeminjam, nim, departemen, namaBarang, dan jumlah.

<img width="1393" height="210" alt="image" src="https://github.com/user-attachments/assets/c13138f7-da67-432b-954c-66fa666e7e2a" />

public Peminjaman(...) adalah constructor, yaitu method khusus yang dipanggil saat membuat objek baru dari class Peminjaman. Jadi constructor ini mempermudah pembuatan data peminjaman, agar semua atribut langsung terisi saat objek dibuat.

<img width="840" height="97" alt="image" src="https://github.com/user-attachments/assets/0f6b5358-89ff-4053-9be8-a86533390061" />

public static void main(String[] args) adalah entry point program Java. 
Scanner scanner = new Scanner(System.in); untuk membaca input dari keyboard.
ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>(); sebuah ArrayList kosong dengan tipe data Peminjaman.
int pilihan; untuk menyimpan pilihan menu yang dimasukkan user (1, 2, 3, 4, atau 5).

<img width="966" height="274" alt="image" src="https://github.com/user-attachments/assets/cfdd52ce-eab1-4698-9c70-a39e5bbe2aa6" />

do { ... } Digunakan supaya isi di dalam kurung kurawal akan selalu dijalankan minimal sekali dan akan berakhir apabila angka 5 keluar.
Ada 5 pilihan: Tambah, Lihat, Ubah, Hapus, Keluar.
pilihan = scanner.nextInt(); Membaca input angka dari user dan nilainya disimpan di variabel pilihan.
scanner.nextLine(); untuk membersihkan karakter enter yang tersisa setelah user mengetik angka.

<img width="1243" height="543" alt="image" src="https://github.com/user-attachments/assets/1a24f1c6-ae3e-4f09-9155-5ccf24be580d" />

switch (pilihan); Mengecek nilai pilihan (angka yang dimasukkan user di menu). Jika pilihan == 1, maka blok case 1 dijalankan.
Semua data (nama, nim, departemen, barang, jumlah) akan dipakai untuk membuat objek baru dari class Peminjaman, lalu ditambahkan ke dalam ArrayList daftarPeminjaman.
if (jumlah < 1) Mengecek apakah user menginput jumlah barang yang kurang dari 1. Jika ya, maka dianggap tidak valid dan muncul pesan error.
else { ... } Jika input jumlah barang valid (≥ 1), maka program akan menambahkan data ke ArrayList daftarPeminjaman.
break; Menandakan akhir dari blok case 1.

<img width="1077" height="414" alt="image" src="https://github.com/user-attachments/assets/4b0c0c2b-7249-4166-a0b0-efb294ea000d" />

Blok kode ini dijalankan kalau user memilih menu nomor 2 dan menampilkan judul daftar peminjaman.
if (daftarPeminjaman.isEmpty()) Mengecek apakah ArrayList daftarPeminjaman kosong, jika kosong maka akan ada pesan 'belum  ada data peminjaman'.
else { for (...) { ... } } Jika ArrayList tidak kosong, maka tampilkan semua data peminjaman.
Kalau ada data → ditampilkan satu per satu dengan looping.

<img width="1633" height="818" alt="image" src="https://github.com/user-attachments/assets/4d254408-1bd7-4ba4-8703-5d97b5892e0d" />

Blok kode ini dijalankan kalau user memilih menu nomor 3 dan menampilkan semua data dalam bentuk daftar bernomor.
if (idxUbah >= 0 && idxUbah < daftarPeminjaman.size()) { Mengecek apakah nomor yang dipilih valid (tidak kurang dari 0 dan tidak melebihi jumlah data).
Menu Ubah Data memungkinkan user memilih salah satu data berdasarkan nomor, lalu mengganti seluruh isinya dengan data baru. Validasi dilakukan untuk memastikan nomor pilihan dan jumlah barang benar.

<img width="1213" height="382" alt="image" src="https://github.com/user-attachments/assets/3f6b77e8-3123-49a6-8bdb-a0505bf024b8" />

Blok kode ini dijalankan kalau user memilih menu nomor 4 dan menampilkan semua peminjam dalam daftar, supaya user bisa tahu nomor data yang ingin dihapus.
int idxHapus = scanner.nextInt() - 1; User memasukkan nomor data (1, 2, 3, dst).
if (idxHapus >= 0 && idxHapus < daftarPeminjaman.size()) { Mengecek apakah index valid (tidak negatif dan masih dalam jangkauan ukuran daftar).
Jadi, menu Hapus Data memungkinkan user untuk memilih data tertentu berdasarkan nomor urut, kemudian program akan menghapus data itu dari daftar.

<img width="954" height="100" alt="image" src="https://github.com/user-attachments/assets/41d83a4b-1273-42c7-a523-c73e3f6d976a" />

Blok kode ini dijalankan kalau user memilih menu nomor 5 dan menampilkan pesan 'Terima kasih! Program selesai.'

<img width="811" height="86" alt="image" src="https://github.com/user-attachments/assets/0a7ebe96-52e5-43b6-86d5-20a572f3586a" />

Jika input dari user salah atau tidak valid (selain angka 1-5) maka akan menampilkan pesan 'Pilihan tidak valid!'.

<img width="432" height="167" alt="image" src="https://github.com/user-attachments/assets/f8a524f8-e766-4646-8542-451202afc131" />

Karena kode switch berada dalam do { ... } while(pilihan != 5);, maka perulangan akan berhenti jika user memilih angka 5.
scanner.close();
Menutup Scanner yang kita gunakan untuk input.


*PENJELASAN OUTPUT*

<img width="478" height="178" alt="Screenshot 2025-09-10 001212" src="https://github.com/user-attachments/assets/a5604c8d-d1a8-4dc1-932b-45d1bacced39" />

Diatas merupakan hasil dari output kode yang sudah dibikin sebelumnya. Terdapat 5 menu dalam 'Manajemen Peminjaman Barang Sekre'.

<img width="299" height="119" alt="Screenshot 2025-09-10 001229" src="https://github.com/user-attachments/assets/9f3641a7-6ad3-4fb3-bc3f-147d92fc4fd2" />

Pertama-tama saat baru membuka program dan memilih menu nomor 2, karna kita belum pernah memasukkan peminjaman barang maka daftar peminjaman masih kosong.

<img width="340" height="185" alt="Screenshot 2025-09-10 001312" src="https://github.com/user-attachments/assets/d68df4e5-16e8-47b6-a947-1a6336fafd8e" />

Selanjutnya, memilih menu nomor 1. Maka user akan mengisi beberapa deskripsi yang harus diisi saat meminjam barang sekre.

<img width="1042" height="109" alt="Screenshot 2025-09-10 001326" src="https://github.com/user-attachments/assets/6b5cf928-2abb-4616-839e-f1b5362d5b87" />

Setelah user mengisi peminjaman, maka saat ditampilkan kembali menu nomor 2 akan muncul daftar peminjaman.

<img width="421" height="161" alt="Screenshot 2025-09-10 001348" src="https://github.com/user-attachments/assets/0b2b2f50-1d60-4343-b749-1c3cc5d5094b" />

Memilih menu nomor 3 dan salah saat menginput nomor.

<img width="408" height="281" alt="Screenshot 2025-09-10 001433" src="https://github.com/user-attachments/assets/cdab3c8a-12c1-4315-a79c-30782343b6b3" />

Memilih menu nomor 3 dan melakukan input dengan benar atau sesuai dengan nomor yang ada. Maka user bisa mengubah data peminjaman sesuai dengan kemauannya.

<img width="985" height="59" alt="Screenshot 2025-09-10 001448" src="https://github.com/user-attachments/assets/7e62f74b-08e4-466c-a97c-9f804127e809" />

Dan hasilnya setelah diubah akan seperti diatas saat kita memilih kembali menu nomor 2.

<img width="426" height="161" alt="Screenshot 2025-09-10 001520" src="https://github.com/user-attachments/assets/a8c5f6ab-0997-48aa-89d9-3bda0b07f906" />

Saat user memilih menu nomor 4 dan salah menginput maka akan muncul pesan seperti diatas.

<img width="429" height="153" alt="Screenshot 2025-09-10 001536" src="https://github.com/user-attachments/assets/98ea9cf7-c9e4-47b6-a87c-c4c0866bb946" />

Jika berhasil maka akan muncul pesan 'Data berhasil dihapus!'.

<img width="295" height="105" alt="Screenshot 2025-09-10 001547" src="https://github.com/user-attachments/assets/285fd2ad-2345-42a1-ab94-e2e2a91c629b" />

Saat dilihan kembali pada daftar peminjaman, maka akan terhapus.

<img width="811" height="212" alt="Screenshot 2025-09-10 001623" src="https://github.com/user-attachments/assets/083942c9-21ee-40cd-bfdd-57918dff5da7" />

Dan yang terakhir, saat user memilih menu nomor 5. Program akan berakhir dan keluar.
