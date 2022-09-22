package zadanie6_2_002;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int size = 10;
        int table[][] = new int[size][size];
        Service service = new Service();
        service.readData(table, size);
        service.writeDownDataToFile(table, size);
        service.readDownDataFromFile(table, size);
    }
}
