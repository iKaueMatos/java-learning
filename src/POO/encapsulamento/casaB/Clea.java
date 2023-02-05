package POO.encapsulamento.casaB;

import POO.encapsulamento.casaA.Anselmo;


//Herança -> herdando metodos e atributos definidos em Anselmo
public class Clea extends Anselmo {
    void testeAcesso(){
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}
