package POO.abstrato;

public class Cachorro extends Animal{

    @Override // sobreescrevendo o metodo mover
    public String mover() {
        return "Usando as patas";
    }

    @Override
    public String mamar(){
        return  "Usando leite";
    }


}
