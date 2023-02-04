package POO;


public class Carro {
    Motor motor = new Motor();
    boolean ligado = false;


    //Void -> vazio
    boolean acelerar(){
        motor.fatorInjecao += 0.4;
        return false;
    }

    void freiar(){
        if(motor.fatorInjecao < 2.5){
            motor.fatorInjecao += 0.4;
        };
    }

    boolean ligar(){
        motor.ligado = true;

        return false;
    }

    void desligar() {
        motor.ligado = false;
    }


    //Retorno dos valores true e false;
    boolean estaLigado(){
        return motor.ligado;
    }
}
