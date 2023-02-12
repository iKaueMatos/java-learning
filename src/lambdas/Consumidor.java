package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
    //O que é Consumer em Java?
        //Por exemplo, Consumer<T> contém uma função que recebe um argumento e tem um retorno void, enquanto Predicate<T> é
        // uma interface com uma função que recebe um argumento e retorna um boolean, que geralmente é usado para escrever lambdas de filtragem.

        Consumer<Produtos> imprimir = p -> System.out.println(p.nome + "<-");

        Produtos p1 = new Produtos("Caneta",12.4,0.1);
        Produtos p2 = new Produtos("Caderno",12.4,0.1);
        Produtos p3 = new Produtos("lapis",12.4,0.1);
        Produtos p4 = new Produtos("Notebook",700.4,0.1);
        imprimir.accept(p1);

        List<Produtos> produto = Arrays.asList(p1,p2,p3,p4);


        //forEach
        produto.forEach(imprimir);
        produto.forEach(p -> System.out.println(p.toString()));

    }
}
