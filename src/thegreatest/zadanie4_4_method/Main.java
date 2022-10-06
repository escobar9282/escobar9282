package thegreatest.zadanie4_4_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter sequence of chars: ");
        String str = br.readLine();
        char[]chars = str.toCharArray();
        try {
            for (char aChar : chars) {
                if (aChar < 65 || aChar > 122 || (aChar > 90 && aChar < 97)) {
                    throw new InputMissmatchException(aChar);
                }
            }
            BigLetter bigLetter = new BigLetter(str);
            System.out.println("\nResult: " + bigLetter.sizeOfLetterIsBeingChanged());
        }
        catch (InputMissmatchException i ) {
            System.out.println(i.getMessage());
        }
    }
}
