package cwiczenia_001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 5) {
            System.out.println("podana liczba to 5");

        } else {
            System.out.println("podana liczba nie równa się 5");
        }
        scanner.nextLine();
        String name = scanner.nextLine();
        if (name.length() %2 == 0) {
            System.out.println("Imie jest parzyste");
        }
        else {
            System.out.println("imie jest nieparzyste");
        }
    }
}
