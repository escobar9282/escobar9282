package thegreatest.listing2_8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List list = new LinkedList<>();

        for (char sign = 'A'; sign <= 'Z'; sign++)
        {
            list.add(sign);
        }

        System.out.print("Items from A to Z. ");
        list.forEach(e -> System.out.print(e + ", "));

        Collections.reverse(list);

        System.out.println();

        System.out.print("Items from Z to A. ");
        list.forEach(e -> System.out.print(e + ", "));
    }
}
