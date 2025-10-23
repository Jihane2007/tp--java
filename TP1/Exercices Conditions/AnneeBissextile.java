import java.util.Scanner;

public class AnneeBissextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une année: ");
        int an = sc.nextInt();

        boolean bissextile = (an % 4 == 0 && an % 100 != 0) || (an % 400 == 0);
        if (bissextile) System.out.println(an + " est bissextile.");
        else System.out.println(an + " n'est pas bissextile.");
        sc.close();
    }
}

