import java.util.Scanner;

void main() {
    //1. feladat

    Scanner scanner = new Scanner(System.in);

    System.out.println("Kérek egy nevet: ");
    String nev = scanner.nextLine();

    System.out.println("Kérek egy számot 1 és 10 között: ");
    int szam = scanner.nextInt();

    System.out.println("Kérek egy számot 10 és 90 között: ");
    int szam2 = scanner.nextInt();

    System.out.println("Hello " +nev+"!");

    //2. feladat

    double terulet = Math.pow(szam,2)*Math.PI;
    float ketto = 2;
    System.out.println("A kör területe: " + terulet);
    System.out.println("A kör területe (egész számra): " + Math.round(terulet));

    //3. feladat

    if(szam2 < 10 || szam2 > 90){
        System.out.println("A szám nem helyes.");
    }
    if(szam2 % 3 == 0 && szam2 % 5 == 0){
        System.out.println("FizzBuzz");
    }
    else if(szam2 % 3 == 0 && szam2 % 5 > 0){
        System.out.println("Fizz");
    }
    else if(szam2 % 3 > 0 && szam2 % 5 == 0){
        System.out.println("Buzz");
    }
    else{
        System.out.println(szam2);
    }

    //szorgalmi

    boolean prim = true;

    for(int i = 2; i < szam; i++){
        if(szam % i == 0){
            System.out.println("The number is not prime; it is divisible by "+i);
            prim = false;
            break;
        }
    }
    if(prim == true){
        System.out.println("A szám prím.");
    }
}
