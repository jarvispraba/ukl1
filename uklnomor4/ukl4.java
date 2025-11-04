import java.util.Scanner;

public class ukl4 {

    public static double hitungVolume(double jari, double tinggi) {
        double volume = Math.PI * jari * jari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jari Jari (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan Tinggi (cm): ");
        double t = input.nextDouble();

        double volumetabung = hitungVolume(r, t);

        System.out.println("Hasil Perhitungan");
        System.out.println("Jari-jari : " + r + " cm");
        System.out.println("Tinggi : " + t + " cm");
        System.out.println("Volume tabung : " + volumetabung + " cm");

        input.close();
    }
}