import java.util.Scanner;

public class exercicios2 {
    public static void main(String[] args) {
       double contacao_dolar,valor_real,valor_dolar;
        Scanner Prohibited = new Scanner(System.in);

       System.out.println("Valor da cotação do dolar atual: ");
       contacao_dolar = Prohibited.nextDouble();

        System.out.println("Valor em dolar da sua conta bancaria: ");
        valor_dolar = Prohibited.nextDouble();

        valor_real = (contacao_dolar * valor_dolar);

        System.out.println("Valor convertdo para a moeda do brasil e de: " + valor_real);

    }
}
