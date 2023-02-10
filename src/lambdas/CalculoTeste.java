package lambdas;

import java.util.Scanner;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo soma = new Soma();
        System.out.println(soma.executar(2,5));

        Calculo multiplicaçao = new Multiplicar();
        System.out.println(multiplicaçao.executar(2,6));

        Calculo dividir = new Dividir();
        System.out.println(dividir.executar(2,9));

        Calculo subtracao = new Subtracao();
        System.out.println(subtracao.executar(7,8));


    }

}
