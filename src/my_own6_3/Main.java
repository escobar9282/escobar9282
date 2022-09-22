package my_own6_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
Reorder reorder = new Reorder();
reorder.readingDownData();
reorder.transformingData();
reorder.writingDownTransformedData();
reorder.readingDownDataFromFile();
    }
}
