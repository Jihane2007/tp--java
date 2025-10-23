import java.util.Scanner;

public class SommeDeuxEntiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier entier a : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxième entier b : ");
        int b = sc.nextInt();

        int somme = a + b;
        System.out.println("La somme de " + a + " et " + b + " est : " + somme);

        sc.close();
    }
}
