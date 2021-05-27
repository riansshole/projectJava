import java.util.HashMap;
import java.util.Map;

public class BukuHashMap {
    public static void main(String[] args) {

        //membuat objek hasmap
        HashMap<String, Buku> books = new HashMap<>();

        //membuat objek buku
        Buku bukuJava = new Buku("Tutorial java", "Petani Kode");
        Buku bukuKotlin = new Buku("Permrograman Kotlin", "Petani Kode");
        Buku bukuAndroid = new Buku("Pemrogoraman Android", "Petani Kode");

        //mengisi objek hashmap dengan objek buku
        books.put("Java", bukuJava);
        books.put("Kotlin", bukuKotlin);
        books.put("android", bukuAndroid);

        //cetak semua buku
        for (Map.Entry b: books.entrySet()) {
            Buku buku = (Buku) b.getValue();
            System.out.println(b.getKey() + ": " + buku.getTitle());
        }
    }
}
