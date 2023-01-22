package Study.Exercicios;
import java.util.Scanner;

//Receba uma temperatura em fahrenheit e converta em celsius

public class Exercicio3 {
    public static void main(String[] args) {
        double fahrenheit,celsius;
        double conversao = 32;
        double dividido = 5.0 / 9.0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu valor em Fahrenheit: ");
        fahrenheit = entrada.nextDouble();

       celsius = (fahrenheit - conversao) * dividido;

        System.out.println("Seu valor convertido de Fahrenheit: " + celsius + "Cº");





    }
}
