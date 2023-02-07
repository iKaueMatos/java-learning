package POO.herança.carro;

public class Ferrari extends  Carro implements Esportivo{



    public Ferrari(int limiteVelocida) {
        super(limiteVelocida);

    }

    //@ Significa -> anotashion = ou seja anotação
    @Override //@override -> serve para verificarmos se estamos sobreescrevendo um metodo que esta na nossa classe pai
    void acelerar2(){
    if(velocidadeAtual > limiteVelocidade){
        System.out.println("Você atigiu o limite de velocidade");
        freiar();
    }
    velocidadeAtual += 15; //atribuindo velocidade para ferrari de 15 km/h
    }


    //Metodo -> implements interface
    @Override
    public void ligarTurbo(){

    }

    @Override
    public void desligarTurbo() {

    }
}
