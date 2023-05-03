package array;
//Array colletions

import java.lang.reflect.Array;

public class Arrray {
    public static void main(String[] args) {
        //Estrutura inidmecional
        double[] notasAluno = new double[5];
        int contador = 0;
        notasAluno[3] = 7.9;
        notasAluno[2] = 6.0;
        notasAluno[1] = 7.0;

        //FOR PERCORRENDO A LISTA!
        double total = 0;
        for (int i = 0; i < notasAluno.length; i++) {
            total += notasAluno[i];
            System.out.println(total / notasAluno.length);
            if (total >= 4) {
                System.out.println("Aluno aprovado");
            }
        }

        //Segunda ARRAY PERCORRENDO
        double[] notasAlunoc = {6.9, 6.4, 7.8};
        int soma = 0;
        for (double nota : notasAlunoc) {
            System.out.println(nota);
        }

    }
}

