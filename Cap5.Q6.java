package Cap5;

import javax.swing.*;
public class Questao6 {
    public static void main(String[] args) {
        
            String inputBase = JOptionPane.showInputDialog("Digite a base (X):");
            double base = Double.parseDouble(inputBase);

            String inputExpoente = JOptionPane.showInputDialog("Digite o expoente (Y):");
            int expoente = Integer.parseInt(inputExpoente);

            double resultado = Math.pow(base, expoente);

            JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é: " + resultado);
        }
    }

}
