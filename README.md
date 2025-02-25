Penjelasan LatihanArray1
public class LatihanArray1 {
    public static void main(String[] args) {
public class LatihanArray1 → Mendeklarasikan kelas dengan nama LatihanArray1.
public static void main(String[] args) → Metode utama yang akan dieksekusi pertama kali saat program dijalankan.
int[] bilanganGenap = new int[10];
int jumlah = 0;
int[] bilanganGenap = new int[10]; → Membuat array bilanganGenap dengan 10 elemen.
int jumlah = 0; → Variabel untuk menyimpan total jumlah semua elemen array.
for (int i = 0; i < bilanganGenap.length; i++) {
    bilanganGenap[i] = (i + 1) * 2;
}
Menggunakan perulangan for untuk mengisi array dengan bilangan genap.
(i + 1) * 2 → Menghasilkan bilangan genap mulai dari 2, yaitu:
i = 0 → 2
i = 1 → 4
i = 2 → 6
i = 3 → 8
...
i = 9 → 20
System.out.println("Isi array:");
for (int bilangan : bilanganGenap) {
    System.out.print(bilangan + " ");
    jumlah += bilangan;
}
Menggunakan enhanced for-loop untuk membaca dan mencetak setiap elemen array.
jumlah += bilangan; → Menambahkan setiap elemen ke dalam variabel jumlah.
System.out.println("\nJumlah semua elemen: " + jumlah);
\n → Membuat baris baru sebelum mencetak jumlah total.
jumlah berisi hasil penjumlahan seluruh elemen array.
System.out.println("\\nJumlah semua elemen: " + jumlah);
\\n seharusnya cukup \n untuk menghasilkan baris baru.
Jika kode dijalankan, output yang dihasilkan adalah:
Isi array:
2 4 6 8 10 12 14 16 18 20 
Jumlah semua elemen: 110



Penjelasan PencarianArray

public class PencarianArray {
    public static void main(String[] args) {
public class PencarianArray → Mendeklarasikan kelas dengan nama PencarianArray.
public static void main(String[] args) → Metode utama yang akan dieksekusi saat program dijalankan.
int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
int cari = 90;
boolean ketemu = false;
int indeks = -1;
int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
Array nilai berisi kumpulan angka yang akan dicari.
int cari = 90;
Menentukan angka yang ingin dicari dalam array (90 dalam hal ini).
boolean ketemu = false;
Variabel ketemu digunakan untuk menandai apakah angka yang dicari ditemukan.
int indeks = -1;
Variabel indeks menyimpan posisi angka yang dicari dalam array (default -1 jika tidak ditemukan).for (int i = 0; i < nilai.length; i++) {
    if (nilai[i] == cari) {
        ketemu = true;
        indeks = i;
        break;
    }
}
Perulangan for digunakan untuk menelusuri setiap elemen dalam array.
Kondisi if (nilai[i] == cari):
Jika elemen array sesuai dengan angka yang dicari (cari = 90), maka:
ketemu = true; → Menandakan bahwa angka ditemukan.
indeks = i; → Menyimpan indeks posisi angka dalam array.
break; → Menghentikan pencarian setelah angka ditemukan.
if (ketemu) {
    System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
} else {
    System.out.println("Nilai " + cari + " tidak ditemukan");
}
Jika ketemu bernilai true, program mencetak:
Nilai 90 ditemukan pada indeks 3
Jika ketemu tetap false, berarti angka tidak ditemukan dan mencetak:
Nilai 90 tidak ditemukan
Karena cari = 90, dan 90 ada di indeks ke-3 dalam array, maka output yang dihasilkan adalah:
Nilai 90 ditemukan pada indeks 3


penjelasan StatistikArray

public class StatistikArray {
    public static void main(String[] args) {
public class StatistikArray → Mendeklarasikan kelas dengan nama StatistikArray.
public static void main(String[] args) → Metode utama yang akan dieksekusi saat program dijalankan.int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
Membuat array nilai yang berisi nilai-nilai siswa.int tertinggi = nilai[0];
int terendah = nilai[0];
int total = nilai[0];
tertinggi = nilai[0] → Menyimpan nilai tertinggi (sementara).
terendah = nilai[0] → Menyimpan nilai terendah (sementara).
total = nilai[0] → Menyimpan total jumlah nilai untuk menghitung rata-rata.for (int i = 1; i < nilai.length; i++) {
    if (nilai[i] > tertinggi) tertinggi = nilai[i];
    if (nilai[i] < terendah) terendah = nilai[i];
    total += nilai[i];
}
Perulangan for dimulai dari i = 1 (karena nilai[0] sudah digunakan sebelumnya).
Mengecek nilai tertinggi:
if (nilai[i] > tertinggi) tertinggi = nilai[i];
Jika nilai saat ini lebih besar dari nilai tertinggi sebelumnya, maka diperbarui.
Mengecek nilai terendah:
if (nilai[i] < terendah) terendah = nilai[i];
Jika nilai saat ini lebih kecil dari nilai terendah sebelumnya, maka diperbarui.
Menjumlahkan nilai untuk rata-rata:
total += nilai[i];
double rataRata = (double) total / nilai.length;
Menggunakan casting ke double agar hasil pembagian lebih akurat.
System.out.println("Nilai tertinggi: " + tertinggi);
System.out.println("Nilai terendah: " + terendah);
System.out.println("Rata-rata: " + rataRata);
Menampilkan nilai tertinggi, terendah, dan rata-rata ke layar.
Jika kode dijalankan, output yang dihasilkan adalah:
Nilai tertinggi: 95
Nilai terendah: 65
Rata-rata: 81.0


Penjelasan SistemOperasi

public class SistemNilai {
    public static void main(String[] args) {
public class SistemNilai → Mendeklarasikan kelas dengan nama SistemNilai.
public static void main(String[] args) → Metode utama yang akan dieksekusi saat program dijalankan.
String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"};
Array namaSiswa → Menyimpan nama-nama siswa.
int[][] nilai = {
    {80, 85, 90}, // Nilai Ani
    {75, 70, 85}, // Nilai Budi
    {85, 80, 88}, // Nilai Cici
    {90, 85, 95}, // Nilai Dodi
    {70, 75, 80}  // Nilai Edi
};
Array nilai → Merupakan array dua dimensi yang menyimpan nilai masing-masing siswa dalam 3 mata pelajaran.
String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};
Array mapel → Menyimpan nama mata pelajaran.
System.out.println("Rata-rata nilai per siswa:");
for (int i = 0; i < nilai.length; i++) {
    double total = 0;
    for (int n : nilai[i]) {
        total += n;
    }
    double rataSiswa = total / nilai[i].length;
    System.out.printf("%s: %.2f\\n", namaSiswa[i], rataSiswa);
}
Loop for pertama → Mengulang setiap siswa (i sebagai indeks siswa).
Loop for-each → Menjumlahkan nilai setiap siswa.
Menghitung rata-rata:


double rataSiswa = total / nilai[i].length;
Mencetak hasil dengan format %.2f (dua angka di belakang koma).


System.out.println("\\nRata-rata nilai per mata pelajaran:");
for (int j = 0; j < nilai[0].length; j++) {
    double total = 0;
    for (int i = 0; i < nilai.length; i++) {
        total += nilai[i][j];
    }
    double rataMapel = total / nilai.length;
    System.out.printf("%s: %.2f\\n", mapel[j], rataMapel);
}
Loop for pertama → Iterasi berdasarkan mata pelajaran (j sebagai indeks mapel).
Loop for kedua → Mengambil nilai dari semua siswa untuk mata pelajaran tersebut.
Menghitung rata-rata per mata pelajaran:
double rataMapel = total / nilai.length;

System.out.printf("%s: %.2f\n", namaSiswa[i], rataSiswa);
System.out.println("\nRata-rata nilai per mata pelajaran:");
System.out.printf("%s: %.2f\n", mapel[j], rataMapel);
jika kode dijalankan, output yang dihasilkan adalah:

Rata-rata nilai per siswa:
Ani: 85.00
Budi: 76.67
Cici: 84.33
Dodi: 90.00
Edi: 75.00

Rata-rata nilai per mata pelajaran:
Matematika: 80.00
Bahasa Inggris: 79.00
IPA: 87.60


Penjelasan TicTacToe

public class TicTacToe {
    public static void main(String[] args) {
public class TicTacToe → Mendeklarasikan kelas TicTacToe.
public static void main(String[] args) → Metode utama yang akan dieksekusi saat program dijalankan.
char[][] papan = new char[3][3];
Membuat array dua dimensi 3x3 untuk papan permainan Tic-Tac-Toe.
Setiap elemen dalam array menyimpan karakter yang mewakili kotak dalam papan ('X', 'O', atau '-' untuk kosong).
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        papan[i][j] = '-';
    }
}
Loop for bersarang digunakan untuk mengisi setiap sel dalam papan dengan '-', menandakan bahwa papan kosong.
papan[0][0] = 'X';
papan[1][1] = 'O';
papan[2][2] = 'X';
Pemain X menempatkan tanda di baris 0, kolom 0.
Pemain O menempatkan tanda di baris 1, kolom 1.
Pemain X menempatkan tanda lagi di baris 2, kolom 2.
Hasil papan setelah langkah ini:
X - -
- O -
- - X
System.out.println("Status Papan:");
tampilkanPapan(papan);
Memanggil metode tampilkanPapan(papan) untuk mencetak status papan ke layar.
public static void tampilkanPapan(char[][] papan) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(papan[i][j] + " ");
        }
        System.out.println();
    }
}
Loop for bersarang digunakan untuk mencetak isi papan baris per baris.
Setiap elemen dipisahkan dengan spasi (+ " ") untuk tampilan lebih rapi.
Saat program dijalankan, output yang dihasilkan adalah:
Status Papan:
X - -
- O -
- - X


Penjelasan OperasiMatriks

public class OperasiMatriks {
    public static void main(String[] args) {
public class OperasiMatriks → Mendeklarasikan kelas OperasiMatriks.
public static void main(String[] args) → Metode utama yang akan dieksekusi saat program dijalankan.
int[][] matriksA = {
    {1, 2, 3},
    {4, 5, 6}
};

int[][] matriksB = {
    {7, 8, 9},
    {10, 11, 12}
};
Matriks A:
1  2  3
4  5  6
Matriks B:
7   8   9
10 11  12
int[][] hasil = new int[2][3];
Matriks hasil memiliki ukuran 2x3, sama dengan matriks A dan B.
for (int i = 0; i < matriksA.length; i++) {
    for (int j = 0; j < matriksA[0].length; j++) {
        hasil[i][j] = matriksA[i][j] + matriksB[i][j];
    }
}
Loop for pertama (i) → Iterasi setiap baris.
Loop for kedua (j) → Iterasi setiap kolom dalam baris.
Operasi penjumlahan:

hasil[i][j] = matriksA[i][j] + matriksB[i][j];
Setiap elemen dari matriksA dijumlahkan dengan elemen dari matriksB.
Hasilnya:

  (1+7)   (2+8)   (3+9)   →   8   10   12
 (4+10)  (5+11)  (6+12)   →  14   16   18
 System.out.println("Hasil penjumlahan matriks:");
for (int[] baris : hasil) {
    for (int nilai : baris) {
        System.out.print(nilai + " ");
    }
    System.out.println();
}
Loop for-each pertama → Iterasi setiap baris matriks hasil.
Loop for-each kedua → Mencetak setiap elemen dalam baris.
Saat kode dijalankan, output yang dihasilkan adalah:
Hasil penjumlahan matriks:
8 10 12
14 16 18