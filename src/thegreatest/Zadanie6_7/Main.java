package thegreatest.Zadanie6_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Apply string is empty");
        String assemble = bufferedReader.readLine();
        if (assemble.isEmpty()) {
            System.out.println("Chain is empty");
        }
        else {
            System.out.println("Chain is not empty");
        }
    }
}
