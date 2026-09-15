import java.util.Scanner;


public static void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Adjon meg egy stringet: ");
    String str = scanner.nextLine();

    System.out.println("Adjon meg egy karaktert: ");
    String char1 = scanner.nextLine();

    System.out.println("Adjon meg egy karatkert: ");
    String char2 = scanner.nextLine();

    System.out.println("Adjon meg egy integert: ");
    int int1 = scanner.nextInt();


    System.out.println("Adjon meg egy integert: ");
    int int2 = scanner.nextInt();

    System.out.println("Adjon meg egy doublet: ");
    double d1 = scanner.nextDouble();

    System.out.println("Adjon meg egy doublet: ");
    double d2 = scanner.nextDouble();


    String fuzo = str + char1 + char2;
    System.out.println(fuzo);

    int osztas = int1 / int2;
    System.out.println(osztas);

    double osszead = d1 + d2;
    System.out.println(osszead);

    double kivon = int1 - d1;
    System.out.println(kivon);

    double osszeszoroz = int2 * d2;
    System.out.println(osszeszoroz);
}