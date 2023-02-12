package TratamentoDeErros;

public class ChecadaVsNãoChecada {
    public static void main(String[] args) {

    //    geraErro1();



    }
    //Exceção checada e verificada

    static void geraErro2() throws Exception{
        throw  new Exception("Ocorreu um erro bem legal 1 - Verificado e checado");
    }

    //Exceção NÃO CHECADA ou NÃO VERIFICADA
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro 2 - Não checado e não verificado");
    }
}

