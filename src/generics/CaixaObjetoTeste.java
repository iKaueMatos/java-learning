package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.aguardar(2.3); // double -> Double

        Double coisa = (Double) caixaA.abrir(); // Cast convertendo um valor Double para int
        System.out.println(coisa);


        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.aguardar("Olá");

        //Cast foi possivel fazer
        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);

    }
}
