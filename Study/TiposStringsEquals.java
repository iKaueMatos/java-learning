package Study;

public class TiposStringsEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2"); // essa maneira não e o tipo correto,Temos tambem outra forma
        // um pouco mais eficaz de fazer

        String S = new  String("2");
        System.out.println("2" == S);
        System.out.println("2".equals(S)); // Aqui estamos verificando o conteudo que tem entro da nossa variavel
        //De tipo string




    }
}
