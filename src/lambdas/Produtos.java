package lambdas;

public class Produtos{

    public final String nome;
    public final double preco;

    public final double desconto;

    public Produtos(String nome,double preco,double desconto) {
        this.nome = nome;
        this.desconto = desconto;
        this.preco = preco;
    }

    public String toString(){
        double precoFinal = preco * (1 - desconto);
        return "Nome do produto: " + nome + " preço do produto R$ " + precoFinal;
    }
}
