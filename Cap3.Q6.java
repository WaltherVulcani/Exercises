import javax.swing.JOptionPane;
public class Questao6 {
    public static void main(String[] args) {

        double pesoPrato = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do prato (em quilos):"));

            double valorPagar = calcularValorPagar(pesoPrato);

            JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + valorPagar);

        private static double calcularValorPagar(double pesoPrato) {
            return pesoPrato * 12.00;
        }
    }

}
