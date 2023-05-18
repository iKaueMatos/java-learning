/*Use uma lista para resolver o problema abaixo. Uma empresa paga seus vendedores com base em comissões. O vendedor recebe $ 200 por semana mais 9% de suas vendas brutas naquela semana. Por exemplo, um vendedor que teve vendas brutas de $ 3.000 em uma semana recebe $ 200 mais 9% de $ 3.000, ou seja, um total de $ 470. Escreva um programa (usando uma matriz de contadores) que determine quantos vendedores receberam salários nas seguintes faixas de valores:

     $ 200 - $ 299
     $ 300 - $ 399
     $ 400 - $ 499
     $ 500 - $ 599
     $ 600 - $ 699
     $ 700 - $ 799
     $ 800 - $ 899
     $ 900 - $ 999
     $ 1000 em diante

Desafio: Criar uma fórmula para chegar à posição de lista a partir do salário, sem fazer vários ifs aninhados.
*/

package ExerciciosArray;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> fees = new ArrayList<>();

        boolean addSalaty = true;
        while(addSalaty) {
            System.out.println("Gross sale value: ");
            double sale = scan.nextDouble();
            double salary = 200 + (sale * 0.3);
            fees.add(salary);
            
            while(true) {
                System.out.println("Type Y to continue and N to exit!"); //Digite Y para continuar e N para sair
                System.out.println("Do you want continue? "); // Deseja continuar ?
                String result = scan.next();
                if(result.equalsIgnoreCase("Y")){ // yes
                    break;
                }else if (result.equalsIgnoreCase("N")) { // No
                    addSalaty = false;
                    break;
                }else{
                    System.out.println("Enter with \"Y \" or \"N\"");
                    continue;
                }
            }
        }

        
            int a = 0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
        
        for(double value: fees) {
            if(value <= 299){
                a ++;
            } else if (value <= 399) {
                b ++;
            } else if (value <= 499) {
                c ++;
            } else if (value <= 599) {
                d ++;
            } else if (value <= 699) {
                e ++;
            } else if(value <= 799) {
                f ++;
            } else if (value <=899) {
                g ++;
            } else if(value <= 999) {
                h ++;
            } else if (value <= 1000) {
                i ++;
            }
        }

        System.out.println("-------");
        System.out.println(fees);

    }
}
