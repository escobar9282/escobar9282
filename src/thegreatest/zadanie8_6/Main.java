package thegreatest.zadanie8_6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> newChar = new LinkedList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            newChar.add(i);
        }
        System.out.println("Execute characters " + newChar);
        Collections.reverse(newChar);
        System.out.println("Execute characters after reverse " + newChar);
    }
}
