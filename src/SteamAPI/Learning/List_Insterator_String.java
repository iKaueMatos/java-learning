package SteamAPI.Learning;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class List_Insterator_String {

    public static void main(String[] args) {
        
    
    
    List<String> aprovados = Arrays.asList("kaue de matos","Rafael","Ana");



//Convensional
for(String nome : aprovados) {
    System.out.println("Usando o foreach");
    System.out.println(nome);
}


        System.out.println("\nUsando o interator"); // Interator contem dois metodos,onde um dos metodos pergunta se existe proximo e
        // outroe outro e me de um elemento para ser armazenado na memoria e utilizado quando solicitado

        //Interator -> interface
        Iterator<String> interator = aprovados.iterator(); // desta forma estamos percorrendo a lista de valores e armazenando um elementos
        //Dentro da variavel it

        //hasNext() -> basicamente verifica se existe um elemento se existir ele continua percorrendo -> Se aprovados == true continue;
        while(interator.hasNext()){
            System.out.println(interator.next()); // next pede a proxima String enquanto existir e armazena
        }

        System.out.println("\nUsando Stream");
        //Definindo uma list -> Interface como Interger
        List<Integer> numerosInteiros = Arrays.asList(1,23,4,5,6,7,8,9);
        //Stream conjunto de objetos de Strings
        Stream<Integer> stream = numerosInteiros.stream();
        stream.forEach(System.out::println);















    //Percorrendo os valores dentro da lista e capturando por posição!
      for(int i = 0; i< aprovados.size(); i++){
          System.out.println("Usando o for");
          System.out.println(aprovados.get(i));
      }





    }

}
