import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Longueur a: "); double a = sc.nextDouble();
        System.out.print("Longueur b: "); double b = sc.nextDouble();
        System.out.print("Longueur c: "); double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Longueurs doivent être > 0.");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Triangle invalide.");
        } else if (a == b && b == c) {
            System.out.println("Triangle équilatéral.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triangle isocèle.");
        } else {
            System.out.println("Triangle scalène.");
        }
        sc.close();
    }
}
