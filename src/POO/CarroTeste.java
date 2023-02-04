package POO;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.ligar();
        System.out.println(c1.ligar());
        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.acelerar());

    }

}