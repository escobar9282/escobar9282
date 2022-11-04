package thegreatest.listing2_15;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {
        Stack pile = new Stack<>();

        for (char c = 'A'; c <= 'Z'; c++)
        {
            pile.push(c);
        }
        try
        {
            System.out.print("Find letter A position is: ");
            Thread.sleep(5000);
            System.out.println(pile.search('A'));
            Thread.sleep(1600);
            System.out.print("Last letter of stack is: ");
            Thread.sleep(5000);
            System.out.println(pile.peek());
        }
        catch(InterruptedException e)
        {
            e.getMessage();
        }
    }
}

/*
Napisz program, który korzystając z właściwości kolekcji Stack(), umieszcza w tej
 kolekcji litery alfabetu od A do Z. Dodatkowo, korzystając z metody search(),
  znajdź/ustal, na jakiej pozycji znajduje się litera A oraz jaka
litera znajduje się na wierzchu stosu.
Do ustalenia litery, jaka znajduje się na wierzchu stosu, skorzystaj z metody peek().
 */