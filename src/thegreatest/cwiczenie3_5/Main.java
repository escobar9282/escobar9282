package thegreatest.cwiczenie3_5;

public class Main {
    public static void main(String[] args) {
        char[] data = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
        System.out.print("Noramal alphabetical order: ");
        System.out.println(data);
        for (int i = 0, j = data.length - 1; i < j; i++, j--) {
            char temporary = data[i];
            data[i] = data[j];
            data[j] = temporary;
        }
        System.out.print("Reversed alphabetical order: ");
        System.out.println(data);
    }
}
