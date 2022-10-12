package thegreatest.cwiczenie3_2;

public class Main {
    public static void main(String[] args) {
        char[] inscription = {'I', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'y', 'k', 'a'};
        System.out.println("vertically: ");
        for (char sign:inscription)
            System.out.println(sign);
        System.out.println();
        System.out.print("Scattered: ");
        for (char sign : inscription)
            System.out.println(sign + " ");
        System.out.println();
        System.out.print("Big letters");
        for (char sign : inscription)
            System.out.println(Character.toUpperCase(sign));
    }
}
