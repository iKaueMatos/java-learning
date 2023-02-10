package lambdas;

public class Calculo2Lambdas {
    public static void main(String[] args) {
        //Função lambda
        Calculo soma = (x, y) -> {
            return x + y;
        };
        System.out.println(soma.executar(2,6));
    }
}