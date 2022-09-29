package cwiczenie_007;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 9, 2, 5};
        for (int i = 1; i < numbers.length; i*=2) {
            System.out.println("i[" + numbers[i] + "]");
        }
    }
}
