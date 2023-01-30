package collections;

import java.util.HashMap;
import java.util.HashSet;

public class set {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // double -> Double transforma em uma classe objeto
        conjunto.add("Kauê");
        conjunto.add(true);

        //Size retorna o tamanho de quantos elementos tem na nossa collection.
        //Lembrando que o size não aceita repetição..
        System.out.println(conjunto.size());
        System.out.println(conjunto.remove("kaue"));
        // remove() - remmove o elemento selecionado da nossa collection e retorna o valor boolean verdadeiro ou falso(true e false).
        System.out.println(conjunto.contains("kaue"));
        //contains - serve para verificar se determinado elemento da nossa collection se esta dentro ou não...Retornando o valor (true ou false)

        HashSet nums = new HashSet();
        nums.add("Ola mundo");
        nums.add("não sei ");

        //Juntando dus collecitons
        conjunto.addAll(nums);

        System.out.println(conjunto);
    }




}
