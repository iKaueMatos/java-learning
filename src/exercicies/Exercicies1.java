package exercicies;

import java.util.Scanner;

// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
// mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
// (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

public class Exercicies1 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a idade em anos: ");
        int anos = input.nextInt();

        System.out.print("Informe a idade em meses: ");
        int meses = input.nextInt();

        System.out.print("Informe a idade em dias: ");
        int dias = input.nextInt();

        input.close();

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade em dias é: " + idadeEmDias + " dias.");
    }
}

