public class MatriksPerkalian { // Mendeklarasikan kelas bernama MatriksPerkalian

    public static void main(String[] args) { // Metode utama, titik awal program
        int[][] matrix1 = { // Mendeklarasikan dan menginisialisasi matriks pertama
            {5, 2},
            {3, 9}
        };

        int[][] matrix2 = { // Mendeklarasikan dan menginisialisasi matriks kedua
            {7, 8},
            {5, 6}
        };

        int[][] result = perkalianMatriks(matrix1, matrix2); // Memanggil metode perkalianMatriks untuk menghitung hasil perkalian

        System.out.println("Hasil perkalian matriks: "); // Menampilkan pesan untuk hasil perkalian
        for (int i = 0; i < result.length; i++) { // Loop melalui setiap baris matriks hasil
            for (int j = 0; j < result[i].length; j++) { // Loop melalui setiap kolom matriks hasil
                System.out.print(result[i][j] + " "); // Mencetak elemen hasil perkalian diikuti oleh spasi
            }
            System.out.println(); // Mencetak baris baru setelah setiap baris matriks hasil
        }
    }

    public static int[][] perkalianMatriks(int[][] firstMatrix, int[][] secondMatrix) { // Metode untuk menghitung perkalian dua matriks
        int baris1 = firstMatrix.length; // Mengambil jumlah baris dari matriks pertama
        int kolom1 = firstMatrix[0].length; // Mengambil jumlah kolom dari matriks pertama
        int kolom2 = secondMatrix[0].length; // Mengambil jumlah kolom dari matriks kedua
        int[][] result = new int[baris1][kolom2]; // Mendeklarasikan matriks baru untuk menyimpan hasil perkalian

        for (int i = 0; i < baris1; i++) { // Loop melalui setiap baris matriks pertama
            for (int j = 0; j < kolom2; j++) { // Loop melalui setiap kolom matriks kedua
                result[i][j] = 0; // Menginisialisasi elemen hasil dengan nol
                for (int k = 0; k < kolom1; k++) { // Loop untuk melakukan perkalian dan penjumlahan elemen
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j]; // Menghitung elemen hasil perkalian
                }
            }
        }
        return result; // Mengembalikan hasil perkalian matriks
    }
}