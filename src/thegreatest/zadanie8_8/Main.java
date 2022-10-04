package thegreatest.zadanie8_8;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            characterStack.addElement(i);
        }
        System.out.println("Show Stack() " + characterStack);
        System.out.println("Letter Q " + characterStack.search('Q'));
        System.out.println("Last added element " + characterStack.peek());
    }
}
