package thegreatest.listing2_11;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)
    {
        Set<Integer> firstSetOfValues = new TreeSet<>();
        firstSetOfValues.add(12599);
        firstSetOfValues.add(1200);
        firstSetOfValues.add(124);
        firstSetOfValues.add(35);

        System.out.println("Set has following items: ");
        for (var item : firstSetOfValues)
        {
            System.out.println(item);
        }

        System.out.println("Amount of items in set: " + firstSetOfValues.size() + ".");
        firstSetOfValues.remove(1200);
        System.out.println("Amount of items in the set\n after removing figure 1200: " + firstSetOfValues.size() + ".");

        firstSetOfValues.clear();

        System.out.println("Removed all items from set.");

        System.out.println("Final figure of items in set: " + firstSetOfValues.size() + ".");
    }
}
