import java.util.Scanner;

public class TugasBiodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        String alamat;
        String kelamin;
        long telepon;



        System.out.println("Masukkan nama: ");
        nama = input.nextLine();
        System.out.println("Masukkan jenis kelamin(L/P): ");
        kelamin = input.nextLine();
        System.out.println("Masukkan alamat: ");
        alamat = input.nextLine();
        System.out.println("Masukkan nomor telepon (awali dengan 62): ");
        telepon = input.nextLong();

        String [] biodata = new String[4] ;
        biodata[0] = "Nama: " + nama;
        biodata[1] = "Alamat: " + alamat;
        biodata[2] = "Kelamin: " + kelamin;
        biodata[3] = "Nomor telepon: 0" + String.valueOf(telepon);
        System.out.println("\n");
        System.out.println("-----BIODATA-----");

        if(nama.isEmpty()){
            System.out.println("Nama kosong!");
        } else {
            System.out.println(biodata[0]);
        }
        if(alamat.isEmpty()){
            System.out.println("Alamat kosong!");
        } else {
            System.out.println(biodata[1]);
        }
        if(kelamin.equals("L") || (kelamin.equals("l"))) {
            System.out.println(biodata[2]);
        } else if (kelamin.equals("F") || (kelamin.equals("f"))) {
            System.out.println(biodata[2]);
        } else if (kelamin.isEmpty()) {
            System.out.println("Jenis kelamin kosong!");
        } else {
            System.out.println("Salah input jenis kelamin!");
        }
        System.out.println(biodata[3]);
        System.out.println("-----------------");
    }
}
