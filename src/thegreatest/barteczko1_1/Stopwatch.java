package thegreatest.barteczko1_1;

class Stopwatch extends  Thread{
    public void run() {
        int time = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Thread of which was counting time was stopped.");
                return;
            }
            time++;
            int minutes = time/60;
            int sec = time;
            System.out.println(minutes + ":" + sec);
        }
    }
}
