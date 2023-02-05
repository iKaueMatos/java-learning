package POO.herança.carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Civic() {
            @Override
            void acelerar2() {
                velocidadeAtual += 15;
            }
        };

        c1.acelerar();
        c1.acelerar();

       System.out.println("Velocidade do Civic " + c1);


        //Ferrari

        Ferrari c2 = new Ferrari(500);

        c2.acelerar2();
        c2.acelerar2();
        c2.freiar();
        c2.acelerar2();



        System.out.println("Velocidade da Ferrari " + c2);

    }
}
