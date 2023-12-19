package Cap6;

import javax.swing.*;
public class Questao7 {
    public static void main(String[] args) {

        double[] precosIniciais = new double[15];

        double[] precosFinais = new double[15];

        for (int i = 0; i < precosIniciais.length; i++) {
            precosIniciais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no início da semana:"));
        }

        for (int i = 0; i < precosFinais.length; i++) {
            precosFinais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no fim da semana:"));
        }

        double[] variacoes = new double[15];
        for (int i = 0; i < variacoes.length; i++) {
            variacoes[i] = precosFinais[i] - precosIniciais[i];
        }

        double[] precosMedios = new double[15];
        for (int i = 0; i < precosMedios.length; i++) {
            precosMedios[i] = (precosIniciais[i] + precosFinais[i]) / 2;
        }

        for (int i = 0; i < precosMedios.length; i++) {
            JOptionPane.showMessageDialog(null, "Preço médio do produto " + (i + 1) + ": " + String.format("%.2f", precosMedios[i]));
        }
    }
}
