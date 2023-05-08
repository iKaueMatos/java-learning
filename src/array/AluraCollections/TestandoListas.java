package array.AluraCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais sobre listas ";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add("Kaue de matos oliveira"); //Adiciona
        aulas.add("Arthur de matos oliveira"); // adiciona
        aulas.add("Rafael souza"); // adiciona
//        aulas.remove("Kaue de matos oliveira"); // remove
//        aulas.remove(0); // Removendo um elemento pelo index
        //For each
        for(String aula : aulas) {
            System.out.println(aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula e:" + primeiraAula);


        //for
        for(int i = 0; i < aulas.size(); i++){
            System.out.println("aula: " + aulas.get(i));
        }
        System.out.println("Tamanho da lista: "+ aulas.size());


        //Para cada aula dentro de aula faça -> Função Lambda
        aulas.forEach(aula -> {
            System.out.println("Percorrendo uma array com uma lambda:"+ aula);
        });

        //Collections e uma interface do java.util onde possibilita chamar alguns metodos para modificar a array
        Collections.sort(aulas);
        System.out.println("Depois de ordena: ");
        System.out.println(aulas);


    }

}
