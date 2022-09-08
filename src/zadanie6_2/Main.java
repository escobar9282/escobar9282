package zadanie6_2;

public class Main {
    public static void main(String[] args) {
        FileAdder fileAdder = new FileAdder();
        int[][] matrix4 = new int[10][10];
        fileAdder.readData(matrix4);
        fileAdder.saveDataToFile(matrix4 , 10);
        fileAdder.readDataFromFile(matrix4, 10);
    }
}
