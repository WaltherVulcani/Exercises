import javax.swing.JOptionPane;
public class Questao5 {
    public static void main(String[] args) {

        double precoLitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do litro da gasolina:"));
        double valorPagamento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento:"));

        double litrosAbastecidos = calcularLitrosAbastecidos(precoLitro, valorPagamento);

        JOptionPane.showMessageDialog(null, "Você conseguiu abastecer " + litrosAbastecidos + " litros de gasolina.");

        private static double calcularLitrosAbastecidos(double precoLitro, double valorPagamento) {
            return valorPagamento / precoLitro;
        }
    }
}
