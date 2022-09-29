package cwiczenie_011;

public class Keynote2 implements Runnable {
    public Thread thread;
    public Keynote2(final String name) {
    thread = new Thread(this, name);
    thread.start();
    }

    @Override
    public void run() {
        double height = 20.99911;
        double width = 40.190187;
        double rectangleArea = height * width;
        double rectanglePerimeter = 2 * height + 2 * width;
        System.out.println("thread number " + thread.getName() + " rectanglePerimeter = " + rectanglePerimeter);
        System.out.println("thread number " + thread.getName() + " rectangleArea = " + rectangleArea);
    }
}
