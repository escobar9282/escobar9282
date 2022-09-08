package zadanie6_2;

import java.io.*;
import java.util.Scanner;

public class FileAdder {
    void readData(int[][] matrix1) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j)
                    matrix1[i][j] = 1;
                else matrix1[i][j] = 0;
            }
        }
    }

    void saveDataToFile(int[][] matrix2, int size) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\Dokumenty F\\Nowy folder\\Różne\\tablica.txt"))) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    String temporaryValue = String.valueOf(matrix2[i][j]);
                    bw.write(temporaryValue);

                }
                bw.newLine();
            }
        } catch (IOException ioException) {
            System.out.println(" ");
        }
    }

    void readDataFromFile(int[][] matrix3, int size) {
        File file = new File("F:\\Dokumenty F\\Nowy folder\\Różne\\tablica.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
       /* zapisuje do pliku tekstowego dane.txt , a następnie odczytuje
        z niego zapisane dane i wyświetla je na ekranie komputera.
        Klasa powinna zawierać trzy metody z parametrami:
        •  czytaj_dane(int tablica[][], int rozmiar) — tworzy tablicę 10×10.
        •
        zapisz_dane_do_pliku(int tablica[][], int rozmiar) — metoda zapisuje
        tablicę 10×10 do pliku tekstowego o nazwie dane.txt .
        •
        czytaj_dane_z_pliku(int tablica1[][], int rozmiar) — odczytuje tablicę
        10×10 z pliku dane.txt i wyświetla ją na ekranie komputera.*/

