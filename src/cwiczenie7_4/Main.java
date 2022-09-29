package cwiczenie7_4;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        DescendantThread thread1 = new DescendantThread();
        DescendantThread thread2 = new DescendantThread();
        DescendantThread thread3 = new DescendantThread();
        thread1.isAlive();
        try {
            Thread.sleep(Duration.ofSeconds(5).toMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
//    Napisz program, który korzysta z zadania 7.3 i metody join() ,
//        aby upewnić się, że główny wątek jest ostatnim wątkiem, który się zakończy.
