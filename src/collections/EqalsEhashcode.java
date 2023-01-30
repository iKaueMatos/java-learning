package collections;

import array.Usuario;

public class EqalsEhashcode {

    ///Atributos
    // equals
    // Todo objeto inpedente se e do java ou uma classe com objeto -> criado por você recebe como padrao o equals
    //Dentro do metado equals você ira verificar se um determinado objeto e igual a outro
    // No caso equals sehttps://github.com/iKaueMatos/Java-POOmpre resulta em retorna de se true ou false,Equals sempre vai olhar os endereços da memoria
    //Retorna o valor boolean
    //Verificação:
    //p1.caneta == p2.caneta;
    //p1.equals(p2);
    //Hashcode - Tem como objetivo separar aquilo que tem perigo de não ser igual e retorna em numero aquela quatidade de objetos que podem ser iguais
    //dando assim apossibilidade de utilizar eqauls para verificar cada objeto! (ao seu criterio)

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Kauê de matos oliveira ";
        u1.email = "pedro.silva@gmail.com";


        Usuario u2 = new Usuario();
        u2.nome = "Kauê de matos oliveira ";
        u2.email = "pedro.silva@gmail.com";
        //comparando se um objeto tem o mesmo endereço ao outro;
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        //Igualdade
        System.out.println(u1 == u2);
        System.out.println(u2 == u1);

        }
    }





