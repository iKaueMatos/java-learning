package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetLista {
    //Conjunto comportamento

    public static void main(String[] args) {


        //Basicamente quando faço essa referencia set<string> e tambem no HashSet<String>,eu especifico isso basicmanete estou dizendo que so quero adicionar esse tipo
        //De elemento na nossa lista ou seja (Tipo primitivo -> String);
        Set<String> lista = new HashSet<String>(); // <> Amarrando o tipo primitivo! para a lista
        lista.add("Kaue de matos oliveira ");
        lista.add("Pedro");
        lista.add("Carlos");
        lista.add("Roberto");// Então aqui eu so posso receber o tipo String
        // porque foi especificado logo acima que so pode ser passado esse tipo primitivo;

        System.out.println(lista);

        for (String canditato : lista) {
            System.out.println(canditato);
        }


        //--> Segundo tipo de lista TREESET<>();

            //Basicamente quando faço essa referencia set<string> e tambem no HashSet<String>,eu especifico isso basicmanete estou dizendo que so quero adicionar esse tipo
            //De elemento na nossa lista ou seja (Tipo primitivo -> String);
            SortedSet<String> listaAprovados = new TreeSet<>(); // <> Amarrando o tipo primitivo! para a lista
            lista.add("Kaue de matos oliveira ");
            lista.add("Pedro");
            lista.add("Carlos");
            lista.add("Roberto");// Então aqui eu so posso receber o tipo String
            // porque foi especificado logo acima que so pode ser passado esse tipo primitivo;

            for (String ListaEmOrdem : listaAprovados) {
                System.out.println("Segunda " + ListaEmOrdem);
            }

            // HashSet -> não garante a ordem de excensão !
            // Treeset -> Garante a ordem de excensão !
        }
    }

