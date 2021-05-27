import java.util.Scanner;

public class appGanjilGenap {
    public static void main(String[] args) {
        System.out.println("==========GANJIL - GENAP==========");

        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan: ");
        int value = input.nextInt();

        if(value % 2 > 0){
            System.out.println(value + " merupakan bilangan ganjil");
        }else{
            System.out.println(value+ " merupakan bilangan genap");
        }
    }
}
