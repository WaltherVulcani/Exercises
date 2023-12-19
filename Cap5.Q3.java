package Cap5;

import javax.swing.JOptionPane;
public class Questao3{
    public static void main(String[] args) {
       
            String input = JOptionPane.showInputDialog("Digite o valor de N:");
            int n = Integer.parseInt(input);

            double soma = 0;

            for (int i = 1; i <= n; i++) {
                soma += 1.0 / (2 * i);
            }

            JOptionPane.showMessageDialog(null, "A soma da série para N = " + n + " é: " + soma);
    }
}
