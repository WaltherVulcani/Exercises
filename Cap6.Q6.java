package Cap6;

import javax.swing.*;
public class Questao6 {
    public static void main(String[] args) {

        double[][] A = new double[5][5];
        double[][] B = new double[5][5];


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A[" + i + "][" + j + "]:"));
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B[" + i + "][" + j + "]:"));
            }
        }
        double[][] C = new double[5][5];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = 0;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    for (int l = 0; l < B[k].length; l++) {
                        if (A[i][j] == B[k][l]) {
                            C[i][j] = 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                JOptionPane.showMessageDialog(null, "C[" + i + "][" + j + "]: " + C[i][j]);
            }
        }
    }
}

}
