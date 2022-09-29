package cwiczenie7_6;

public class SumArray {
    private int sumOfNumbers;
    synchronized int sumArray(int[] array) {
        sumOfNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfNumbers = sumOfNumbers + array[i];
        }
        System.out.println("Sum of numbers equals " + sumOfNumbers + " For bond " + Thread.currentThread().getName());
        return sumOfNumbers;
    }
}
