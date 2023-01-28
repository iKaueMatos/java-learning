public class Produto {

    //Atributos
    String nome;
    double preco;
   static double desconto = 0.25; // Atribuindo o valor 0.25 como valor estatico;

    Produto(){ // Desta maneira não precisamos passar um valor no nosso construtor por ele voltou a ser padrão

    }


    //Construtor New | Declarado de usma maneira diferente!
    Produto(String nomeInicial, double precoInicial){ // Metodo diferente de invocar um construtor desta maneira precisamos podemos perceber que estamo passando um parametro chamado
        //nomeInicial - desta forma precisamos passar um valor no nosso objeto onde ira receber o nome;
        //LEMBRETE: Não e possivel continuar fazendo com que o objeto funcione sem passar o nosso nome inicial!
        nome = nomeInicial;
        preco = precoInicial;
    }



    //Reponsabilidade da classe função; Método
    double getPreco(){
        return preco * (1 - desconto);

    }


}


