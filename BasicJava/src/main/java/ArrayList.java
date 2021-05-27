public class ArrayList {
    public static void main(String[] args) {
        String[][] name = {
                {"Rian", "Yudha"},
                {"Nino", "Ekki"}
        };

        for(int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++){
                System.out.println("Baris ke-" + i + " kolom ke-" + j + " terisi " + name[i][j]);
            }
        }
    }
}
