package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {
    public static void main(String[] args) {

        //Queue -> Fila
        Queue<String> fila = new LinkedList<>();

        //Tanto Offer e add -> ambos adicionam elementos na lista a diferença e que:

        //Add() lançara uma exceção caso a fila esteja cheia.
        //offer() retorna falso caso a fila esteja cheia....
        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Rafael");
        fila.offer("Roberto");

        System.out.println(fila);


        //peek e Element -> Obter o proximo elemento da fila (sem remover);
        //A diferença do comportamento ocorre quando a lista esta vazia!
        System.out.println(fila.peek()); // retorna false;
        System.out.println(fila.element()); // Lanaça exceçao.

        //Diferença de comportamento ocorre quando a lista esta vazia!

        System.out.println(fila.poll()); // chama o elemento ja removendo consequentemente retornando null -> nulo;
        System.out.println(fila.remove()); // remove um elemento da fila e lança um exceção quando não tem mais nada

    }
}
