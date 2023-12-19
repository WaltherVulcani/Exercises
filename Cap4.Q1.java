import javax.swing.JOptionPane;
public class Questao1 {

    public static void main(String[] args) {

         
            double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));

            double debitos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de débitos:"));

    
            double creditos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de créditos:"));

      
            double saldoFinal = saldoInicial - debitos + creditos;

         
                JOptionPane.showMessageDialog(null, "Saldo positivo em R$" + saldoFinal);
            } else if (saldoFinal < 0) {
                JOptionPane.showMessageDialog(null, "Saldo negativo em R$" + saldoFinal);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo zero.");
            }
    }
}
