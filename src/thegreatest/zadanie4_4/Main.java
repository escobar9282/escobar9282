package thegreatest.zadanie4_4;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String string = "programowanie";
        System.out.println(string.toUpperCase(Locale.ROOT));
        System.out.println();
        System.out.println(string.replace('p', 'P'));
    }
}
