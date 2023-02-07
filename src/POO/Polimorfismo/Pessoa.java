package POO.Polimorfismo;

public class Pessoa {
    private double peso;
    private Comida comida;

    //construtor
    public Pessoa(double peso){
        setPeso(peso);
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

    //Getter
    public double getPeso() {
        return peso;
    }

    //Setter
    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }




    }
}
