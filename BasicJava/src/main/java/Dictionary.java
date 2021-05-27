import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Object> item = new LinkedHashMap<>();
        String isInput = "Y";

        System.out.println("======== SIMPLE - INPUT - DATA ========");
        System.out.println("=======================================");

        while (isInput.equals("Y") || (isInput.equals("y"))){
            System.out.print("Apakah anda ingin memasukkan data barang baru? (Y/N): ");
            isInput = input.next();

            switch (isInput) {
                case "Y","y" -> {
                    new Dictionary().inputData(input, item);
                    break;
                }
                case "N","n" -> {
                    new Dictionary().showData(item);
                    break;
                }
                default -> System.out.println("Pilihan anda salah");
            }
        }
    }

    void inputData(Scanner input, Map<String, Object> item){
        System.out.print("Nama barang: ");
        input.nextLine();
        String name = input.nextLine();

        System.out.print("Jenis barang: ");
        input.nextLine();
        String jenis = input.nextLine();

        System.out.print("Jumlah: ");
        int quantity = input.nextInt();

        item.put(name, quantity);
    }
    void showData(Map<String, Object> item){
        System.out.println("======== DATA BARANG ========");
        System.out.println("=============================");

        for(String key : item.keySet()) {
            System.out.println("Nama barang: " + key + "\nJumlah: " + item.get(key) + "\n");
        }
    }
}
