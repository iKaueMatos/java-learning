package Study;

import javax.swing.*;

public class ConversaoNumberString {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero2 + numero1;
        System.out.println("Soma e: " + soma);
        System.out.println("Media e " + soma / 2);
    }
}
