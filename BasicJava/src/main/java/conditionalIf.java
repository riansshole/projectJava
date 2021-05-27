import java.util.Scanner;

public class conditionalIf {
    public static void main(String[] args) {

        //Membuat variable belanja dengan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        //Mengambil input
        System.out.print("Total belanjaan: Rp.");
        belanja = scan.nextInt();

        // cek apakah dia belanja di atas 100.000
        if(belanja>100000){
            System.out.println("Selamat, anda mendapatkan diskon!");
        }

        System.out.println("Terima kasih...");
    }
}
