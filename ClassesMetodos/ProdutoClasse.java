package ClassesMetodos;

public class ProdutoClasse {

    //Atributos
    String nome;
    double preco;
    double desconto;

    ProdutoClasse(){ // Desta maneira não precisamos passar um valor no nosso construtor por ele voltou a ser padrão

    }


    //Construtor New | Declarado de uma maneira diferente!
    ProdutoClasse(String nomeInicial){ // Metodo diferente de invocar um construtor desta maneira precisamos podemos perceber que estamo passando um parametro chamado
        //nomeInicial - desta forma precisamos passar um valor no nosso objeto onde ira receber o nome;
        //LEMBRETE: Não e possivel continuar fazendo com que o objeto funcione sem passar o nosso nome inicial!
        nome = nomeInicial;
    }



    //Reponsabilidade da classe função; Método
    double getPreco(){
        return preco * (1 - desconto);

    }


}
