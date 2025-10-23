import java.util.Scanner;

public class Somme1n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez n: ");
        int n = sc.nextInt();

        long sumFor = 0;
        for (int i = 1; i <= n; i++) sumFor += i;
        System.out.println("Somme avec for: " + sumFor);

        long sumWhile = 0;
        int i = 1;
        while (i <= n) { sumWhile += i; i++; }
        System.out.println("Somme avec while: " + sumWhile);

        sc.close();
    }
}
