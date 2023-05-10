package collections.DojoCollections;

import collections.DojoCollections.dominio.SmartphoneExemplo;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartphoneExemplo s1 = new SmartphoneExemplo("1ABC1","iphone");
        SmartphoneExemplo s2 = new SmartphoneExemplo("1ABC1","iphone");

        System.out.println(s1.equals(s2));//Desta forma aqui chamando equals e comparando um objeto com outro estamos basicamente
        //comparando a referencia dele ao outro objeto ou seja cada objeto tem a sua referencia mais estamos querendo comparar ela com intuito de verificar
        //os valores,o resultado sempre sera falso mesmo os valores que estão dentro sendo iguais

    }
}
