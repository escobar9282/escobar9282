package thegreatest.zadanie5_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> argos = new ArrayList<>();
        argos.add("exhaust");
        argos.add("adhere");
        argos.add("implicates");
        argos.add("put on");
        argos.add("occupy");

        int i = 0;

        do {
            System.out.println(turnedDown(argos.get(i)));
            i++;
        }
        while (i < argos.size());
    }

    private static  String turnedDown(String parameter) {
        char[] chars = parameter.toCharArray();

       StringBuilder result = new StringBuilder();

        for (int i = chars.length - 1; i >=0; i--) {
            result.append(chars[i]);
        }

        return result.toString();
    }
}
