public class ValorVSReferencia {
    public static void main(String[] args) {


        //Atribuição por (tipo primitivo);
        double a = 2;
        double b = a; //Atribuição de valor; No caso o valor de B recebeu o valor de A; Uma copia do valor De A foi atribuida ao valor de
        //B

        a++; // Acresentando + 1
        b--; //Decrementando - 2

        System.out.println("Valor de A:" + a + "\n Valor de B:" + b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // Atribuição por referencia (objeto);

        d1.dia = 31; //Qualquer coisa que eu fizer aqui sera apontado para os dois objetos,isso acontece por que os 2 esta relacionado ao mesmo espaço de memoria
        // por conta disso a alteração que feita em 1 acaba  sendo feita no outro;
        d2.mes = 12;

        System.out.println(d1.obterDataFromatada());
        System.out.println(d2.obterDataFromatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFromatada());
        System.out.println(d1.obterDataFromatada());
        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    //Um metodo static so consegue acessar o mesmo metodo static
    static void voltarDataParaValorPadrao(Data d){ // passando um objeto como parametro visto isso quando alteramos dentro do nosso metodo
        //ele sera alterado na nossa memoria;
        d.mes = 1;
        d.dia = 1;
        d.ano = 1970;
    }


    //Alterando um primitivo

    static void alterarPrimitivo(int a){
        a++;

    }
}
