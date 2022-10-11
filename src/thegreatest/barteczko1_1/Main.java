package thegreatest.barteczko1_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Set<String> cap = new HashSet<>(Arrays.asList("praga", "bratyslawa", "moskwa", "berlin", "kijow", "wilno", "minsk"));
        Set<String>entered = new HashSet<>();
        showMessageDialog(null, "Put in capital cities of our landmark neighbours");
        int count = 0;
        stopwatch.start();
        for (int n = cap.size(); count < n;) {
            String in = showInputDialog("Answers: " + count + "/" + n + '\n' + "Enter next capital city:");
            if (in == null)
                break;
            in =in.toLowerCase();
            if (!entered.contains(in)  && cap.contains((in))) {
                count++;
                entered.add(in);
            }
        }
    }
}
