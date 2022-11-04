package thegreatest.listing3_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> givenNames = Arrays.asList("George", "Paul", "Andrew", "Henry", "Maureen", "Richard", "Charles");

        Collections.sort(givenNames, String::compareTo);
        System.out.println("Sorting the list by natural order");

        System.out.println(givenNames);
    }
}
