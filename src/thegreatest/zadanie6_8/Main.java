package thegreatest.zadanie6_8;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        String encountered = "A\240b3&4\040";
        String inflate = "o_0+\t";
        String rejected = "#\"\304\\\344\b\n";

        List<String> stringList = new ArrayList<>();
        stringList.add(encountered);
        stringList.add(inflate);
        stringList.add(rejected);
        stringList.add("123");

        for (String element : stringList) {
            if (isDigit(element)) {
                System.out.println("String "+ element + " is digit ");
            }
            else {
                System.out.println("String " + element + " is not digit");
            }
        }
    }
    private static boolean isDigit(String parameter) {
        char[] chars = parameter.toCharArray();
        for(char eliorate:chars) {
            if (!(eliorate > 47 && eliorate < 58)) {
                return false;
            }
        }
        return true;
    }
}
