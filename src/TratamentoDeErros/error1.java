package TratamentoDeErros;

//Tratamento de erro 1
public class error1 {
    public static void main(String[] args) {

//        try {
//            System.out.println(7 / 0);
//        }catch (Exception excecao){
//            throw new IllegalArgumentException("ERRO O PEDRO ESTA NA CALL");
//        }

        //Erro para retornar na linha
        try{
            System.out.println(8/0);
        }catch (ArithmeticException e){
            System.out.println("Ocorreu o erro: "+ e.getMessage());
        }
        System.out.println("FIM :)");

    }
}
