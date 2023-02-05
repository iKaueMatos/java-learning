package POO.herança;

public class Jogo {

    public static void main(String[] args) {



        //Heroi
        Heroi heroi = new Heroi();

        heroi.PosicaoX = 10;
        heroi.PosicaoY = 10;

        heroi.andar(Direcao.NORTE);

        System.out.println("Heroi esta: " + heroi.PosicaoX);
        System.out.println("Vida do heroi: " + heroi.vida);
        //Mosntro

        Monstro monstro = new Monstro();

        monstro.PosicaoX = 10;
        monstro.PosicaoY = 10;

        monstro.andar(Direcao.LESTE);
        monstro.atacar(heroi);

        System.out.println("Monstro esta na posição: " + monstro.PosicaoY);
        System.out.println("Vida do monstro: " + monstro.vida);


        //Jogadores
        Jogador j1 = new Jogador(heroi.PosicaoX, heroi.PosicaoY);

        j1.PosicaoX = 10;
        j1.PosicaoY = 10;

        System.out.println(j1.PosicaoX);
        System.out.println(j1.PosicaoY);

        ///Jogador 2
        Jogador j2 = new Jogador();

        j2.PosicaoX = 10;
        j2.PosicaoY = 11;

        //Vida dos jogadores
        System.out.println(j1.vida);
        System.out.println(j2.vida);


        //Ataques
        j1.atacar(j2);











    }
}
