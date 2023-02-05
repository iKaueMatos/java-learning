package POO.herança;

public class Jogador {
    int PosicaoX;
    int PosicaoY;
int vida = 100;




//Contrutor redefinindo as caracteristicas do construtor padrao
Jogador(){
    this(0,0);
}

//Construtor cetado para receber valor da posição X e Y -> Impossibilitando a utilização do super(); sem
// utilização dos valores da posição x ou y
Jogador(int PosicaoX,int PosicaoY){
    this.PosicaoY = PosicaoY;
    this.PosicaoX = PosicaoX;
}


    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(PosicaoX - oponente.PosicaoX);
        int deltaY = Math.abs(PosicaoY - oponente.PosicaoY);

        if(deltaX == 0 && deltaY == 1){
            if(PosicaoX == oponente.PosicaoX){
                oponente.PosicaoX = vida;
                oponente.PosicaoX -= 10;
                System.out.println("Vida atual do oponente: " + oponente.PosicaoX);
                return true;
            }else if(deltaX == 1 && deltaY == 0) {
                oponente.vida -=10;
                System.out.println("Vida atual do oponente: " + oponente.vida);
                return true;
            }else{
                return false;
            }
        }

        return true;
    }





    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                PosicaoY--;
                break;
            case LESTE:
                PosicaoX++;
                break;
            case SUL:
                PosicaoY++;
                break;
            case OESTE:
                PosicaoX--;
                break;

        }
        return true;
    }
}









