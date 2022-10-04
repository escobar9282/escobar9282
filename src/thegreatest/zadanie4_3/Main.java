package thegreatest.zadanie4_3;

public class Main {
    public static void main(String[] args) {
        String string = "Dzień Dobry";
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
    }
}
