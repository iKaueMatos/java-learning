package array;

import java.util.Scanner;

public class ArrayAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas: ");
        double qtdNotas = entrada.nextDouble();
        //referenciando valores qtdNotas para criar um array - com as posições escolhidas pelo usuario;
        double[] notas = new double [(int) qtdNotas];

        switch ((int) qtdNotas){
            case 5:
                for (int  i = 0; i < notas.length; i++){
                    System.out.println("Informwe sua nota: "+ (i+ 1) +": ");
                    notas[i] = entrada.nextInt();

                }
                double total = 0;
                for (double nota : notas){
                    total += nota;
                }
                double media = total / notas.length;
                System.out.println("A media do aluno e de: " + media);
            case 6:
               throw  new  IllegalArgumentException("Erro escolha um numero de notas equivalente as materias da sua sala de aula! ");

        }

    entrada.close();


    }
}
