public class LogikaNot {
    public static void main(String[] args) {
        //Logika NOT membalikkan value boolean
        boolean value1 = true;
        boolean value2 = false;

        System.out.println(!value1);
        System.out.println(!value2);

        int age = 22;
        System.out.println(!(age > 10 && age < 10));
    }
}
