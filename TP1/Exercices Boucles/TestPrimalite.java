import java.util.Scanner;

public class TestPrimalite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez n: ");
        int n = sc.nextInt();

        if (n <= 1) System.out.println(n + " n'est pas premier.");
        else if (n == 2) System.out.println("2 est premier.");
        else if (n % 2 == 0) System.out.println(n + " n'est pas premier.");
        else {
            boolean premier = true;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) { premier = false; break; }
            }
            System.out.println(n + (premier ? " est premier." : " n'est pas premier."));
        }
        sc.close();
    }
}
