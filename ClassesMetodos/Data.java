package ClassesMetodos;

public class Data {
    int dia;
    int mes;
    int ano;

    String DataFormatada(){
        return String.format("&d,%d,%d",dia,mes,ano);
    }
}
