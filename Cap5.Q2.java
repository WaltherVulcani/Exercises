package Cap5;

import javax.swing.JOptionPane;
public class Questao2 {

    public static void main(String[] args) {

        int limite = 100;
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i * i <= limite; i++) {
            int quadrado = i * i;
            resultado.append(quadrado);

            if (i * i < limite) {
                resultado.append(", ");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
