package Cap5;

import javax.swing.*;
public class Questao5 {
    public static void main(String[] args) {
           
            String input = JOptionPane.showInputDialog("Digite um número:");
            double numero = Double.parseDouble(input);

            double resultado = Math.pow(numero, 5);

            JOptionPane.showMessageDialog(null, "O número elevado à quinta potência é: " + resultado);
    }
}
