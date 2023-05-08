package generics;

public class CaixaTeste {
    public static void main(String[] args) {

        //Definindo o <TIPO> Integer
     Caixa <Integer> caixaA = new Caixa <>();
     caixaA.aguardar(2);

        System.out.println("Valor Int:" + caixaA.abrir());

      //  Definindo o <TIPO> Double
        Caixa <Double> caixaB = new Caixa <>();
        caixaB.aguardar(2.5);

        System.out.println("Valor Double:" + caixaB.abrir());

    }
}
