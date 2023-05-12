package EstruturaDeDados.Application;

import EstruturaDeDados.Learning2;

import java.util.Scanner;

public class execute2 {
    public static void main(String[] args) throws Exception {

        Learning2 array = new Learning2(10);

//        Scanner Prohibited = new Scanner(System.in);
//        System.out.println("Digite a capacidade do array: ");
//        int capacity = Prohibited.nextInt();

        array.add("Kauê de matos oliveira");
        array.add("kaue");
        array.add("arthur de matos oliveira");
        array.add("arthur");
        array.add("clea");
        array.add("Olá mundo!!");

        System.out.println(array);

    }
}
