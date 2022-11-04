package thegreatest.listing2_13;

import java.util.HashMap;


public class Main {
    public static void main(String[] args)
    {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "Jacek");
        integerStringHashMap.put(2, "Ewa");
        integerStringHashMap.put(3, "Martyna");
        integerStringHashMap.put(4, "Stachu");
        integerStringHashMap.put(5, "Zofia");

        for (Integer integer : integerStringHashMap.keySet())
        {
            System.out.println("Position = " + integer + ". " + integerStringHashMap.get(integer));
        }
    }
}
/*
        Napisz program, który tworzy strukturę HashMap do przechowywana liczb
        całkowitych i imion.
 */
