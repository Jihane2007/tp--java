import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez n: ");
        long n = sc.nextLong();

        long x = n, steps = 0;
        System.out.print("Suite Collatz: ");
        while (x != 1) {
            System.out.print(x + " -> ");
            x = (x % 2 == 0) ? x / 2 : 3 * x + 1;
            steps++;
        }
        System.out.println("1");
        System.out.println("Nombre d'étapes: " + steps);
        sc.close();
    }
}
