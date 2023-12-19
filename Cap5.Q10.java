package Cap5;

import javax.swing.JOptionPane;
public class Questao10 {
public static void main(String[] args) {
   

            int quantidadeNegativos = 0;

            for (int i = 0; i < 5; i++) {
               
                String input = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + ":");
                double valor = Double.parseDouble(input);

                if (valor < 0) {
                    quantidadeNegativos++;
                }
            }

            JOptionPane.showMessageDialog(null, "Quantidade de valores negativos: " + quantidadeNegativos);
        }
    }
}
