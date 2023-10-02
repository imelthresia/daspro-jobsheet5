import java.util.Scanner;

public class KodeProgramProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  basah, kering, setrikalipat;

        // Input Jenis Cucian
        System.out.println("Pilih Jenis Cucian Anda: ");
        String jeniscuci = input.next();
        System.out.println("Masukkan Berat Cucian Anda (kg): ");
        Double beratcuci = input.nextDouble();

        switch (jeniscuci) {
            case "basah":
                System.out.println("Jenis Cucian Anda Basah 4000/kg");
                break;
            case "kering":
                System.out.println("Jenis Cucian Anda Kering 4500/kg");
                break;
            case "setrikalipat":
                System.out.println("Jenis Cucian Anda Setrika Lipat 5000/kg");
                break;
            default:
                System.out.println("Penyewaan Dibatalkan");
                break;
        }
    }
}

