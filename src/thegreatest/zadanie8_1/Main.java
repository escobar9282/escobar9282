package thegreatest.zadanie8_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        double result = 0;
        double result2 = 0;
        List<Double> newAgenda = List.of(1.2547601, 2.222200011, 3.019090, 4.416321, 5.9804131);
        for (double number: newAgenda) {
            result += number;
        }
        System.out.print("Score of loop for each = " + result + " ");
        for (int i = 0; i < newAgenda.size(); i++) {
            result2 += newAgenda.get(i);
        }
        System.out.print(result2 + " ");
    }
}
