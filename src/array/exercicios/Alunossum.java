package array.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Alunossum {
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);

        System.out.println("Quantas notas?: ");
        int quantityNote = output.nextInt();
        double[] note = new double[quantityNote];


        double total = 0;
        for (int i = 0; i < note.length; i++) {
            System.out.println("Informe a nota: " + (i + 1) + ":");
                note[i] = output.nextInt();

           for (double notes : note) total += notes;

        }
        double average = total / note.length;
        System.out.println("Number total:" + average);
        output.close();
    }
}
