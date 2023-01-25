package ClassesMetodos;

public class DataTeste {
    public void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 30;
        d1.mes = 8;
        d1.ano = 2003;

        System.out.println(d1.DataFormatada());
    }
}
