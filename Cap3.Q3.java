import javax.swing.JOptionPane;
public class Questao3 {
    public static void main(String[] args) {

        int quantidadePaes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pães franceses:"));
        int quantidadeBroas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de broas:"));

        double valorTotal = calcularValorTotal(quantidadePaes, quantidadeBroas);
        double valorPoupanca = calcularValorPoupanca(valorTotal);

        JOptionPane.showMessageDialog(null, "A arrecadação total é de R$" + valorTotal +  "\nO valor a ser guardado na poupança é de R$" + valorPoupanca);
        }
        private static double calcularValorTotal(int quantidadePaes, int quantidadeBroas) {
            double valorPaes = quantidadePaes * 0.12;
            double valorBroas = quantidadeBroas * 1.50;

            return valorPaes + valorBroas;
        }
        private static double calcularValorPoupanca(double valorTotal) {
            return valorTotal * 0.10;
        }
    }
}
