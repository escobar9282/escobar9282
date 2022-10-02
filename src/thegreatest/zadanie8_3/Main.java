package thegreatest.zadanie8_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> card = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            card.add(1 + r.nextInt(100));
        }
        System.out.println("List before sorting " + card);
        Collections.sort(card);
        System.out.println("Sorted list " + card);
        card.remove(1 + r.nextInt(6));
        System.out.println("List after removal of one element " + card);
        card.add(1 + r.nextInt(1000));
        System.out.println("How the list is looking after adding one element " + card);
        Collections.sort(card);
        System.out.println("This is how the list looks after executive sorting " + card);
    }
}
