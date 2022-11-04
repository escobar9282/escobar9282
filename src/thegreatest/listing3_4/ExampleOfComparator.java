package thegreatest.listing3_4;

import java.util.Comparator;

class ExampleOfComparator
{
    protected static class comparator implements Comparator<String>
    {

        @Override
        public int compare(String o1, String o2)
        {
            return o2.compareTo(o1);
        }
    }
}

