package zadanie6_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reorder reorder = new Reorder();
        reorder.readDownData();
        reorder.reorderData();
        reorder.savingReorderedData();
        reorder.readDownDataFromFile();
    }
}
