package POO.encapsulamento.GetterESetter;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(20,"Kauê de matos oliveira");
        pessoa.setIdade(20); // alterando a idade pelo metodo set

        System.out.println(pessoa.toString()); // exibindo todos os valores com o metodo toString
    }
}
