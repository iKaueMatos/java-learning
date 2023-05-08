package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer,String> usuarios = new HashMap<Integer,String>();
            usuarios.put(1,"roberto");
        System.out.println(usuarios); // Adicionando na lista dois valores,Podendo ate mesmo substituir os valores que ja foram colocados anteriormente;
        //Sobre escrevendo o valor antigo dado pelo desenvolvedor;
        usuarios.put(2,"Kauê");
        System.out.println(usuarios);
        System.out.println(usuarios.size()); //retornando a quantidade de elementos dentro da collection
        System.out.println(usuarios.keySet()); // Exibe os valores na tela ou seja a quantidade de elementos que tem dentro da nossa collection (array);
        System.out.println(usuarios.values()); // retorna os valores no caso somente os nomes dentro de uma lista
        System.out.println(usuarios.entrySet()); // consegue retornar chave e valor a mesmo tempo;
   //Percorrendo os valores de um map

        for(int chave: usuarios.keySet()){
            System.out.println("Percorrendo as chaves" + chave);
        }

        //Valores -> nomes = Strings
        for(String valor : usuarios.values()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer,String> registro : usuarios.entrySet()){
            System.out.println(registro.getKey()  + "==>" );
            System.out.println(registro.getValue());
        }

    }
}
