package Study;

public class TiposPrimitivosNumerico {
    public static void main(String[] args) {
        double a = 1; // Tipo primitivo double
        float b = 10200F;
        System.out.println(a);
        System.out.println(b);

        //conversao Explicita basicamente podemos mudar um tipo primitivo de uma variavel declarando que queremos mudar realmente aquilo
        //Desta maneira

        float c = 4.5f;
        double d = (double) c;
        System.out.println(d);
    }
}
