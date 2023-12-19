package Cap6;

import javax.swing.*;
public class Questao3 {
    public static void main(String[] args) {

        double[] saldos = new double[20];

        for (int i = 0; i < saldos.length; i++) {
            saldos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo do cliente " + (i + 1)));
        }

        for (double saldo : saldos) {
            JOptionPane.showMessageDialog(null, "Saldo: " + String.format("%.2f", saldo));
        }
    }
}
