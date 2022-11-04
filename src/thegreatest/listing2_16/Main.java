package thegreatest.listing2_16;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double pseudoClassNo;
        Random r = new Random();

        LinkedList<Integer> digit = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            pseudoClassNo = Math.round(100 * (r.nextDouble()));
            digit.add((int) pseudoClassNo);
        }
        Iterator<Integer> iteratively = digit.iterator();
        System.out.println("The pseudo class digits are being displayed from left to right: ");

        while (iteratively.hasNext())
            System.out.print(iteratively.next() + ", ");
        System.out.println();

        Iterator<Integer> integerIterator = digit.descendingIterator();
        System.out.println("The pseudo random digits are being displayed from right to left: ");

        while (integerIterator.hasNext())
            System.out.print(integerIterator.next() + ", ");
        System.out.println();
    }

}
/*
    Napisz program, który korzystając z właściwości kolekcji LinkedList(),
    umieszcza w niej 10 pseudolosowych liczb z przedziału od 1 do 100,
     a następnie wyświetla je od lewej do prawej i od prawej do lewej.
        Do wyświetlenia liczb zastosuj iterator() i descendingIterator().
 */