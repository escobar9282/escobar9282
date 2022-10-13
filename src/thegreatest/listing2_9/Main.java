package thegreatest.listing2_9;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        Set<String> informationCollection = new HashSet<>();

        informationCollection.add("Malgorzata");
        informationCollection.add("Zofia");
        informationCollection.add("Katarzyna");
        informationCollection.add("Grzegorz");
        informationCollection.add("Tomasz");
        informationCollection.add("Jerzy");
        informationCollection.add("Katarzyna");

        System.out.println("Viewing all items of hash collection.");

        System.out.println(informationCollection + ".");

        System.out.println("==================================================");

        for (String set : informationCollection)
        {
            System.out.print(set.toUpperCase() + ", ");
        }

        System.out.println();

        System.out.println("==================================================");
        informationCollection.forEach(e -> System.out.print(e.toLowerCase() + ", "));
    }
}
