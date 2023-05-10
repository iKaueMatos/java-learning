package POO.MetodoEstatico.ModificadorStatic;

public class Carro {
    private String marca;
    private double velocidadeMaxima;

    //Quando criamos um modificador Static falamos que o atributo pertence a classe e que todo os atributos que forem passados a partir
    // deste momento ira pertencer a ela e também ao seus objetos,e também não e mais um atributo de instacia mais sim um atributo estatico onde não pode ser instaciado
    private static double velocidadeLimite = 250;

    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println("Marca : "+ this.marca);
        System.out.println("Velocidade maxima : "+ this.velocidadeMaxima);
        System.out.println("Velocida Limite : "+ Carro.velocidadeLimite);
    }



    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
