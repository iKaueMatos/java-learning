package ClassesMetodos;

public class Data {
    int dia;
    int mes;
    int ano;

    String DataFormatada(){
        return String.format("&d,%d,%d",dia,mes,ano);
    }

    Data(int DataPadrao, int i, int i1){
        dia =DataPadrao;
        mes = DataPadrao;
        ano = DataPadrao;
    }
    Data(){

    }


}
