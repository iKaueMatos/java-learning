package POO.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        //Instaciando objetos
        Pessoa convidado = new Pessoa(99.5);
        Arroz ingrediente1 = new Arroz(30);
        Feijao ingrediente2 = new Feijao(20);

        // Basicamente na classe abstrata não possivel instaciar ela como objeto,contudo podemos chamar o tipo dela e instaciar outra
        // classe
        Comida ingrediente3 = new Sorvete(20);

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);

        Sorvete sobremesa = new Sorvete(0.25);
        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());







    }
}
