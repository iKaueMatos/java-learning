package lambdas;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner entrada = new Scanner(System.in);
       Calculo cal = (x, y) -> {return x + y;};

        //Numero 1
        System.out.println("Digite um numero: ");
        number1 = entrada.nextInt();

        //Numero 2
        System.out.println("Digite o numero 2: ");
        number2 = entrada.nextInt();

        //Executando
        System.out.println(cal.executar(number1,number2));



    }



}
