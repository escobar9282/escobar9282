package thegreatest.zadanie4_3;

public class Main {
    public static void main(String[] args) {
        String string = "Good Morning";
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
    }
}
