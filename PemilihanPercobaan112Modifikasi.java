import java.util.Scanner;

public class PemilihanPercobaan107Modifikasi {
public static void main(String[] args) {
    Scanner input07 = new Scanner (System.in);

    System.out.println("Masukkan Angka: ");
    int angka = input07.nextInt();
    
    String JenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
    System.out.println("Angka " + angka + " adalah bilangan " + JenisBilangan + ".");
    
}
}