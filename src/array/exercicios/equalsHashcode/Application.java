package array.exercicios.equalsHashcode;

public class Application {
    public static void main(String[] args) {

     Usuario user1 = new Usuario();
        user1.nome = "Kaue de matos oliveira";
        user1.email = "kaue@gmail.com";


     Usuario user2 = new Usuario();
        user2.nome = "Arthur de matos oliveira";
        user2.email = "cau@gmail.com";


        System.out.println(user1 == user2);
        //User 1 e igual user 2 ?
        //Por não termos alterado nada no equals o resultado sera false
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());


    }
}
