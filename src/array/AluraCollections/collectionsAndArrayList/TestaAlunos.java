package array.AluraCollections.collectionsAndArrayList;

import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        //Hash set não e uma lista e classe que implementada de set

        //Um conjunto não aceita elementos repetidos um ponto bastante triste e que ele não permite fazer com que
        // você use alguns metodos de pegar um valor dentro da coleção em especifico ou algo do tipo
        //Collection e classe pai onde set e filho e Hashset e metodo que esta dentro de set
        Collection<String> alunos = new HashSet<>();
        alunos.add("Kaue de matos oliveira");
        alunos.add("Roberto souza");
        alunos.add("Nico Stetaffi");
        alunos.add("Felipe andrade");
        alunos.add("Renan Saggio");

        //1 - caracteristica de HashSet
        //Ele simplesmente so implementa os falores dentro da sacola de itens e nãop traz uma garantia se ira ficar na
        // ondem que foi inserido ou não!
        System.out.println("Print collection:" + alunos);


        //contains verifica se existe um valor dentro da collection
        String kaueEstaMatriculado = alunos.contains("kaue") ? "Esta" : "Não esta";
        System.out.println("Verificação:" + kaueEstaMatriculado + "\n");

        //Informando os valores total dentro da collection Hashset
        System.out.println("Informando os valores totais com collections:" + alunos.size());

        //Removendo um valores dentro da collections HashSet
        System.out.println("Removendo valores de dentro da collection: " + alunos.remove("kaue de matos oliveira"));

        //Percorrendo todos os valores
        System.out.println("Percorrendo os valores");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("\n");
        //Lambda
        alunos.forEach(aluno ->{
            System.out.println("Valores dentro da lambda");
            System.out.println(aluno);
        });

        //List -> pode receber valores das collections e dessa e liberado o acesso para manipula-las
        // de acordo com a necessidade

        //Lista e tipo de coleção que sabe dizer a ordem dos elementos!
        List<String> alunosEmlista = new ArrayList<>(alunos);

    }
}
