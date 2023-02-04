package POO;

import java.util.ArrayList;

public class compra {
    //Relação biridiconal
    //Relação de um para N  -> uma compra tem muitos itens onde pode ser comprados quantidade identerminada
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();


    //Função onde retorna itens e fazuma -> relação entre eles;
    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this;
    }

    double getValorTotal(){
        double total = 0;
        for(Item item:  itens ){
            total += item.quantidade * item.preco;

        }
        return total;
    }

}
