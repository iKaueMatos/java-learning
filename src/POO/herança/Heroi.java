package POO.herança;



//Definindo uma herança da classe Jogador;
public class Heroi extends Jogador { // Recebendo codigo do jogador,Metodos,Objetos,atributos e etc.....

    Heroi(int PosicaoX,int PosicaoY){
        this.PosicaoX = PosicaoX;
        this.PosicaoY =PosicaoY;
    }

    Heroi(){
        this(0, 0); //Não esta pasando nenhum valor para a posição x ou Y
    }




    boolean atacar(Jogador oponente){
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }
}
