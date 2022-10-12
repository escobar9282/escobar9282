package thegreatest.cwiczenie5_5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("******* Programowanie *******");
        System.out.println("*  obiektowe w języku Java  *");
        String verse =     "*        Jake Leski         *";
        String text = args[0] + " " + args[1];
        int indications = verse.length() - text.length();
        String temporary = verse.substring(0, indications/2) + text;
        temporary += "klhhlhkjlkkljkjkljkj".substring(verse.length()- indications + indications/2);
        System.out.println(temporary);
        System.out.println("*****************************");
    }
}
