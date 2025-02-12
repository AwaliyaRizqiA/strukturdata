import java.util.Scanner;

public class Gaji {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Perhitungan Gaji Pegawai");
        System.out.print("Masukkan gaji pokok: Rp ");
        double gajiPokok = sc.nextDouble();
        if (gajiPokok <= 0) {
            System.out.println("Gaji pokok harus lebih dari 0.");
            return;
        }
        System.out.print("Masukkan total jam kerja: ");
        int jamKerja = sc.nextInt();
        if (jamKerja <= 0) {
            System.out.println("Total jam kerja harus lebih dari 0.");
            return;
        }
        double tunjangan = 0.2 * gajiPokok;
        double lembur = 0;
        if (jamKerja > 200) {
            lembur = (jamKerja - 200) * 2000;
        }
        double gajiSebelumPajak = gajiPokok + tunjangan + lembur;
        double pajak = 0.1 * gajiSebelumPajak;
        double gajiBersih = gajiSebelumPajak - pajak;

        System.out.println("\nRincian Gaji Pegawai:");
        System.out.printf("Gaji Pokok: Rp %, .2f%n", gajiPokok);
        System.out.printf("Tunjangan: Rp %, .2f%n", tunjangan);
        System.out.printf("Lembur: Rp %, .2f%n", lembur);
        System.out.printf("Pajak: Rp %, .2f%n", pajak);
        System.out.printf("Total Gaji Bersih: Rp %, .2f%n", gajiBersih);

    }
}