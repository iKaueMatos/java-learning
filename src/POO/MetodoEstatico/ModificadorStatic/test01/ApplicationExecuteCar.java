package POO.MetodoEstatico.ModificadorStatic.test01;

import POO.MetodoEstatico.ModificadorStatic.Carro;

public class ApplicationExecuteCar {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);

     Carro porche = new Carro("porche",150);
     Carro Volkswagen = new Carro("volkswagen",100);
     Carro Opel = new Carro("Opel",130);

    porche.imprime();
    Volkswagen.imprime();
    Opel.imprime();




    }
}
