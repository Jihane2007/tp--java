import java.util.Scanner;

public class MaxTrois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez a: "); double a = sc.nextDouble();
        System.out.print("Entrez b: "); double b = sc.nextDouble();
        System.out.print("Entrez c: "); double c = sc.nextDouble();

        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Le plus grand est: " + max);
        sc.close();
    }
}
