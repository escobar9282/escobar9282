package thegreatest.barteczko1_0;

class Timer implements Runnable {
    @Override
    public void run() {
        int time = 0;
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Wątek zlicznia czasu został przerwany.");
                return;
            }
            time++;
            int minutes = time/60;
            int sec = time;
            System.out.println(minutes + "" + sec);
        }
    }
}
