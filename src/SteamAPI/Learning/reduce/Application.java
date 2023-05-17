package SteamAPI.Learning.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {


        AlunoReduce a1 = new AlunoReduce("kaue de matos",1200,7,"bic",30);
        AlunoReduce a2 = new AlunoReduce("Rodrigo",1300,4,"Gillete",20);
        AlunoReduce a3 = new AlunoReduce("Rogerio",1500,2,"jandaia",90);
        AlunoReduce a4 = new AlunoReduce("Flavio",1700,0,"j",20);
        AlunoReduce a5 = new AlunoReduce("Roberto",2200,0,"bic",40);

        Consumer<String> print = System.out::println;

        List<AlunoReduce> lapis = Arrays.asList(a1,a2,a3,a4,a5);
        //Soma total dos lapis
        Predicate<AlunoReduce> verificacaoLapis =  a -> a.valorLapis > 30;
        Function<AlunoReduce,String> aprovado = a -> a.nome + "Você passou para proxima etapa";
        //Se  o nome conter mais de 8 letras aprovado caso ao contrario reprovado
        Predicate<AlunoReduce> LetraNome = a -> a.nome.length() == 8;
        BinaryOperator<Integer> somaQtdLapis = (total,lapisTotal) -> total + lapisTotal;

        lapis.stream().filter(verificacaoLapis).filter(LetraNome).map(aprovado);
        lapis.stream().reduce(somaQtdLapis,1);





    }
}
