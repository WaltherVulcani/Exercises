import javax.swing.JOptionPane;
public class Questao4 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        int diasDeVida = calcularDiasDeVida(idade);

        JOptionPane.showMessageDialog(null, nome + " possui " + diasDeVida + " dias de vida.");

        private static int calcularDiasDeVida(int idade) {
        return idade * 365; // Cada ano possui 365 dias
         }
    }
}
