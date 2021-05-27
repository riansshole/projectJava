import java.util.Scanner;

public class membuatArrayMultiDimensi {
    public static void main(String[] args) {

        String[][] NamaKontak;
        NamaKontak = new String[][]{
                {"Yudi", "0812384592342", "Depok"},
                {"Vidi", "081293488933", "Jakarta Barat"},
                {"Vinka", "085155438238", "Bekasi"},
                {"Wahyu", "085152313820", "Tangerang"},
                {"Ilham", "081231235435", "Riau"},
        };
        System.out.println("=====CARA MUDAH=====");
        for(int i = 0; i < NamaKontak.length; i++){
            System.out.println("Indeks ke-"+i+": "+ NamaKontak[i]);
        }

        //Membuat array dengan scanner
        System.out.println("=====MEMBUAT PROGRAM ARRAY DENGAN SCANNER=====");
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);

        //Mengisi tiap meja
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja.length; kol++) {
                System.out.format("Siapa yang akan mengisi meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
            }
        }
        // menampilkan isi array
        System.out.println("-----------------------");
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja.length; kol++){
                System.out.format("| %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-----------------------");

    }
}
