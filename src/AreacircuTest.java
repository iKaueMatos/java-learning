public class AreacircuTest {
    public static void main(String[] args) {

        //Metodo 1
        AreaCirc a  = new AreaCirc(10);
       /*
         a.pi = 10;
        Acessando o atributo pi diretamente da classe
        O valor de pi esta associado a Classe;
        */


        System.out.println(a.area());

        //Metodo 2
        AreaCirc a1  = new AreaCirc(10);


        System.out.println(a1.area());
    }

}
