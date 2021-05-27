public class Operator {
    public static void main(String[] args) {
        int value1 = 8;
        int value2 = 4;
        boolean LebihBesarDari6;

        /*
        //Operator >
        if(value1 > value2){                        //if = jika
            System.out.println("Horee anda benar!");
        } else {                                    //else = jika tidak
            System.out.println("Haduwhh.. Jawaban anda salah!");
        }
        //System.out.println(value1 > value2);


        //Operator >=
        System.out.println(value1 >= value2);

        //Operator <
        System.out.println(value1 < value2);

        //Operator <=
        System.out.println(value1 <= value2);

        //Operator ==
        System.out.println(value1 == value2);

        //Operator !=
        System.out.println(value1 != value2);
        */

        //Operator && = True apabila ada yang value nya true
        LebihBesarDari6 = (value2 > 6) && (value1++ > 6); //false && true
        System.out.println("Value 1 berjumlah " + value1);
        System.out.println("Value 2 berjumlah " + value2);
        System.out.println("Status: " + LebihBesarDari6);

        //Operator &
        LebihBesarDari6 = (value2 > 6) & (value1++ > 6); //false && true
        System.out.println("Value 1 berjumlah " + value1);
        System.out.println("Value 2 berjumlah " + value2);
        System.out.println("Status: " + LebihBesarDari6);


    }
}

