import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {

        java.util.TreeMap <Integer, String> hari = new java.util.TreeMap<>();

        hari.put(1, "Senin");
        hari.put(2, "Selasa");
        hari.put(3, "Rabu");
        hari.put(4, "Kamis");
        hari.put(5, "Jum'at");
        hari.put(6, "Sabtu");
        hari.put(7, "Minggu");

        //me-print data
        //mengambil data berdasarkan semua data
        for(Map.Entry<Integer,String> hariEntry : hari.entrySet()){
            System.out.println("Key: " + hariEntry.getKey() + " Data: " + hariEntry.getValue());
        }
        System.out.println("\n");
        System.out.println("print data berdasarkan kunci");
        int key = 5;
        System.out.println("Key: " + key + " Data: " + hari.get(key));

        System.out.println("\n");
        System.out.println("Mencari data berdasarkan value");
        //mencari data
        //berdasarkan value

        int carikey = 6;
        if(hari.containsKey(carikey)){
            System.out.println("Key: " + carikey + ". Data: " + hari.get(carikey));
        } else {
            System.out.println("Key tidak terdaftar");
        }
    }
}
