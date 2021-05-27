import java.util.Scanner;

public class looping {
    public static void main(String[] args) {

        /*
        System.out.println("Looping dengan for");
        for(int i = 1; i <= 20; i+=2){
            System.out.println("Angka ganjil dari 1 - 20 adalah: " + i);
        }
        System.out.println("\n");
        for(int x = 1; x <= 10; x++){
            System.out.println("*****");
        }
        System.out.println("\n");
        System.out.println("Looping dengan for each");
        String[] nama = {"Parjo", "Budi", "Dori", "Nemo"};
        for(String x : nama){
            System.out.println("Nama: " + x);
        }

        System.out.println("\n");
        System.out.println("Uncounted loop dengan while");
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while(running){
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("Jawab [ya/tidak]");

            jawab = scan.nextLine();

            if(jawab.equalsIgnoreCase("ya")){
                running = false;
            }

            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
        System.out.println("\n");
        System.out.println("Looping dengan do");

        int angka = 0;
        do{
            System.out.println("Perulangan ke: " + angka);
            angka++;

        } while (angka <= 10);
        */
        System.out.println("\n");
        System.out.println("Nested loop");

        int x,y;

        for(x = 0; x <= 5; x++){
            for(y = 0; y <= 5; y++){
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }
    }
}
