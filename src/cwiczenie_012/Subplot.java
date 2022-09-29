package cwiczenie_012;

public class Subplot implements Runnable {
    protected Thread thread;
    public Subplot(final String name) {
        thread = new Thread(this, name);
    }
    @Override
    public void run() {
        double height = 1001.99911;
        double width = 4015.190187;
        double rectangleArea = height * width;
        double rectanglePerimeter = 2 * height + 2 * width;
        System.out.println("thread number " + thread.getName() + " rectanglePerimeter = " + rectanglePerimeter);
        System.out.println("thread number " + thread.getName() + " rectangleArea = " + rectangleArea);
    }
}
