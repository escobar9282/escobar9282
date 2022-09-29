package cwiczenie7_6;

public class Bond implements  Runnable {
    protected Thread thread;
    static SumArray sumArray = new SumArray();
    protected int[] array;

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
