package belajarOOP;

public class player {

    // definisi atriubt
    String name;
    int speed;
    int healthPoin;

    // definisi method run
    void run(){
        System.out.println(name +" is running..");
        System.out.print("Speed: "+ speed);
    }

    // definisi method isDead untuk mengecek nilai healthPoint

    boolean isDead(){
        if(healthPoin<=0) return true;
        return false;
        }
}

