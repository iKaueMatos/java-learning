package exercicies;

import java.util.Scanner;

//Escrever um algoritmo que lê:
//- a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)


public class Exercicies4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido no valor das peças: ");
        double ipi = input.nextDouble();

        int[] codigo = new int[2];
        double[] valorUnitario = new double[2];
        int[] quantidade = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe os dados da peça " + (i + 1) + ":");
            System.out.print("Código: ");
            codigo[i] = input.nextInt();
            System.out.print("Valor Unitário: ");
            valorUnitario[i] = input.nextDouble();
            System.out.print("Quantidade: ");
            quantidade[i] = input.nextInt();
        }

        double total = (valorUnitario[0] * quantidade[0] + valorUnitario[1] * quantidade[1]) * (ipi / 100 + 1);
        System.out.println("Valor total a ser pago: " + total);
    }
}

