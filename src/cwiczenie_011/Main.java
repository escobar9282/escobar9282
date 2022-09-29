package cwiczenie_011;

public class Main {
    public static void main(String[] args) {
        Keynote2 keynote = new Keynote2("First bond");
        Keynote2 keynote1 = new Keynote2("Second bond");
        Keynote2 keynote2 = new Keynote2("third bond");

        try {
            keynote.thread.join(800);
            Thread.sleep(1000);
            keynote1.thread.join(800);
            Thread.sleep(1000);
            keynote2.thread.join(800);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getCause();
        }
    }
}
//    Napisz program, który tworzy trzy wątki potomne.
