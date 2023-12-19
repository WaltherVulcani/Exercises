package Cap5;

import javax.swing.JOptionPane;
public class Questao8 {
    public static void main(String[] args) {

        int x = 30;
        int y = 0;

        while (x < 10) {
            x++;
            y--;

            JOptionPane.showMessageDialog(null, x + " " + y);
        }
    }
}
