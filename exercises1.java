//1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
//        *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.


import java.util.Scanner;

public class exercises1 {
    // Funções e classes

    public static void main(String[] args) {
        double medium_stock, minimum_amount, maximum_amount;

        Scanner Prohibited = new Scanner(System.in);
        System.out.println("Digite a quantidade de peças minimas: ");
        minimum_amount = Prohibited.nextDouble();

        System.out.println("Digite a quantidade maxima de peças: ");
        maximum_amount = Prohibited.nextDouble();

        medium_stock = (minimum_amount + maximum_amount) / 2;

        System.out.println("Estoque Medio: " + medium_stock);
    }
}
