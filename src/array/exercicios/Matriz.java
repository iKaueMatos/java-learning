package array.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);


        System.out.print("Quantity students?: ");
        int quantityStudents = output.nextInt();

        System.out.println("Quantity and note Students?:");
        int qtdeNotes = output.nextInt();

        double[][] noteClass = new double[quantityStudents][qtdeNotes];

        double total = 0;
        for (int students = 0; students < noteClass.length; students++) {
            for (int note = 0; note < noteClass[students].length ; note ++) {
                System.out.printf("info note %d and students %d: ",note + 1,students + 1);
                //Note receive students and note!
                noteClass[students][note] = output.nextDouble();
                //Sum
                total += noteClass[students][note];
            }
        }

        double average = total / (quantityStudents * qtdeNotes);
        System.out.println("Average class and?:" + average);

        for (double[] noteStudents: noteClass) System.out.println(Arrays.toString(noteStudents));

        output.close();
    }
}
