package array.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner output = new Scanner(System.in);
        System.out.println("Digite um numero para o tamanho da sua array: ");
        double entrada = output.nextDouble();
        double [] notasAlunoA = new double[(int) entrada];

        double total = 0;

        Scanner outputFloat = new Scanner(System.in);
        for(int i = 0; i < notasAlunoA.length; i++){
            System.out.println("Digite um numero" + " Quantidade restante:" + i);
            float entrada2 = outputFloat.nextFloat();
            total += notasAlunoA[(int) entrada2];
        }

        System.out.println("Soma total: " + total);
    }
}
