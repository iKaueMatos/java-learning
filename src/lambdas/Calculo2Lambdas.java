package lambdas;

public class Calculo2Lambdas {
    public static void main(String[] args) {
        //Função lambda
        Calculo soma = (x, y) -> { return x + y;};
        System.out.println("Soma: ");
        System.out.println(soma.executar(2,6));

        Calculo multiplicacao = (x,y) -> {
            return x * y;
        };
        System.out.println("Multiplicação: ");
        System.out.println(multiplicacao.executar(4,6));

        //divisão
        Calculo divisao = (x,y) -> {
            return x / y;
        };
        System.out.println("Divisão: ");
        System.out.println(divisao.executar(5,9));
    }
}