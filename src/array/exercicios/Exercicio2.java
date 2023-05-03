package array.exercicios;

import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 4.5;
        notasAlunoA[1] = 5.4;
        notasAlunoA[2] = 4.3;
        notasAlunoA[3] = 4.5;

        System.out.println(Arrays.toString(notasAlunoA));
        double total = 0;

        for(int i = 0; i <notasAlunoA.length;i++) {
            total += notasAlunoA[i];
        }

        System.out.println(total / notasAlunoA.length);

        double[] notasAlunoB = {22,43,4,3,3};
        double totalAluno = 0;
        for (int b = 0; b < notasAlunoB.length; b++) {
            totalAluno += notasAlunoB[b];
        }

        System.out.println(totalAluno / notasAlunoB.length);

    }
}
