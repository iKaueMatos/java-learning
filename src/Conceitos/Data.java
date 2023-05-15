package Conceitos;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia= 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaInicial,int mesInicial,int anoInicial){

        //this Aponta para objeto atual qe esta executando esse codigo
       this.dia = diaInicial;
        this.mes = mesInicial;
        this.ano = anoInicial;
    }

    String obterDataFromatada() {
        return  String.format("%d/%d/%d",dia,mes,ano);
    }

}