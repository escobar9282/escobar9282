package thegreatest.zadanie8_9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> roster = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            roster.add(1 + r.nextInt(100));
        }
        Iterator<Integer> it = roster.iterator();
        System.out.println("It is being viewed from right to left ");
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
        Iterator<Integer> itNew = roster.descendingIterator();
        System.out.println("It is being viewed from left to right ");
        while (itNew.hasNext()) {
            System.out.print(itNew.next() + ", ");
        }
        System.out.println();
    }
}
