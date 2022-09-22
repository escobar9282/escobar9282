package my_own6_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reorder {
    int size = 10;
    int firstBoard[][] = new int[10][10];
    int secondBoard[][] = new int[10][10];
    int thirdBoard[][] = new int[10][10];

    void readingDownData() {
        System.out.println("\nWe're making up first board\n");
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

    void transformingData() {
        System.out.println("\nWe're transforming first board to second board\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                secondBoard[i][j] = firstBoard[j][i];
            }
        }
    }

    void writingDownTransformedData() throws IOException {
        System.out.println("\nWe're writing down transformed board\n");
        FileWriter fw = new FileWriter("H:\\Java files\\board6_3.txt");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fw.write(String.valueOf(secondBoard[i][j]));
                System.out.print(secondBoard[i][j] + " ");
            }
            System.out.println();
        }
        fw.close();
    }

    void readingDownDataFromFile() throws IOException {
        System.out.println("\nWe're reading down data from file\n");
        FileReader fr = new FileReader("H:\\Java files\\board6_3.txt");
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
