package Study;

import java.util.ArrayList;
import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        String usuario,usuario1,usuario2;

        System.out.println("Digite o seu primeiro salario: ");
        usuario = entrada.nextLine().replace(",",".");
        System.out.println("Digite o seu segundo salario: ");
        usuario1 = entrada.nextLine().replace(",",".");
        System.out.println("Digite o seu terceiro salario: ");
        usuario2 = entrada.nextLine().replace(",",".");


        double valor1 = Double.parseDouble(usuario);
        double valor2 = Double.parseDouble(usuario1);
        double valor3 = Double.parseDouble(usuario2);
        double media = (valor1 + valor2 + valor3) / 3;

        System.out.println("A media dos salario e: " + media);
        entrada.close();
    }
}

