package array;

import java.util.Scanner;

public class NotasTurma {
    public static void main(String[] args) {
        int alunos,qtdAlunos,qtdNotas;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos: ");
        qtdAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno: ");
        qtdNotas = entrada.nextInt();

        //Criação de array
        double[] [] notasDaTurma = new double[qtdAlunos][qtdNotas];


        double total = 0;
       for(int a = 0; a < notasDaTurma.length; a++){
           for(int n = 0; n < notasDaTurma[a].length; n++){
               System.out.printf("Informe a nota %d do aluno %d: " , n,a);
               notasDaTurma[a][n] = entrada.nextDouble();
               total += notasDaTurma[a][n];

           }
       }


      double media = total / (qtdAlunos * qtdNotas);
    System.out.println("A total de notas de cada aluno e de: " + total);

        entrada.close();


    }
}
