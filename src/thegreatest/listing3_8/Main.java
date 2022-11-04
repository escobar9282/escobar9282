package thegreatest.listing3_8;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> givenNames = Arrays.asList("George", "Paul", "Andrew", "Henry", "Maureen", "Richard", "Charles");

        for (String gN:givenNames)
        {
            System.out.println(gN);
        }
    }
}
