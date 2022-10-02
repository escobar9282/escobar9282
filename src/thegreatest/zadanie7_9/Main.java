package thegreatest.zadanie7_9;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        ThisNewThread newThread = new ThisNewThread("name one");
        tryCatch(newThread);
    }

    protected static void tryCatch(ThisNewThread newThread) {
        try {
            sleep(4000);
            newThread.suspendThread();
            System.out.println("Thread was suspended");
            sleep(4000);
            newThread.renewal();
            System.out.println("Thread was renowned");
            sleep(4000);
            sleep(4000);
            newThread.suspendThread();
            System.out.println("Thread was suspended");
            sleep(4000);
            newThread.renewal();
            System.out.println("Thread was renowned");
            sleep(4000);
            newThread.suspendThread();
            newThread.stopThread();
            System.out.println("Thread was terminated");
        } catch (InterruptedException interruptedException) {
            interruptedException.getStackTrace();
        }
        try {
            newThread.thread.join();
        }
        catch (InterruptedException exception) {
            exception.getLocalizedMessage();
        }
        System.out.println("Everything was executed");
    }
}
