public class Constructor {
    private String username;
    private String password;

    public Constructor(){
        System.out.println("Ini adalah constructor");
    }
}

class DemoConstructor{
    public static void main(String[] args) {
        Constructor cilsy= new Constructor();
    }
}
