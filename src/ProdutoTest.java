import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        int a = 3;
        Scanner entrada = new Scanner(System.in);

        //Objetos -- instancias
        //New e construtor que permite criarmos um objeto instaciando nossa classe

        //Método 1 - Construtor;
        Produto p1 = new Produto( "Notebook ",43215.14); // Objeto instaciado
        Produto.desconto = 0.25;


        //Método 2 - Construtor;
        var p2 = new Produto(); // objeto instaciado
        p2.nome = "Caneta";
        p2.preco = 12.56;
        Produto.desconto = 0.50;



        System.out.println(p2.nome + " Desconto " + p1.desconto);
        double media = p1.getPreco();

        System.out.println("Desconto do produto " + p2.nome + " e de: " + media);
    }

}
