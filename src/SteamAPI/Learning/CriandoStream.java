package SteamAPI.Learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

    public static void main(String[] args) {


        Consumer<String> print = System.out::println; // Referencia de metodo podendo assim so utilizar a abreviação como
        //por exemplo o que e uma função -> println passa a ser estatico agora estatico

        Stream<String> langs = Stream.of("java","Lua","js \n");
        langs.forEach(print); //print estatico ira ficar responsavel por printar todos os elementos que estão dentro do forEach

        //Quando queremos declarar valores diretamente dentro de um array podemos fazer desta maneira
        String[] maislangs = {"Python","Lisp","Perl","Go\n"};
        Stream.of(maislangs).forEach(print);
        Arrays.stream(maislangs).forEach(print); // mostrando os valores na tela
        Arrays.stream(maislangs,1,2).forEach(print); // aqui estamos determinando que ele ira do elemento 1 até o elemento 2
        //E retornara o valor que esta dentro

        System.out.println("Criando com a interface List");
        //Criando uma lista e adicionando elementos dentro dela pelo asList
        List<String> outrasLangs = Arrays.asList("C","PHP","JAVA","kOTLIN");
        outrasLangs.stream().forEach(print);
        System.out.println("Stream API -> ParallelStream forEach");
        outrasLangs.parallelStream().forEach(print); // Por se tratar de Stream parelelo os dados não são processados na ordem

    //    Stream.generate(() -> "a").forEach(print); //Gerate ele não para e sempre continua geranto o resultado nesse caso o resultado a por ele estar percorrendo o valor

    }
}
