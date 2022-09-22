package my_own_6_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteAndReadAndWriteFromFile {
    public void readDownData(int table[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
            }
        }
    }

    public void writeDownDataToFile(int table[][], int size) throws IOException {
        FileWriter fw = new FileWriter("F:\\Dokumenty F\\Nowy folder\\Różne\\table.txt");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fw.write(String.valueOf(table[i][j]));
            }
        }
        fw.close();
    }
    public void readDownDataFromFile(int table[][], int size) throws IOException {
        FileReader fr = new FileReader("F:\\Dokumenty F\\Nowy folder\\Różne\\table.txt");
        BufferedReader br = new BufferedReader(fr);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = Character.getNumericValue(br.read());
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        fr.close();
    }
}
