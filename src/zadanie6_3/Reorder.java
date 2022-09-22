package zadanie6_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reorder {
    int size = 10;
    int firstBoard[][] = new int[10][10];
    int secondBoard[][] = new int[10][10];
    int thirdBoard[][] = new int[10][10];

    void readDownData() {
        System.out.println("\nWe're creating first board\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 1) {
                    firstBoard[i][j] = 1;
                } else {
                    firstBoard[i][j] = 0;
                }
                System.out.print(firstBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    void reorderData() {
        System.out.println("\nWe're reordering from first board to second board\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                secondBoard[i][j] = firstBoard[j][i];
            }

        }
    }
    void savingReorderedData() throws IOException {
        System.out.println("\nWe're saving reordered board\n");
        FileWriter fw = new FileWriter("H:\\Java files\\dane6_3.txt");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fw.write(String.valueOf(secondBoard[i][j]));
                System.out.print(secondBoard[i][j] + " ");
            }
            System.out.println();
        }
        fw.close();
    }
    void readDownDataFromFile() throws IOException {
        System.out.println("\nWe're reading data from file\n");
        FileReader fr = new FileReader("H:\\Java files\\dane6_3.txt");
        BufferedReader br = new BufferedReader(fr);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                thirdBoard[i][j] = Character.getNumericValue(br.read());
                System.out.print(thirdBoard[i][j] + " ");
            }
            System.out.println();
        }
        br.close();
    }
}
