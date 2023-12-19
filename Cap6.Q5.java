ackage Cap6;

import javax.swing.*;
public class Questao5 {
    public static void main(String[] args) {
       
        int[][] matriz = new int[6][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                JOptionPane.showMessageDialog(null, "matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}
