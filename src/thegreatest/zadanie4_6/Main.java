package thegreatest.zadanie4_6;

public class Main {
    public static void main(String[] args) {
        char data[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
        System.out.print("Normal sequence of signs: ");
        System.out.println(data);
        for (int i = 0, j = data.length - 1; i < j; i++, j--) {
            char tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
        System.out.print("Reversed sequence of signs: ");
        System.out.println(data);
    }
}
