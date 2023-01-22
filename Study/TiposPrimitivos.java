package Study;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações de funconarios

        //Tipos numericos inteiros;
        byte anosDeEmpresa = 4;
        short numeroDeVoos = 542;
        int identificacao = 5;
        long pontosAcumulados = 324575824L;

        //tipos numericos reais;

        float salario = 4.5887F;
        double vendaAcumuladas = 4.5577889;

        //Tipo boolean

        boolean estaDeFerias = false;

        //Tipo caractere;
        char status = 'a';

        // Dias de empresa calculo;
        System.out.println(anosDeEmpresa * 365);

        //Numero de viagens;
        System.out.println(numeroDeVoos / 2);

        // Pontos acumulados por real
        System.out.println(pontosAcumulados / vendaAcumuladas);

        System.out.println(identificacao + "ganha ->" + salario);
        System.out.println("Ferias ? "+estaDeFerias);

    }

}
