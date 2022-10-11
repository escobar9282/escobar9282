package thegreatest.barteczko1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("""
                Press a for adding two numbers
                Press b for subtracting numbers
                Press c for multiplication two numbers
                Press d for dividing two numbers""");
        try {
            String pressDesiredLetter = br.readLine();
            System.out.print("Enter first number: ");
            double firstNumber = Double.parseDouble(br.readLine());
            System.out.print("Enter second number: ");
            double secondNumber = Double.parseDouble(br.readLine());
            Calculator calc = new Calculator(firstNumber, secondNumber);
            final TypesOfArithmeticsOperations operations = mapStringToEnum(pressDesiredLetter);
            switch (operations) {
                case ADDING -> System.out.println(calc.addNumbers());
                case SUBTRACTING -> System.out.println(calc.subtractNumbers());
                case MULTIPLICATION -> System.out.println(calc.multiplicationNumbers());
                case DIVIDING -> System.out.println(calc.dividingNumbers());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static TypesOfArithmeticsOperations mapStringToEnum(String execute) {
        if ("a".equals(execute)) {
            return TypesOfArithmeticsOperations.ADDING;
        } else if ("b".equals(execute)) {
            return TypesOfArithmeticsOperations.SUBTRACTING;
        } else if ("c".equals(execute)) {
            return TypesOfArithmeticsOperations.MULTIPLICATION;
        } else if ("d".equals(execute)) {
            return TypesOfArithmeticsOperations.DIVIDING;
        }
        throw new InvalidOperationException();
    }
}
