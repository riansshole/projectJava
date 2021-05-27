public class membuatArray {
    public static void main(String[] args) {

        //cara membuat array
        // 1. cara pertama

        String[] nama;

        // 2. cara kedua

        String nama2[];

        // 3. cara ketiga dengan kata kunci new

        String nama3[] = new String[10]; //10 disini adalah maksimal karakter string untuk array

        // 4. Pendeklarasian array beserta isinya

        String name[] = {"Reza", "Maharudin", "Faisal"};
        int umur[] = {22, 21, 23};

        System.out.println("=====CARA SUSAH=====");
        System.out.println("System.out.println(name[0]) = " + name[0]);
        System.out.println("System.out.println(name[0]) = " + name[1]);
        System.out.println("System.out.println(name[0]) = " + name[2]);
        System.out.println("\n"); //untuk print new line
        System.out.println("=====CARA SUSAH=====");
        System.out.println("System.out.println(umur[0]) = " + umur[0]);
        System.out.println("System.out.println(umur[0]) = " + umur[1]);
        System.out.println("System.out.println(umur[0]) = " + umur[2]);
        System.out.println("\n");
        System.out.println("=====CARA MUDAH=====");
        for(int i = 0; i < name.length; i++){
            System.out.println("Indeks ke-"+i+": "+ name[i]);
        }
        System.out.println("\n");
        System.out.println("=====CARA MUDAH=====");
        for(int i = 0; i < umur.length; i++){
            System.out.println("Indeks ke-"+i+": "+ umur[i]);
        }
        System.out.println("\n");
    }
}
