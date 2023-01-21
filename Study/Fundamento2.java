package Study;

public class Fundamento2 {
//Calculo da area da circunferencia;
    public static void main(String[] args) {
        double raio = 3.4;
        //Se quisermos bloquear a troca de um vaor de uma variavel podemos declarar na nossa variavel o final (Metodo para garantir que aquele argumento não
        // seja mmodificado futuramente);

        final double pi = 3.14159;
        double area = pi * raio * raio;

        System.out.println("O resultado da circunferencia e de: "+ area);
    }
}
