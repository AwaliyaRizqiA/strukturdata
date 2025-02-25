import java.util.Scanner;: Mengimpor kelas Scanner dari pustaka Java untuk menerima input dari pengguna.
public class Soal_1_UAS: Deklarasi kelas utama bernama Soal_1_UAS.
public static void main(String[] args): Metode utama (entry point) program.
Scanner input = new Scanner(System.in);: Membuat objek Scanner untuk menerima input dari pengguna.
String[] nama, nim, jenisPrestasi, tingkatPrestasi: Array untuk menyimpan data mahasiswa dan prestasi.
int[] tahunPrestasi: Array untuk menyimpan tahun prestasi.
int prestasiCount: Counter untuk jumlah prestasi yang dimasukkan.
int pilihan: Menyimpan input menu dari pengguna.
String[] nama, nim, jenisPrestasi, tingkatPrestasi: Array untuk menyimpan data mahasiswa dan prestasi.
int[] tahunPrestasi: Array untuk menyimpan tahun prestasi.
int prestasiCount: Counter untuk jumlah prestasi yang dimasukkan.
int pilihan: Menyimpan input menu dari pengguna.
do-while: Melakukan looping menu hingga pengguna memilih keluar.
switch (pilihan): Menentukan aksi berdasarkan pilihan pengguna
case 1:
    if (prestasiCount >= 100) {
        System.out.println("Jumlah prestasi telah mencapai batas maksimal.");
        break;
    }
    System.out.print("Nama Mahasiswa: ");
    nama[prestasiCount] = input.nextLine();
    System.out.print("NIM: ");
    nim[prestasiCount] = input.nextLine();
    System.out.print("Jenis Prestasi: ");
    jenisPrestasi[prestasiCount] = input.nextLine();
    Input Data: Menerima input nama, NIM, jenis prestasi, tingkat, dan tahun.
Validasi tingkatPrestasi: Hanya menerima Lokal, Nasional, atau Internasional.
Validasi tahunPrestasi: Hanya menerima tahun 2010-2024.
case 2:
    if (prestasiCount > 0) {
        System.out.println("=== DAFTAR SEMUA PRESTASI ===");
        for (int i = 0; i < prestasiCount; i++) {
            System.out.println("Nama: " + nama[i] + " || NIM: " + nim[i] + 
                " || Jenis: " + jenisPrestasi[i] + 
                " || Tingkat: " + tingkatPrestasi[i] + 
                " || Tahun: " + tahunPrestasi[i]);
        }
    } else {
        System.out.println("belum ada data prestasi");
    }
    break;
Menampilkan Data: Mencetak semua data prestasi yang tersimpan.
Cek Data: Jika tidak ada data, tampilkan pesan "belum ada data prestasi".
case 3:
    System.out.print("Masukkan jenis prestasi yang ingin dianalisis: ");
    String jenis = input.nextLine();
    System.out.println("=== ANALISIS PRESTASI ===");
    for (int i = 0; i < prestasiCount; i++) {
        if (jenisPrestasi[i].equalsIgnoreCase(jenis)) {
            System.out.println("Nama: " + nama[i] + " || NIM: " + nim[i] + 
                " || Tingkat: " + tingkatPrestasi[i] + 
                " || Tahun: " + tahunPrestasi[i]);
        }
    }
    break;
Filter Data: Menampilkan hanya prestasi dengan jenis yang dimasukkan.
equalsIgnoreCase(): Membandingkan string tanpa memperhatikan huruf besar/kecil.
case 4:
    System.out.println("Terima kasih!");
    break;
Keluar Program: Menampilkan pesan dan menghentikan loop.
System.out.println("Pilihan tidak valid. Silakan coba lagi.");
Jika Input Salah: Menampilkan pesan kesalahan.