class Outer {
    void outerMethod(){
        System.out.println("Inside outerMethod");
        // Inner class is local to outermethod()
        class Inner{
            void innerMethod(){
                System.out.println("Inside innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}

class MethodDemo{
    public static void main(String[] args) {
        Outer x = new Outer();
        x.outerMethod();
    }
}