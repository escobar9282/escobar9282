package thegreatest.listing3_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("George", "Paul", "Andrew", "Henry", "Maureen", "Richard", "Charles");
        Collections.sort(names, new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);
    }
}
