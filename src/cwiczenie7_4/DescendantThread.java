package cwiczenie7_4;

import java.nio.channels.ScatteringByteChannel;
import java.time.Duration;

public class DescendantThread implements Runnable {

    DescendantThread() {
        run();

    }

    @Override
    public void run() {

    }

    public boolean isAlive() {
        try {
            Thread.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (isAlive()) {
            System.out.println("is Alive");

        }
        else {
            System.out.println("Isn't Alive");
        }
        return false;
    }
}
//    Napisz program, który korzysta z zadania 7.3 i metody join() ,
//        aby upewnić się, że główny wątek jest ostatnim wątkiem, który się zakończy.
