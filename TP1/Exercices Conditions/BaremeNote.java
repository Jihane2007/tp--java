import java.util.Scanner;

public class BaremeNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la note (0-20): ");
        double note = sc.nextDouble();

        if (note < 0 || note > 20) {
            System.out.println("Note invalide.");
        } else {
            char grade;
            if (note >= 16) grade = 'A';
            else if (note >= 14) grade = 'B';
            else if (note >= 12) grade = 'C';
            else if (note >= 10) grade = 'D';
            else grade = 'F';
            System.out.println("Grade: " + grade);
        }
        sc.close();
    }
}
