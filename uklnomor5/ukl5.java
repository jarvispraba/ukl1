import java.util.Scanner;

public class ukl5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int jumlahSiswa = input.nextInt();

        double[] nilai = new double[jumlahSiswa];
        double total = 0;

        for (int j = 0; j < jumlahSiswa; j++) {
            System.out.print("Masukkan nilai siswa ke-" + (j + 1) + ": ");
            nilai[j] = input.nextDouble();
            total += nilai[j];
        }

        double rataRata = total / jumlahSiswa;

        // tampilkan hasil
        System.out.println("Hasil Perhitungan");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}
