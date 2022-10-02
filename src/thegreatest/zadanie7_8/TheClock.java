package thegreatest.zadanie7_8;

public class TheClock {
    synchronized void scoreOfTheClock(boolean running) {
        if (!running){
            notify();
            return;
        }
        System.out.println("Tik");
        notify();
        try {
            Thread.sleep(2000);
            wait();
        }
        catch (InterruptedException e) {
            e.getCause();
        }
    }

    synchronized void scoreOfTheClock2(boolean running) {
        if (!running){
            notify();
            return;
        }
        System.out.println("Tak");
        notify();
        try {
            Thread.sleep(2000);
            wait();
        }
        catch (InterruptedException e) {
            e.getCause();
        }
    }

}
