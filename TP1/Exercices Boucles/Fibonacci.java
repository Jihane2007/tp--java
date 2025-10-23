import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Combien de termes k? ");
        int k = sc.nextInt();

        long a = 0, b = 1;
        System.out.print("Suite Fibonacci: ");
        for (int i = 1; i <= k; i++) {
            System.out.print(a + (i == k ? "\n" : ", "));
            long next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
