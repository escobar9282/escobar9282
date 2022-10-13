package thegreatest.listing2_5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        ArrayList listing = new ArrayList();
        listing.add("Julia");
        listing.add("Jarek");
        listing.add("Martyna");
        listing.add("Kamil");
        listing.add("Genowefa");
        listing.add("Marcin");

        System.out.println("Unsorted elements.");
        for (int i = 0; i < listing.size(); i++)
        {
            if (i < listing.size() - 1)
                System.out.println(listing.get(i) + ", ");
            else
                System.out.println(listing.get(i) + ". ");
        }
        System.out.println();
        Collections.sort(listing);

        System.out.println("Sorted elements.");
        for (int i = 0; i < listing.size(); i++)
        {
            if (i < listing.size() -1)
                System.out.println(listing.get(i) + ", ");
            else
                System.out.println(listing.get(i) + ". ");
        }
        System.out.println();
    }
}
/*
Korzystając z właściwości kolekcji ArrayList(), napisz program, który do
kolekcji tego typu dodaje sześć różnych imion, a następnie je sortuje.
 */
