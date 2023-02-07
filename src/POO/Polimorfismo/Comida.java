package POO.Polimorfismo;

public abstract class Comida {
    private double peso;

    //Construtor
    public Comida(double peso){
        setPeso(peso);
    }
    //Getter
    public double getPeso() {
        return peso;
    }
    //Setter
    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
            //   throw new IllegalArgumentException("Peso...Verificado");
        }
    }


}
