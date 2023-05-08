package array.AluraCollections;
//Diferenças da ArrayList para LinkedList

//As principais diferenças entre ArrayList e LinkedList em Java são:
//
//        Armazenamento de dados: ArrayList é implementado como um array dinâmico que aumenta ou diminui de tamanho à medida que novos elementos são adicionados ou removidos, enquanto LinkedList é implementado como uma lista duplamente encadeada, onde cada elemento armazena uma referência ao seu elemento anterior e ao próximo elemento da lista.
//
//        Inserção e remoção de elementos: ArrayList é mais eficiente em termos de inserção e remoção de elementos no final da lista, porque não precisa mudar a posição de todos os elementos subsequentes na lista. No entanto, quando se trata de inserção ou remoção de elementos no meio da lista, LinkedList é mais eficiente porque não precisa realocar nenhum elemento.
//
//        Acesso aos elementos: ArrayList é mais eficiente em termos de acesso aos elementos porque é baseado em índice, o que significa que o acesso a qualquer elemento da lista é feito diretamente através de seu índice. Já em LinkedList, é necessário percorrer a lista a partir do início ou do fim para acessar um elemento específico.
//
//        Uso de memória: ArrayList usa menos memória em comparação com LinkedList, porque não precisa armazenar referências para cada elemento anterior e próximo da lista. Em contraste, LinkedList precisa armazenar essas referências, o que consome mais memória.
//
//        Iteração da lista: A iteração em ArrayList é mais rápida em comparação com LinkedList, porque ArrayList é baseado em array e oferece acesso de índice direto, enquanto em LinkedList a iteração é feita por meio de um ponteiro que percorre cada elemento da lista.
//
//        Em resumo, se você precisar de uma lista para acessar rapidamente elementos aleatórios e iterá-los, use ArrayList. Por outro lado, se você precisar inserir ou remover muitos elementos em posições intermediárias da lista, ou se a lista for grande e você precisar economizar memória, use LinkedList.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;

    // ArrayList e uma interface onde tem o seus subtopicos que podem ser chamados de List por exemplo
    //Contudo tendo ou não o nome List declarado em um atributo(variavel) não tem problema nenhum!! A diferença e que podemos
    //ja declarar o que sera armazenado por exemplo!

    //Classe concreta que não existe nenhum valor
    private List<Aula> aulas = new ArrayList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        //UnmodifiableList -> Enviei um lista mais me devolva uma copia da mesma
        //Copia indenfencivel imutavel
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for(Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }
}
