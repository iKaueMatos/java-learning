package SteamAPI.Learning.FIlter;


//Basicamente conseguimos Filtrar elementos dentro de um array ou stream deixando o nosso codigo um pouco mais
// Otimizado -> Conseguimos dizer qual é o criterio para filtrar os dados dentro do stream

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        AlunoFilter a1 = new AlunoFilter("kaue de matos", 12.00, 7);
        AlunoFilter a2 = new AlunoFilter("Ronaldo", 15.00, 6);
        AlunoFilter a3 = new AlunoFilter("Anselmo", 20.00, 9);
        AlunoFilter a4 = new AlunoFilter("Roberto", 455.00, 8);
        AlunoFilter a5 = new AlunoFilter("Arthur", 00.00, 0);

        Consumer<String> print = System.out::println;
        //Podemos também definir pelo predicate desta forma Abaixo
        System.out.println("Filter e Map otimizados e de outra forma !");

        Predicate<AlunoFilter> aprovado = a -> a.dinheiro >= 1500;
        Predicate<AlunoFilter> nota = a -> a.nota > 7;
        Function<AlunoFilter, String> saudacaoAprovado = a -> "Parabéns" + a.nome + "! Vocẽ foi aprovado!" + "Sua nota e:"+
                a.nota + "e o seu saldo e igual a:" + a.dinheiro;

        List<AlunoFilter> alunos = Arrays.asList(a1,a2,a3,a4,a5);
        alunos.stream().filter(aprovado).filter(nota)
                .map(saudacaoAprovado).forEach(print);


        System.out.println("Segunda forma de fazer sem otimização de codigo");

        alunos = Arrays.asList(a1, a2, a3, a4, a5);
        //Filtrando o aluno de acordo com a nota dele,no caso se for maior que 7 aluno aprovado!
        alunos.stream().filter(a -> a.dinheiro >= 7)
                .map(a -> "Parabéns" + a.nome + "! Você foi aprovado").forEach(print);

    }
}
