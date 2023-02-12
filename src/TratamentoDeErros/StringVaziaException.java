package TratamentoDeErros;

@SuppressWarnings("serial")
public class StringVaziaException extends  RuntimeException {
    private  String nomeDoAtributo;

    //Construtor
    public StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s esta negativo",nomeDoAtributo);
    }

}
