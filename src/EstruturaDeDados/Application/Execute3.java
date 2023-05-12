package EstruturaDeDados.Application;

import EstruturaDeDados.Learning2;

import static EstruturaDeDados.Learning2.search;

public class Execute3 {
    public static void main(String[] args) throws Exception {

        Learning2 array = new Learning2(10);

        array.add("Elemento 1"); // 0
        array.add("Elemento 2"); // 1
        array.add("Elemento 3"); // 2

        System.out.println(array);

        //Captured position
        System.out.println(array.elementExist(search(2)));

    }
}
