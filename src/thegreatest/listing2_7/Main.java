package thegreatest.listing2_7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List roll = new LinkedList<>();

        for (char sign = 'A'; sign <= 'Z'; sign++)
        {
            roll.add(sign);
        }

        System.out.println("Items from A to Z.");
        for (int i = 0; i < roll.size(); i++)
        {
            if (i < roll.size() - 1)
                System.out.print(roll.get(i) + ", ");
            else
                System.out.print(roll.get(i) + ". ");
        }

        System.out.println();

        Collections.reverse(roll);

        System.out.println("Items from Z to A.");
        for (int i = 0; i < roll.size(); i++)
        {
            if ( i < roll.size() - 1)
                System.out.print(roll.get(i) + ", ");
            else
                System.out.print(roll.get(i) + ". ");
        }

        System.out.println();
    }
}
