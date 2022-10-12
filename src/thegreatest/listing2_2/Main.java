package thegreatest.listing2_2;

public class Main {
    public static void main(String[] args) {
        int n = 100, i;
        int amountOfEvenFigures = 0;
        int amountOfOddFigures = 0;
        int[] data = new int[n];

        System.out.println("It's being sum figures even and\n odd contained in...");
        System.out.println("in range from 1 to 100 and being\n contained in the board named data");

        for (i = 1; i <= data.length; i++)
        {
            data[i - 1] = i;
        }

        for (int j : data)
        {
            if ((j % 2) == 0)
                amountOfEvenFigures += j;
            else
                amountOfOddFigures += j;
        }

        System.out.println("Amount of even figures from\n 1 to 100 amounts to " + amountOfEvenFigures + ".");
        System.out.println("Amount of odd figures from\n 1 to 100 amounts to " + amountOfOddFigures + ".");
    }
}
