import java.util.Scanner;

public class conditionalIfElseIf {
    public static void main(String[] args) {

        //membuat variable dan scanner
        String nama;
        double nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Masukkan nama: ");
        nama = scan.nextLine();
        System.out.print("Masukkan nilai: ");
        nilai = scan.nextDouble();

        //hitung gradenya
        if(nilai >= 90){
            grade = "A";
        }else if(nilai>=80){
            grade = "B";
        }else if(nilai>=70){
            grade = "C";
        }else if(nilai>=60){
            grade = "D";
        }else{
            grade = "E";
        }
        //mencetak hasil

        System.out.println("Nama: "+ nama + "\nGrade: "+ grade);
    }
}
