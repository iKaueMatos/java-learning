package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Produtos> isCaro = produtos -> (produtos.preco * (1 - produtos.desconto)) >= 750;

        Produtos produto = new Produtos("Notebook", 3546, 0.15);
        System.out.println(isCaro.test(produto));

    }
}
