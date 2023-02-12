package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {


        Function<Integer, String> parOuImapar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImapar.apply(34));

        Function <String,String> oResultadoE = valor -> "O resultado e: " + valor;

        Function<String,String> empolgado = valor -> valor + "!!!";

        String resultadoFinal = parOuImapar.andThen(oResultadoE).andThen(empolgado).apply(32);

        System.out.println(resultadoFinal);
    }
}
