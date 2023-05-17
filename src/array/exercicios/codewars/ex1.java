package array.exercicios.codewars;

//Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
//        [Make sure you type the exact thing I wrote or the program may not execute properly]

public class ex1 {
    public static void main(String[] args) {
        ex1.greet("kaue");
    }
    public static String greet(String name) {

        if (name == null || name.isEmpty()) {
            System.out.println("Name invalid ");
        }

        System.out.println("Hello," +"<"+ name +">"+ " how are you doing today?");

        return name;
    }



}
