package cwiczenie_012;

public class Main {
    public static void main(String[] args) {
        Subplot subplot1 = new Subplot("3");
        Subplot subplot2 = new Subplot("6");
        Subplot subplot3 = new Subplot("8");
        subplot1.thread.setPriority(Thread.MIN_PRIORITY);
        subplot2.thread.setPriority(Thread.NORM_PRIORITY);
        subplot3.thread.setPriority(Thread.MAX_PRIORITY);
        subplot1.thread.start();
        subplot2.thread.start();
        subplot3.thread.start();
        try {
            subplot1.thread.join();
            subplot2.thread.join();
            subplot3.thread.join();
        }
        catch (InterruptedException e) {
            e.getCause();
        }
    }
}
