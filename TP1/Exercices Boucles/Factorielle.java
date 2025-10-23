import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez n: ");
        int n = sc.nextInt();

        if (n < 0) System.out.println("Factorielle non définie pour n<0");
        else {
            long fact = 1;
            for (int i = 2; i <= n; i++) fact *= i;
            System.out.println(n + "! = " + fact);
        }
        sc.close();
    }
}
