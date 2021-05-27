public class OperatorKondisi {
    public static void main(String[] args) {
        int value1 = 8;
        int value2 = 9;

        int greaterValue = ( value1 > value2) ? value1 : value2;

        System.out.println(greaterValue);

        //Pengunaannya sama seperti if else

        if(value1 > value2){
            System.out.println(value1);
        } else {
            System.out.println(value2);
        }
    }
}
