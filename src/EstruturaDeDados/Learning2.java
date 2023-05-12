package EstruturaDeDados;

public class Learning2 {

    private static String[] element;
    private static int size;

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

    public static String search(int position) {

        if(!(position >= 0 && position < size)){
            throw new IllegalArgumentException("Posição invalida");
        }
        System.out.println("Number sendo retornado!");
        return element[position];

    }

    //Element exist ?
    public int elementExist(String element) {
        for (int i = 0; i < Learning2.size; i++) {
            if (Learning2.element[i].equals(element)) return i;
            System.out.println("Element verification exist!");
        }
        return -1;
    }

    //return size
    public int size() {
        return this.size;
    }


    //Return Values array
    @Override //Anotation
    public String toString() {
        StringBuilder arraycomplex = new StringBuilder();
        arraycomplex.append("[");

        for (int i = 0; i < this.size-1; i ++){
            arraycomplex.append(this.element[i]);
            arraycomplex.append(",");
        }

        if(this.size > 0){
            arraycomplex.append(this.element[this.size -1]);
        }

        arraycomplex.append("]");
        return arraycomplex.toString();
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
