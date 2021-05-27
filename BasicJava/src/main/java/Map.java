import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        //membuat objek hashmap
        HashMap<Integer, String> hari = new HashMap<>();

        //mengiis hashmap hari
        hari.put(1, "Senin");
        hari.put(2, "Selasa");
        hari.put(3, "Rabu");
        hari.put(4, "Kamis");
        hari.put(5, "Jum'at");
        hari.put(6, "Sabtu");
        hari.put(7, "Minggu");

        //memanggil isi dari objek hari
        System.out.println("Isi objek dari hari: " + hari);

        //memanggil hari senin
        System.out.println("Key nomor 2 di isi oleh value: hari " + hari.get(1));

        /*
        //menghapus satu key
        hari.remove(6) ;
        System.out.println("Isi objek dari hari: " + hari);

        //menghapus semua key dari objek hari
        hari.clear();
        System.out.println("Isi objek dari hari: " + hari);
        */

        //Mengganti value bisa menggunakan .put atau .replace

        hari.put(7, "Ahad");
        System.out.println("Key nomor 7 di isi oleh value: hari " + hari.get(7));

        hari.replace(3, "Rebo");
        System.out.println("Key nomor 3 kita ganti dengan value: hari " + hari.get(3));
        System.out.println(hari);
    }
}
