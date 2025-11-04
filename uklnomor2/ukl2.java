import java.util.Scanner;

public class ukl2 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

System.out.println("Masukan Angkamu : ");
int angka = input.nextInt();

if (angka % 2 == 0){
System.out.println("Maka Angkamu Genap");
}

else {
System.out.println("Maka Angkamu Ganjil");
}
    }
    }