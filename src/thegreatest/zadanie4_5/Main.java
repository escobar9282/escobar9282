package thegreatest.zadanie4_5;

public class Main {
    public static void main(String[] args) {
        char dane[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
        System.out.print("Normal sequence of characters: ");
        System.out.println(dane);
        System.out.print("Reversed sequence of characters: ");
        for (int i = dane.length - 1; i >= 0; i--)
            System.out.print(dane[i]);
        System.out.println();
    }
}
