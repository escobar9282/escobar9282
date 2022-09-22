package zadanie6_4;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileService {
    double board[] = {89.912, 12.63, 78.091, 40.11, 22.22, 92.29};

    void writeDownDataToFile() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("H:\\Java files\\data6_4.dat", "rw");
        for (int i = 0; i < board.length; i++) {
            randomAccessFile.writeDouble(board[i]);
        }
        randomAccessFile.close();
    }

    void readDownDataFromFile() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("H:\\Java files\\data6_4.dat", "r");
        for (int i = 0; i < board.length; i += 2) {
            randomAccessFile.seek(8 * i);
            System.out.println(randomAccessFile.readDouble());
        }
        randomAccessFile.close();
    }
}
