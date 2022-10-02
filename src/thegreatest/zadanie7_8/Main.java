package thegreatest.zadanie7_8;

public class Main {
    public static void main(String[] args) {
        TheClock theClock = new TheClock();
        DiscussionThread thread1 = new DiscussionThread(theClock,"discussion thread1");
        DiscussionThread thread2 = new DiscussionThread(theClock, "whatever");
        try {
            thread1.thread.join();
            thread2.thread.join();
        }
        catch (InterruptedException e) {
            e.getStackTrace();
        }
    }
}