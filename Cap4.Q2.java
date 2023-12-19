import javax.swing.JOptionPane;
public class Questao2 {
    public static void main(String[] args) {

            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em quilogramas:"));

          
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));

           
            double imc = calcularIMC(peso, altura);

        
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + interpretarIMC(imc));
        }

        private static double calcularIMC(double peso, double altura) {
            return peso / (altura * altura);
        }

     
        private static String interpretarIMC(double imc) {
            if (imc < 18.5) {
                return "Abaixo do peso";
            } else if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                return "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                return "Obesidade leve";
            } else if (imc >= 35 && imc < 40) {
                return "Obesidade moderado";
            } else {
                return "Obesidade mórbido";
            }
    }
}
