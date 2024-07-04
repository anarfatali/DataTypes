import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade: ");
        int grade = scanner.nextInt();

        if (grade >= 85 && grade <= 100) {
            System.out.println(grade + " A");
        }
        else if(grade >= 65 && grade <= 84) {
            System.out.println(grade + " B");
        }
        else if(grade >= 45 && grade <= 64) {
            System.out.println(grade + " C");
        }
        else if (grade >= 25 && grade <= 44) {
            System.out.println(grade + " D");
        }
        else if(grade < 25) System.out.println(grade + " E");
    }
}