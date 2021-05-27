import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========SIMPLE CALCULATOR==========");
        System.out.println("=====================================");
        @SuppressWarnings("resource") //

        Scanner input = new Scanner(System.in);

        System.out.println("Input value 1: ");
        double value1 = input.nextDouble();

        System.out.println("Input Operator (+, -, *, /, %): ");
        String operator = input.next();

        System.out.println("Input value 2: ");
        double value2 = input.nextDouble();

        try{
            double result = new Main().getResult(value1, value2, operator);
            DecimalFormat formatdecimal = new DecimalFormat("#.##");
                String formattedresult = formatdecimal.format(result);

                System.out.println("Hasil perhitungan dari " + value1 + operator + value2 + " adalah "+ formattedresult+".");
        } catch (IllegalArgumentException e){
            System.out.println("Operator yang Anda masukkan salah!");
        }
    }
    private double getResult(double value1, double value2, String operator){
        return switch (operator) {
            case "+" -> value1 + value2;
            case "-" -> value1 - value2;
            case "*" -> value1 * value2;
            case "/" -> value1 / value2;
            case "%" -> value1 % value2;
            default -> throw new IllegalArgumentException();
        };
    }
}
