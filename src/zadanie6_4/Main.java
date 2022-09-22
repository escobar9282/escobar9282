package zadanie6_4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileService fileService = new FileService();
        fileService.writeDownDataToFile();
        fileService.readDownDataFromFile();

    }
}
