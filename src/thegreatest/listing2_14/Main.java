package thegreatest.listing2_14;

import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        Vector statisticalVector = new Vector<>();

        for (int i = 0; i < 15; i++)
        {
            statisticalVector.add(i, i + 1);

            System.out.println("Vector has got size = " + statisticalVector.size() +  "\nVector's capacity = " + statisticalVector.capacity() + "\nVectors content" + statisticalVector.toString());
        }


    }
}
   /*
    Umieść w kolekcji Vector() 15 liczb całkowitych. Prześledź „dynamicznie”
        jej rozmiar, pojemność i zawartość.

    */