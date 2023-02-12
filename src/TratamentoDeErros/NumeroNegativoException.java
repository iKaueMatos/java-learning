package TratamentoDeErros;


@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException {

    private  String nomeDoAtributo;

    //Construtor
    public NumeroNegativoException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s esta negativo",nomeDoAtributo);
    }


}
