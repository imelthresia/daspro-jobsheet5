import java.util.Scanner;

public class PemilihanPercobaan3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        System.out.print("Masukkan operator (+ - * /): ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + "-" + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + "*" + angka2 + "=" + hasil);
                break;
            case '/':
            if (angka1!=0) {
                hasil = angka1 / angka2;
                System.out.println(angka1 + "/" + angka2 + "=" + hasil);
            } else {
                System.out.println("tidak bisa dibagi 0");
            }
            break;
            default:
                System.out.println("Nieprawidłowy operator.");
                break;

        }
    }
}