package Study;

public class TypeString {
    public static void main(String[] args) {
       String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        //Lembrando que em caso de possiveis alterações em algo digitado na nossa variavel String,não vamos conseguir alterar o valor da mesma por completo
        //Somente substituir o valor original que foi dado na variavel String
        System.out.println(s.toLowerCase().startsWith("boa")); // Verifica se a primeira letra e maiuscula metodo startWith
        System.out.println(s.toLowerCase().endsWith("tarde!"));//Verifica e as ultimas palavras são maiusculas
        System.out.println(s.length()); // Verifica quantos caracteres vamos ter na nossa variavel do tipo primitivo String,int ou double
        System.out.println(s.equals("boa tarde")); //Comparação de igualdade basicamente verifica se uma variavel string e igual a um valor dado no metodo,
        //enquals por exemplo; ("boa tarde");
        System.out.println(s.equalsIgnoreCase("boa tarde")); // O metodo de comparação eqaulsIgnoreCase ignora as letras maiusculas ou minusculas e verifica,
        //Se são iguais somente isso!
        System.out.println();

        var name = "kaue de matos oliveira".toUpperCase(); // inferencia
        var age = 19;
        var state = "São paulo";
        var wage = 1.440;

        System.out.println("Me chamo,"+name+",tenho "+age+",moro em "+state + "e ganho "+ wage %4f);
        //%s - string
        //%d - valores inteiros
        //%f - valor float

        System.out.println("Frase qualquer".contains("Qual")); // existe a palavra qual na nossa string? basicamente e isso quefuncionalidade
        //contains ira fazer;
        System.out.println("Frase qualquer".indexOf("Qual")); // podemos verificar  indice de uma palavra ou uma lista com indexOf
        //basicamnete conseguimos verificar a posição que aquela palavra esta ou ate mesmo substituir a mesma
        System.out.println("Frase qualquer".substring(6)); // Com o metodo substring conseguimos fazer com que a palavra digitada comece somente a partir do indice dado na substring
        System.out.println("Frase qualquer".substring(6,8)); // podemos definir o começo do indice e final do indice,Entao no caso ate determinado local pode ser exibido!

    }
}
