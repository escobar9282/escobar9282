package thegreatest.zadanie7_8;

public class DiscussionThread implements Runnable {
    protected Thread thread;
    protected TheClock theClock;

    public DiscussionThread(TheClock theClock, String name) {
        thread = new Thread(this, name);
        this.theClock = theClock;
        thread.start();
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("discussion thread1") == 0) {
            for (int i = 0; i < 10; i++) {
                theClock.scoreOfTheClock(true);
            }
            theClock.scoreOfTheClock(false);
        } else {
            for (int i = 0; i < 10; i++) {
                theClock.scoreOfTheClock2(true);
            }
            theClock.scoreOfTheClock2(false);
        }
    }
}
