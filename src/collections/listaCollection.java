package collections;

import java.util.ArrayList;

public class listaCollection {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("kauê");
        lista.add(new Usuario ("KAUE DE MATOS"));
        lista.add(new Usuario ("kaue matos"));
        lista.add(new Usuario ("Matos"));
        lista.add(new Usuario ("de"));

        for (Usuario u: lista){ // podemos referenciar tambem o indice da lista para ser impresso com .get() -> desta forma retornaremos o valor da lita

            System.out.println(u);
        }

    }


}
