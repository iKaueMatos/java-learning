package collections.DojoCollections.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        //Na maioria das vez o tipo mais generico e o que sempre esta do lado esquerdo
        List<String> nomes = new ArrayList (16); // capacidade inicial do array
        nomes.add("kaue de matos oliveira");
        nomes.add("rafel de matos oliveira ");
        nomes.add("jose de oliviera");
        nomes.add("kaue de matos oliveira");
        nomes.add("Arthur de matos oliviera");
        nomes.add("kaue de matos oliveira");
        nomes.add("kaue de matos oliveira");
        nomes.add("kaue de matos oliveira");

        //For each
        nomes.forEach(nome ->{ System.out.println(nome);});


    }
}
