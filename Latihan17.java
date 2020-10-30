import java.util.Scanner;

/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Program Tunjangan
 */
public class Latihan17 {

    public static void main(String[] args) {

        System.out.println("========== Program Tunjangan ==========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
        int gajipokok = new Scanner(System.in).nextInt();

        System.out.print("Status anda Menikah/Tidak jawab Y/T: ");
        Scanner status = new Scanner(System.in); 
        char menikah = status.next().charAt(0);

        System.out.println("========== Hasil Perhitungan Gaji Anda ==========");
        if (menikah == 'Y') {
            System.out.println("Gaji Pokok \t: Rp." + gajipokok);
            int Tunjangan = gajipokok * 35 / 100;
            System.out.println("Tunjangan \t: Rp." + Tunjangan);
            int total = gajipokok + Tunjangan;
            System.out.println("Total Gaji \t: Rp." + total);


        } else {
            System.out.println("Gaji Pokok \t: Rp." + gajipokok);
            int Tunjangan = gajipokok * 10 / 100;
            System.out.println("Tunjangan \t: Rp." + Tunjangan);
            int total = gajipokok + Tunjangan;
            System.out.println("Total Gaji \t: Rp." + total);
        }


        

        
        




        
        
    }
}