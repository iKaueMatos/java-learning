package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        // -> O ultimo a entrar e o primeiro a sair
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno principe "); // Não retorna nenhuma exceção
        livros.push("O pequeno principe 2"); // Retorna um exceção true ou false caso a capacidade maxima seja atingida
        System.out.println(livros);

    }
}
