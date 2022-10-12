package thegreatest.listing2_1;

public class Main {
    public static void main(String[] args) {
        int n = 100, i, amount = 0;
        int[] data = new int[n];
        System.out.println("Program comps amounts from one to one hundred which are contained in one dimensional board");
        System.out.println();
        for (i = 1; i <= data.length; i++)
        {
            data[i - 1] = i;
        }

        for (int j : data)
        {
            amount += j;
        }
        System.out.println("Amount of figures from 1 to 100 is " + amount + " ");
    }
}
