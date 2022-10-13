package thegreatest.listing2_4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList listing = new ArrayList();

        listing.add(20);
        listing.add(51);
        listing.add(-72);
        listing.add(4);
        listing.add(14);
        listing.add(-4);

        System.out.println("Unsorted elements.");

        listing.forEach(e -> System.out.print(e + ", "));

        System.out.println();
        Collections.sort(listing);

        System.out.println("Sorted elements.");

        listing.forEach(e -> System.out.print(e + ", "));

        System.out.println();
        listing.remove(1);
        System.out.println("One element was removed from the list and there was added new element to the listing.");

        listing.add(10);
        System.out.println("Unsorted elements after deleting from the listing and adding one new element");

        listing.forEach(e -> System.out.print(e + ", "));

        Collections.sort(listing);
        System.out.println();
        System.out.println("Renewed sorting the listing.");

        listing.forEach(e -> System.out.println(e + ", "));
    }
}
