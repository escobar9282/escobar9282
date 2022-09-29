package cwiczenie7_3;

public class DescendantThread implements Runnable {
    static int count = 1;
    @Override
    public void run() {

    }
    public DescendantThread() {
        run();
        System.out.println("Thread was run: " + count);
        count++;
    }
}
//    Napisz program, który tworzy trzy wątki potomne.
