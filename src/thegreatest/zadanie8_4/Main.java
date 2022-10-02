package thegreatest.zadanie8_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> card = new ArrayList<>();
        card.add("Kazimierz");
        card.add("Julia");
        card.add("Marcin");
        card.add("Lucek");
        card.add("Stachu");
        System.out.println("List of unsorted names: " + card);
        Collections.sort(card);
        System.out.println("List after sorting: " + card);
    }
}
