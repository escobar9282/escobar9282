package thegreatest.barteczko1_4;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ParseInt {
    public static void main(String[] args) {
        String s1 = showInputDialog("Enter first argument");
        if (s1!=null) {
            String s2 = showInputDialog("Enter latter argument");
            if (s2 != null) {
                int I1 = Integer.parseInt(s1);
                int I2 = Integer.parseInt(s2);
                showMessageDialog(null, "Sum: " + (I1 + I2));
            }
        }
    }
}
