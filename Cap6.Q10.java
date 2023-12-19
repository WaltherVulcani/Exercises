package Cap6;

import javax.swing.JOptionPane;

public class Questao10 {
    public static void main(String[] args) {

         
        int maxCheques = 10;

        double[] valoresCheques = new double[maxCheques];

        int numeroCheques;
        do {
            String input = JOptionPane.showInputDialog("Informe o número de cheques usados no mês (até " + maxCheques + " cheques):");
            numeroCheques = Integer.parseInt(input);
        } while (numeroCheques <= 0 || numeroCheques > maxCheques);

        for (int i = 0; i < numeroCheques; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor do cheque " + (i + 1) + ":");
            valoresCheques[i] = Double.parseDouble(input);
        }

        double maiorValor = valoresCheques[0];
        double menorValor = valoresCheques[0];

        for (int i = 1; i < numeroCheques; i++) {
            if (valoresCheques[i] > maiorValor) {
                maiorValor = valoresCheques[i];
            }
            if (valoresCheques[i] < menorValor) {
                menorValor = valoresCheques[i];
            }
        }

        StringBuilder listaValores = new StringBuilder("Valores dos cheques:\n");
        for (int i = 0; i < numeroCheques; i++) {
            listaValores.append("Cheque ").append(i + 1).append(": ").append(valoresCheques[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, listaValores.toString() + "Maior valor: "
                + maiorValor + "\n" + "Menor valor: " + menorValor);
    }
}
