class Flavor2Demo {

    // An anonymouse class that implements Hello interface
    static Hello h = new Hello(){
        public void show(){
            System.out.println("i am in anonymous class");
        }
    };

    public static void main(String[] args) {
        h.show();
    }
}

interface Hello{
    void show();
}