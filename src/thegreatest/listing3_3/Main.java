package thegreatest.listing3_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> titular = Arrays.asList("Adam", "Ewa", "Katarzyna", "Bartosz", "Jakub", "Slawomir", "Magdalena");
        Collections.sort(titular);
        System.out.println(titular);
    }
}
