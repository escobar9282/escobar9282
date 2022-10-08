package thegreatest.zadanie6_3;

public class Main {
    public static void main(String[] args) {
        boolean [] bool = {true, false};
        System.out.println("First Law of De Morgan's");
        for (boolean p:bool) {
            for (boolean q:bool){
                System.out.println(!(p && q)==(!p || !q));
            }

        }
        System.out.println("Second Law of DeMorgan's");
        for (boolean p: bool){
            for (boolean q:bool) {
                System.out.println(!(p || q)==(!p && !q));
            }
        }
    }
}
