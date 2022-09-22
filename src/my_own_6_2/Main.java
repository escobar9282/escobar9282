package my_own_6_2;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int size = 10;
        int table[][] = new int[size][size];
        ReadWriteAndReadAndWriteFromFile readWriteAndReadAndWriteFromFile = new ReadWriteAndReadAndWriteFromFile();
        readWriteAndReadAndWriteFromFile.readDownData(table, size);
        readWriteAndReadAndWriteFromFile.writeDownDataToFile(table, size);
        readWriteAndReadAndWriteFromFile.readDownDataFromFile(table, size);
    }
}
