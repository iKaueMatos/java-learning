package ClassesMetodos;
import java.util.Scanner;
public class Calculo {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        Calculadora c2 = new Calculadora();



        Scanner entrada = new Scanner(System.in);
        for(int contador= 0;contador <= 2;){
            System.out.println("Digite seu primeiro "+contador+" numero: " );
            c1.numero1 = entrada.nextInt();
            c2.numero2 = entrada.nextInt();
            contador ++;
        }
        int soma = c1.soma() ;

        System.out.println(soma);
    }
}
