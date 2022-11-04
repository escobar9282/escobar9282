package thegreatest.zadanie20_1;

public class Fraction
{
    private int num;
    private int den;

    Fraction(int m, int n)
    {
        this.num = m;
        if (n != 0)
        this.den = n;
        else
            throw new IllegalArgumentException("parameter n = 0!");
    }

    @Override public String toString()
    {
        return den + "/" + num;
    }


}
