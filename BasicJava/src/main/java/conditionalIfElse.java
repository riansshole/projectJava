import java.util.Scanner;

public class conditionalIfElse {
    public static void main(String[] args) {
        //membuat variable dan scanner
        String nama;
        int nilai;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        //cek apakah dia lulus atau tidak
        if(nilai > 70){
            System.out.println("Selamat " + nama +", anda lulus!");
        } else {
            System.out.println("Maaf, "+ nama +" anda belum lulus.");
        }
    }
}
