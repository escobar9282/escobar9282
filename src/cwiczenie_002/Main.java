package cwiczenie_002;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-GB"));
        Scanner sc = new Scanner(System.in);
        double firstNumber = sc.nextDouble();
        double secondNumber = sc.nextDouble();
        System.out.println(lowerNumber(firstNumber, secondNumber));
    }

    public static double lowerNumber(double lower, double higher) {
        if (lower < higher) {
            return lower;
        } else {
            return higher;
        }
    }
}
