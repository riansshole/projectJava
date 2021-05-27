public class anonInnerClass {
    void show(){
        System.out.println("i am in show method of supper class");

    }
}
class Flavor1Demo{
    // An anonymous class with Demo as base class
    static anonInnerClass d = new anonInnerClass(){
        void show(){
            super.show();
            System.out.println("i am in Flavor1Demo Class");
        }
    };

    public static void main(String[] args) {
        d.show();
    }
}