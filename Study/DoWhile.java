package Study;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto =  "";

        do{
            System.out.println("Você precisa falar as palavras magicas.....: ");
            System.out.println("Quer sair? ");
            texto = entrada.next();
        }while(!texto.equalsIgnoreCase("Porfavor")); // Enquanto não for escrito a palavra magica apresentado no codigo
        //A expressão continuara sendo feita; normalmente

        System.out.println("Obrigado!");


        entrada.close();
    }
}
