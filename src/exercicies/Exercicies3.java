package exercicies;

import java.util.Scanner;

// Informar um saldo e imprimir o saldo com reajuste de 1%.

public class Exercicies3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu salario atual: ");
        double currentLast = input.nextDouble();

        System.out.println("Digite o seu novo salario: ");
        double currentWage = input.nextDouble();
        Double result = (currentWage - currentLast) / currentLast * 100;
        Double valueround = Math.round(result * 100.0) / 100.0;
        
        System.out.println("O seu salario com reajuste e de:" + valueround + "%");
    }
}
