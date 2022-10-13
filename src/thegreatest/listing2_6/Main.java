package thegreatest.listing2_6;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args)
    {
        ArrayList listing = new ArrayList<>();

        int n = 100;
        for (int i = 0; i <= n; i++)
        {
            listing.add(i);
        }

        System.out.println("All items.");

        Iterator it = listing.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }

        int amount = 0;

        for (int i = 0; i < listing.size(); i++)
        {
            amount += i;
        }

        System.out.println();
        System.out.println("Sum = " + amount + ".");
    }
}
