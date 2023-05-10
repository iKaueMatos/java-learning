package collections.AluraCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revistando as ArrayList",21);
        Aula a2 = new Aula("lista de objetos",15);
        Aula a3 = new Aula("Relacionamento de listas e objetos",15);


        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println("Antes:" +aulas);

        Collections.sort(aulas);

        System.out.println("Depois:"+aulas);
        //Ordene as aulas comparando o tempo das aulas!!!
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        //Ordendando comparando o tempo das aulas!! Resultado:
        System.out.println(aulas); //resultado 15 15 21

        aulas.sort(Comparator.comparing(Aula::getTempo));
        //Ordendando comparando o tempo das aulas!! Resultado:
        System.out.println(aulas); //resultado 15 15 21
    }
}
