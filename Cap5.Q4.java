package Cap5;

import javax.swing.*;
public class Questao4 {
    public static void main(String[] args) {
        
            String input = JOptionPane.showInputDialog("Digite o número de iterações para calcular Pi:");
            int iteracoes = Integer.parseInt(input);

       
            double piAproximado = calculaPi(iteracoes);

            JOptionPane.showMessageDialog(null, "Valor aproximado de Pi: " + piAproximado);
        }

        private static double calculaPi(int iteracoes) {
            double pi = 0.0;

            for (int i = 0; i < iteracoes; i++) {
                double termo = 4.0 / (2 * i + 1);

                if (i % 2 == 0) {
                    pi += termo;
                } else {
                    pi -= termo;
                }
            }

            return pi;
    }
}
