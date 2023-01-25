package ClassesMetodos;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        int a = 3;
        Scanner entrada = new Scanner(System.in);

        //Objetos -- instancias
        //New e construtor que permite criarmos um objeto instaciando nossa classe

        //Método 1 - Construtor;
        ProdutoClasse p1 = new ProdutoClasse( "Notebook "); // Objeto instaciado
        p1.preco = 43215.14;
        p1.desconto = 0.25;


        //Método 2 - Construtor;
        var p2 = new ProdutoClasse(); // objeto instaciado
        p2.nome = "Caneta";
        p2.preco = 12.56;
        p2.desconto = 0.29;



        System.out.println(p2.nome);
        double media = p1.getPreco();

        System.out.println("Desconto do produto " + p2.nome + " e de: " + media);
    }
}
