package thegreatest.cwiczenie3_4;

public class Main {
    public static void main(String[] args) {
        char[] data = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
        System.out.print("Normal distribution of sign sequence: ");
        System.out.println(data);
        System.out.print("Conversely sequence of signs: ");
        for (int i = data.length - 1; i >= 0; i--)
            System.out.print(data[i]);
        System.out.println();
    }
}

