package belajarOOP;

public class Game {
    public static void main(String[] args) {

        //membuat objek player
        player cilsy = new player();

        //mengisi atribut player
        cilsy.name = "Cilsy";
        cilsy.speed = 90;
        cilsy.healthPoin = 100;

        // menjalankan method
        cilsy.run();

        if(cilsy.isDead()){
            System.out.println("\nGame Over!");
        }

    }
}
