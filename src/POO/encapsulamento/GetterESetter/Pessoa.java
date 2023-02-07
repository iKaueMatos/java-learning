package POO.encapsulamento.GetterESetter;

public class Pessoa {
    private int idade; //Basicamente a unica classe que vai conseguir ler e alterara-lo vai ser a classe Pessoa()
    private String nome;

    private String sobrenome;


    //construtor

    public Pessoa (int idade,String nome){
        this.idade = idade;
        this.nome = nome;
    }

//Setter
// O metodo set possibilita que nos atribuimos uma novaIdade -> setando basicamente uma nova informação;
    public void setIdade(int novaIdade){
        if(novaIdade < 0 && novaIdade  == 0 && novaIdade >= 100 ) {
            novaIdade = Math.abs(novaIdade);
            throw new IllegalArgumentException("Idade esta invalida! Por favor digite uma idade valida");
        }else if(novaIdade > 0 ){
            this.idade = novaIdade;
            throw new IllegalArgumentException("Sua idade e valida por favor prossiga");
        }
    }


    //Setter -> Atribuindo novas informações para atributo nome
    public String setNome(String novoNome){
        if(nome.length() > 6){
            throw new IllegalArgumentException("Acesso liberado!");
        }else{
            throw new IllegalArgumentException("Nome invalido por favor.Digite um nome valido");
        }
    }


    public String getNome(){
        return nome;
    }

    //Getter
    //Basicamente para conseguirmos retorna o valor precisamos criar um metodo get onde possibilita retorna o atributo idade
    public int getIdade(){
        return idade;
    }

    @Override // sobreescrevendo toString
    public String toString(){
        return "Olá eu sou o "+ getNome() + "e tenho" + getIdade();
    }


}
