package cwiczenie7_7;

import cwiczenie7_7.SumArray;

public class Bond implements  Runnable {
    public Thread thread;
     protected static SumArray sumArray = new SumArray();
    public int[] array;

    public Bond(String name, int[] array) {
        thread = new Thread(this, name);
        thread.start();
        this.array = array;
    }

    @Override
    public void run() {
        int result = sumArray.sumArray(array);
        System.out.println("Array is " + result + " For bond" + thread.getName());
    }
}
