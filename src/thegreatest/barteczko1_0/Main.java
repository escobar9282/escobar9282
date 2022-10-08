package thegreatest.barteczko1_0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        Set<String>cap = new HashSet<>(Arrays.asList("praga", "bratyslawa", "moskwa", "berlin", "kijow", "wilno", "minsk"));
        Set<String>entered = new HashSet<>();
        showMessageDialog(null, "Podaj stolice naszych lądowych sąsiadów");
        int count = 0;
        Timer timer = new Timer();
        Thread tt = new Thread(timer);
        tt.start();
        for (int n = cap.size(); count < n;) {
            String in = showInputDialog("Odpowiedzi " + count + "/" + n + '\n' + "Wpisz kolejną stolicę:");
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
