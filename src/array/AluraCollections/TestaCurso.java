package array.AluraCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando coleções do java","Paulo silveira");
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        //instaciando um objeto Array dentro aulas.add e atribuindo os valores que vão ser passados
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",30));
        javaColecoes.adiciona(new Aula("Criando uma aula",22));
        javaColecoes.adiciona(new Aula("Modelando as coleçoẽs",22));

        //Chamando os valores de aula para dentro do ArrayList<>();
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

    }
}
