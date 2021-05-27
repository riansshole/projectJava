import java.util.Scanner;

public class tugasKategoriDerajat {
    public static void main(String[] args) {

        //membuat variable dan scanner
        double suhu;
        String kategori;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Masukkan suhu: ");
        suhu = scan.nextInt();

        //pengelompokan suhu
        if(suhu <= 0){
            kategori = "Beku";
        }else if(suhu <= 10){
            kategori = "Dingin";
        }else if(suhu <= 20){
            kategori = "Sejuk";
        }else if(suhu <= 25){
            kategori = "Sedang";
        }else if(suhu <= 99){
            kategori = "Panas";
        }else{
            kategori = "Mendidih";
        }
        //mencetak hasil

        System.out.println("Suhu :"+ suhu + "\nTermasuk kategori: "+ kategori);
    }
}
