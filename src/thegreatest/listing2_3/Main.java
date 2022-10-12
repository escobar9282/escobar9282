package thegreatest.listing2_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList listing = new ArrayList<>();

        listing.add(20);
        listing.add(51);
        listing.add(-72);
        listing.add(14);
        listing.add(-4);

        System.out.println("Unsorted elements.");

        for (int i = 0; i < listing.size(); i++)
        {
            if (i < listing.size() - 1)
                System.out.print(listing.get(i) + ", ");
            else
                System.out.print(listing.get(i) + ". ");
        }

        System.out.println();
        Collections.sort(listing);

        System.out.println("Sorted elements.");
        for (int i = 0; i < listing.size(); i++)
        {
            if (i < listing.size() - 1)
                System.out.println(listing.get(i) + ", ");
            else
                System.out.println(listing.get(i) + ". ");
        }

        System.out.println();
        listing.remove(1);
        System.out.println("The second element from the list was\n excluded and were added a new one.");

        listing.add(10);
        System.out.println("Elements that were unsorted were removed from the list and there was added a new element");

        for (int i = 0; i < listing.size(); i++)
        {
            if (i < listing.size() - 1)
                System.out.println(listing.get(i) + ", ");
            else
                System.out.println(listing.get(i) + ". ");
        }
        Collections.sort(listing);

        System.out.println();
        System.out.println("List is being sorted again");

        for (int i = 0; i < listing.size(); i++)
        {
            if (i < listing.size() - 1)
                System.out.println(listing.get(i) + ", ");
            else
                System.out.println(listing.get(i) + ". ");
        }
        System.out.println();
    }
}
