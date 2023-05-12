package EstruturaDeDados;

import java.util.Arrays;

public class Learning2 {

    private String[] element;
    private int size;

    //Construct
    public Learning2(int capacity) {
        this.element = new String[capacity];
        this.size = 0;
    }

    public boolean add(String element) throws Exception {

        if(this.size < this.element.length) {
            this.element[this.size] = element;
            this.size++;
        }

        return false;

    }

    //Return Values array
    @Override //Anotation
    public String toString() {
        return "Learning2 [" +
                "Array = " + Arrays.toString(element) +
                ']';
    }

//Teoricamente essa função não tem eficiente quanto poderia ser pela questão de que trabalha sempre verificando e percorrendo todos os
    //Elementos que tem dentro do array com isso ele se torna inificiente
//    public void add(String element) {
//        for(int i = 0; i < this.element.length; i ++){
//            if(this.element[i] == null) {
//               this.element[i] = element;
//               break; //Desta forma o break ira freiar o loop do for consequentemente ira fazer com que o for para
//                //Na primeira posição!
//            }
//        }
//      }

}
