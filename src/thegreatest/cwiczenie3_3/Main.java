package thegreatest.cwiczenie3_3;

public class Main {
    public static void main(String[] args) {
        char inscription [] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
        System.out.print("Board of characters: ");
        System.out.println(inscription);
        inscription[0] = Character.toUpperCase(inscription[0]);
        System.out.print("Prime letter is a capital letter: ");
        System.out.println(inscription);
        for (int i = 0; i < inscription.length; i++)
            inscription[i] = Character.toUpperCase(inscription[i]);
        System.out.print("All capital letters: ");
        System.out.println(inscription);
    }
}
