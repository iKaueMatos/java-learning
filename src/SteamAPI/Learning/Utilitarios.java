package SteamAPI.Learning;

import java.util.function.UnaryOperator;

public class Utilitarios {

    //Contrutor private de forma bloquei o instaciação do construtor
    private Utilitarios() {

    }

   public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    public final static UnaryOperator<String> grito = n -> n + "!!! ";


}
