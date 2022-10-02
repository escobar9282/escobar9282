package thegreatest.zadanie8_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Double> skipList = new ArrayList<>();
        Random r = new Random();
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            skipList.add(1.0 + r.nextDouble(10000000.0));
        }
        Iterator<Double> it = skipList.iterator();
        while (it.hasNext()) {
            System.out.println("Element = " + it.next());
        }
        for (double number:skipList) {
            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}
