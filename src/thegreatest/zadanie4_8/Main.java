package thegreatest.zadanie4_8;

public class Main {
    public static void main(String[] args) {
        String numbers = "";
        for(int i = 0; i < 16; ++i)
            numbers += Character.toUpperCase(Character.forDigit(i, 16));
        System.out.print("Numbers of semiquaver system: ");
        System.out.println(numbers);
    }
}
