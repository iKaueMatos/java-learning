public class DataTeste {
    public static void main(String[] args) {

        //Construtor Padrão 1;
        Data d1 = new Data();

        //Construtor criado 2;
        var d2 = new Data(31,12,2020);

        String dataFormatada1 = d1.obterDataFromatada();

        System.out.println(dataFormatada1);


    }

}
