package Cap5;

import javax.swing.JOptionPane;
public class Questao9 {
    public static void main(String[] args) {

=        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da série:"));
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            double termo = (i * i) / (i + 1);

            soma += termo;
        }

        JOptionPane.showMessageDialog(null, "A soma da série é: " + soma);
    }
}
