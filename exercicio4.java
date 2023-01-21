import java.util.Scanner;

public class exercicio4 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            //Array
            int[] valores = new int[4] ;

            System.out.print("Exercício 4, leia o enunciado.\n\n"); //Desisto!
            int i = 0;
            for(i=0; i<4; i++){
                System.out.print("Digite o valor "+(i+1)+": ");
                valores[i] = entrada.nextInt();
            }

            System.out.print("\nResultados:\n\n");

            System.out.print("Valor 1 e Valor 2:\n");
            System.out.print("	"+valores[0]+" + "+valores[1]+" = "+(valores[0]+valores[1])+"\n");
            System.out.print("	"+valores[0]+" * "+valores[1]+" = "+(valores[0]*valores[1])+"\n\n");

            System.out.print("Valor 1 e Valor 3:\n");
            System.out.print("	"+valores[0]+" + "+valores[2]+" = "+(valores[0]+valores[2])+"\n");
            System.out.print("	"+valores[0]+" * "+valores[2]+" = "+(valores[0]*valores[2])+"\n\n");

            System.out.print("Valor 1 e Valor 4:\n");
            System.out.print("	"+valores[0]+" + "+valores[3]+" = "+(valores[0]+valores[3])+"\n");
            System.out.print("	"+valores[0]+" * "+valores[3]+" = "+(valores[0]*valores[3])+"\n\n");

            System.out.print("Valor 2 e Valor 3:\n");
            System.out.print("	"+valores[1]+" + "+valores[2]+" = "+(valores[1]+valores[2])+"\n");
            System.out.print("	"+valores[1]+" * "+valores[2]+" = "+(valores[1]*valores[2])+"\n\n");

            System.out.print("Valor 2 e Valor 4:\n");
            System.out.print("	"+valores[1]+" + "+valores[3]+" = "+(valores[1]+valores[3])+"\n");
            System.out.print("	"+valores[1]+" * "+valores[3]+" = "+(valores[1]*valores[3])+"\n\n");

            System.out.print("Valor 3 e Valor 4:\n");
            System.out.print("	"+valores[2]+" + "+valores[3]+" = "+(valores[2]+valores[3])+"\n");
            System.out.print("	"+valores[2]+" * "+valores[3]+" = "+(valores[2]*valores[3])+"\n\n");
        }

    }

