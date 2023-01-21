package Study;
import java.util.Scanner;
public class Fundamentos {
     public static void main(String[] args) {
          //Primeiro e segundo numero
          int one,two;
          //Operações
          int Multiplicacao,subtracao,soma,Divisao;
          //Nome do usuario
          String Nome ;
          //Entrada
          int OperacaoCalculo;

          Scanner entrada = new Scanner(System.in);
          System.out.println("Digite seu nome: ");
          Nome = entrada.next();


          System.out.println("Calculadora");
          // nome do usuario retorno
          System.out.println("Nome digitado "+ Nome);

          //Operação
          Scanner operacao = new Scanner(System.in);
          System.out.println("Qual operação  você quer,"+ Nome );
          System.out.println("Digite um numero para escolher uma das opções abaxio:");
          System.out.println("1-Adição \n" + "2-Subtração \n" + "3-Multiplicação \n" + "4-Divisão \n" + " 0-Sair");
          OperacaoCalculo = operacao.nextInt();

          switch (OperacaoCalculo){
               case 0:
                    System.out.println("Saindo do programa Sr."+ Nome +",Parando a execução");
                    break;

               case  1:
                    System.out.println("Digite seu Primeiro numero: ");
                    one = entrada.nextInt();
                    System.out.println("Digite seu segundo numero: ");
                    two = entrada.nextInt();
                    soma = one +  two;

                    System.out.println("Soma dos valores:" + one + "+" + two + "= " + soma);
                    System.out.println("Calculo feito Sr."+ Nome);

               case 2:

                    System.out.println("Digite seu Primeiro numero: ");
                    one = entrada.nextInt();
                    System.out.println("Digite seu segundo numero: ");
                    two = entrada.nextInt();

                    subtracao = one - two;

                    System.out.println("Subtração dos valores:" + one + "-" + two + "= " + subtracao);
                    System.out.println("Calculo feito Sr."+ Nome);

               case 3:

                    System.out.println("Digite seu Primeiro numero: ");
                    one = entrada.nextInt();
                    System.out.println("Digite seu segundo numero: ");
                    two = entrada.nextInt();

                    Multiplicacao = one * two;
                    System.out.println("Multiplicação dos valores:" + one + "*" + two + " = " + Multiplicacao);
                    System.out.println("Calculo feito Sr."+ Nome);

               case 4:

                    System.out.println("Digite seu Primeiro numero: ");
                    one = entrada.nextInt();
                    System.out.println("Digite seu segundo numero: ");
                    two = entrada.nextInt();

                    Divisao = one / two;

                    System.out.println("Multiplicação dos valores:" + one + "/" + two + " = " + Divisao);
                    System.out.println("Calculo feito Sr."+ Nome);

               default:
                    System.out.println("Fechando Programa");
                    break;

          }
     }
}
