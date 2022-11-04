package thegreatest.listing3_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> titular = Arrays.asList("Adam", "Ewa", "Katarzyna", "Bartosz", "Jakub", "Slawomir", "Magdalena");
        System.out.println("The list before sorting. ");
        System.out.println(titular);

        Collections.sort(titular, new ExampleOfComparator.comparator());

        System.out.println("List after reversed sorting. ");
        System.out.println(titular);
    }



}
