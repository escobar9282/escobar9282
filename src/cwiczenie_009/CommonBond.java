package cwiczenie_009;

public class CommonBond implements Runnable {
    @Override
    public void run() {
        int i = 50;
        try{
            do {
                System.out.println("Number of [i]= " + i);
                Thread.sleep(1500);
                i--;
            }
            while (i>=11);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
