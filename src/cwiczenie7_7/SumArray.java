package cwiczenie7_7;

public class SumArray {
    private int sumOfNumbers;
    int sumArray(int[] array) {
        synchronized (this) {
            sumOfNumbers = 0;
            for (int i = 0; i < array.length; i++) {
                sumOfNumbers = sumOfNumbers + array[i];
            }
            System.out.println("Sum of numbers equals " + sumOfNumbers + " For bond " + Thread.currentThread().getName());
            return sumOfNumbers;
        }
    }
}
