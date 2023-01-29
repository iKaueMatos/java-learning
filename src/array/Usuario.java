package array;

import java.lang.invoke.StringConcatFactory;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto){

      if(objeto instanceof Usuario){
//Faz a comparação entre dois Objects, e retorna true se os objetos forem o mesmo, e false se não forem o mesmo.
// É útil para saber se dois objetos apontam para o mesmo local na memória.
          Usuario outro = (Usuario) objeto;
          boolean nomeIgual = outro.nome  == this.nome;
          boolean emailIgual = outro.email == this.email;
          return nomeIgual && emailIgual;
      }else{
          return false;
          }
//Hashcode sera abordado em outra aula;
    }
}
