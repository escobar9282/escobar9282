package thegreatest.zadanie7_9;

public class ThisNewThread implements Runnable {
    protected Thread thread;
    protected volatile boolean stopped;
    protected volatile boolean suspended;

    public ThisNewThread(String name) {
        thread = new Thread(this, name);
        stopped = false;
        suspended = false;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Started Thread number one " + thread.getName());
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.print(i + " ");
                if (i%20 == 0) {
                    Thread.sleep(1200);
                }
                System.out.println();
                synchronized (this) {

                    while (suspended) {
                        wait();
                    }
                    if (stopped) {
//                        break;
                    }
                }

            }

        }
        catch (InterruptedException e) {
            System.out.println("Doesn't matter");

        }
        System.out.println("Thread was terminated " + thread.getName());
    }


    protected synchronized void suspendThread() {
        suspended = true;
    }
    protected synchronized void stopThread() {
        stopped = true;
        suspended = false;
        notify();
    }
    protected synchronized void renewal() {
        suspended = false;
        notify();
    }
}
