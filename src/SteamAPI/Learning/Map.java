package SteamAPI.Learning;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW","Audi","Honda");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("Usando composição!!\n");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios.grito) //Referencia Utilitarios::grito
                .forEach(print);


    }
}
