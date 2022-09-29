package cwiczenie_008;

public class CommonThread extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Number i is [i]= " + i);
        }
    }
}
