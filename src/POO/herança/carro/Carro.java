package POO.herança.carro;

public abstract class Carro {
    int velocidadeAtual;
  final int limiteVelocidade = 50;

void acelerar(){

    if (velocidadeAtual > limiteVelocidade){
        System.out.println("Você atigiu o limite de velocidade ");
        freiar();
        }else{
        velocidadeAtual +=5;
    }
    }

    void freiar(){
    if(velocidadeAtual >= limiteVelocidade){
        System.out.println("Você freiou com sucesso! ");
        velocidadeAtual -= 10;
        freiar();

    }else{
        //Se a velocidade atual for igual a 4 automaticamente podemos freiar e deixar igual a 0;
        velocidadeAtual = 0;
        }
    }

//Metodo retornando a velocidade atual do carro
    public String toString(){
        return  "Velocidade atual e: " + velocidadeAtual + "Km/h";
    }

    abstract void acelerar2();
}
