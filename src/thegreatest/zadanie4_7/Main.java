package thegreatest.zadanie4_7;

public class Main {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < 10; ++i)
            numbers.append((char) (i + 48));
        System.out.print("Numbers of decimal numeral system: ");
        System.out.println(numbers);
    }
}
