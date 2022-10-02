package thegreatest.zadanie8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        List<Integer> nameOfList = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            nameOfList.add(1 + random.nextInt(1000));

        }
        for (int number:nameOfList) {
            if (number%2 ==  0) {
                one+=number;
            }
            else {
                two += number;
            }

        }
        System.out.println("Sum of even numbers " + one + " And for odd numbers " + two);
        for (int i = 0; i < nameOfList.size(); i++) {
            if (nameOfList.get(i)%2 == 0) {
                three += nameOfList.get(i);
            }
            else {
                four += nameOfList.get(i);
            }

        }
        System.out.println("Sum of even numbers " + three + " And for odd numbers " + four);
    }
}
