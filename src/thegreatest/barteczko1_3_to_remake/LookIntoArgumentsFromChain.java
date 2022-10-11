package thegreatest.barteczko1_3_to_remake;

import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class LookIntoArgumentsFromChain {
    public static void main(String[] args) {
        String String = new String();
        String in = showInputDialog("Put in two apart arguments") +
        String; in = showInputDialog("spaces");
        if (in != null) {
            Scanner scanner = new Scanner(in);
            int sum = scanner.nextInt() + scanner.nextInt();
            showMessageDialog(null, "Sum: " + sum);
        }
    }
}
