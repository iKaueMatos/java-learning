package SteamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class OperaçoesBuild {
    //Criando stream
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        //Primeira maneira de criar juma Stream
        Stream<String> langs = Stream.of("Java ", "Lua ","JS \n");

        langs.forEach(print);


        //2 maneira de criar Stream

        String[] maisLangs = {"Python ","Lisp " , "Perl ","Go \n"};

        Stream.of(maisLangs).forEach(print);

        //3 maneira de criar uma Stream
        Arrays.stream(maisLangs).forEach(print);

    }
}