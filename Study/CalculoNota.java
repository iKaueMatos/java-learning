package Study;

import java.util.Scanner;

public class CalculoNota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1){
            System.out.println("Informe a nota ou -1 para sair: ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 10){
                total += nota;
                quantidadeDeNotas ++;
            }
        }

        //Calcular a media:

        double media = total / quantidadeDeNotas;
        System.out.println("Media = " + media);

        entrada.close();

    }
}
