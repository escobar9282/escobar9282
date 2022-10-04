package thegreatest.zadanie8_7;

import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vectorField = new Vector<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            vectorField.add(-500 + random.nextInt(1000));
            System.out.println(vectorField.size() + " " + vectorField.capacity() + " " + vectorField.toString());
        }
    }
}
