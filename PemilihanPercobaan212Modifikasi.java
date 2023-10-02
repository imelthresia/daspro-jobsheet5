import java.util.Scanner;

public class PemilihanPercobaan207Modifikasi {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.println("Masukkan Nilai UAS   : " );
        float UAS = input07.nextFloat();
        System.out.println("Masukkan Nilai UTS   : " );
        float UTS = input07.nextFloat();
        System.out.println("Masukkan Nilai Kuis  : ");
        float Kuis = input07.nextFloat();
        System.out.println("Masukkan Nilai Tugas : ");
        float Tugas = input07.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.2F);
       
        if (total >= 80) 
        System.out.println("A (setara 4) = Sangat Baik");
       else if (total >= 73) 
            System.out.println("B+ (setara 3,5) = Lebih dari Baik");
         else   if (total >= 65) 
                System.out.println("B (setara 3) = Baik");
            else    if (total >= 60) 
                    System.out.println("C+ (setara 2,5)= Lebih dari Cukup");
              else    if (total >= 50) 
                    System.out.println("C (setara 2) = Cukup");
                else  if (total >= 39 ) 
                        System.out.println("D (setara 1) = Kurang");
                        else if (total <= 39 ) 
                            System.out.println("E (setara 0) = Gagal");


    }
}
