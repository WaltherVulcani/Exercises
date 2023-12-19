package Cap5;

import javax.swing.JOptionPane;
public class Questao1 {
    public static void main(String[] args) {
     
        int quantidadeDiaria;
        int quantidadeProduzidaAno = 0;
        int menorProducaoDiaria = Integer.MAX_VALUE;
        int dia = 1;

        JOptionPane.showMessageDialog(null, "Digite a quantidade produzida diariamente ao longo do ano (-1 para encerrar):");

        while (true) {
            String input = JOptionPane.showInputDialog("Quantidade do dia " + dia + " (ou -1 para encerrar):");

            try {
                quantidadeDiaria = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro.");
                continue;
            }

            if (quantidadeDiaria == -1) {
                break;
            }

            quantidadeProduzidaAno += quantidadeDiaria;

            if (quantidadeDiaria < menorProducaoDiaria) {
                menorProducaoDiaria = quantidadeDiaria;
            }

            dia++;
        }

        JOptionPane.showMessageDialog(null, "Quantidade produzida no ano: " + quantidadeProduzidaAno + "\n" +
                        "Menor produção diária: " + (menorProducaoDiaria == Integer.MAX_VALUE ? "N/A" : menorProducaoDiaria));
    }
}
