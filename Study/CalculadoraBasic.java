package Study;

import java.util.Scanner;

public class CalculadoraBasic {
    public static void main(String[] args) {
        double num1,num2;
        String operador;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu primeiro numero: ");
        num1 = entrada.nextDouble();

        System.out.println("Digite seu primeiro numero: ");
        num2 = entrada.nextDouble();

        System.out.println("Digite o seu operador: ");
        operador = entrada.next();

        double resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;

        System.out.println("Seu calculo com a operador: " + resultado);

    }
}
