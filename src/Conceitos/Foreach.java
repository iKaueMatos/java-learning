package Conceitos;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = { 9.9,8.7,7.2,9.2 };
        //for each - percorrendo a lista;

        for (double nota : notas){
            System.out.println(nota + "");
        }
    }
}
