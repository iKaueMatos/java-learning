package generics;

//Definindo um tipo generics que no caso seria um <TIPO>
public class Caixa<TIPO> {

    private TIPO coisa;

    public void aguardar(TIPO coisa) {
        this.coisa = coisa;
    }

    public Object abrir() {
        return coisa;
    }



}
