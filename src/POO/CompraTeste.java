package POO;

public class CompraTeste {

    public static void main(String[] args) {

        compra compra1 = new compra();
        compra1.cliente = "Kaue de matos oliveira";
        //Relacionamento de itens
        compra1.adicionarItem(new Item("caneta",150,50));
        compra1.adicionarItem(new Item("Borracha",3 ,20));



        System.out.println("Informações do produto: "+ compra1.getValorTotal());
        System.out.println("");


    }

}
