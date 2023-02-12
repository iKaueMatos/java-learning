package SteamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CriandoUmaLista {
    public static void main(String[] args) {
        // 1 forma de imprimir uma lista array

        List<String> aprovados = Arrays.asList("Kaue de matos oliveira","Arthur");
        System.out.println(aprovados);

        System.out.println("\n");

        // 2 forma de exibir uma lista

        for (int i = 0; i <aprovados.size(); i++){
            System.out.println(aprovados.get(i));
        }

        System.out.println("\n");

        //3 Forma de exibir uma lista

        for (String  nome: aprovados){
            System.out.println("Maneira numero 3 de exibir uma lista: " +nome);
        }

        System.out.println("\n");

        //significado do iterator interação com proximo elemento
        System.out.println("Usando o interator para percorrer a lista maneira 4 ");
        //Iterator -> tem proximo? ....tem então continua
        Iterator<String> iterator = aprovados.iterator(); //iterator -> interface
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("\n");

        //Usando stream maneira 5:
        System.out.println("Usando o Stream maneira 5");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
