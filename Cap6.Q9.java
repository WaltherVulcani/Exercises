package Cap6;

import javax.swing.JOptionPane;

public class Questao9 {
    public static void main(String[] args) {

        int numDisciplinas = 5;
        int numNotasPorDisciplina = 4;

        double notaMaisAlta = Double.MIN_VALUE;
        int disciplinaNotaMaisAlta = 0;

        for (int i = 1; i <= numDisciplinas; i++) {
            for (int j = 1; j <= numNotasPorDisciplina; j++) {
                String input = JOptionPane.showInputDialog("Digite a nota " + j + " da disciplina " + i + ":");

                double nota = Double.parseDouble(input);

                if (nota > notaMaisAlta) {
                    notaMaisAlta = nota;
                    disciplinaNotaMaisAlta = i;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "A nota mais alta é: " + notaMaisAlta + " na disciplina " + disciplinaNotaMaisAlta);
    }
}
