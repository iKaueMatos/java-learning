package lambdas;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Foreach {

    public static void main(String[] args) {
        String letra;

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia");
        Scanner entrada = new Scanner(System.in);


        //forma tradicional
        System.out.println("Forma tradicional");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\n lambda 1");

        aprovados.forEach((nome) -> {
            System.out.println(meuImprimir("Kauê de matos oliveira"));
        });
        System.out.println("Method reference! "); // referencia de um metodo
        aprovados.forEach(System.out::println);
    }


    //vsibilidade default
    static String meuImprimir(String nome){
        System.out.println("Oi meu nome é " + nome);
        return nome;
    }

}


