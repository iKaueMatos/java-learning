package POO.abstrato.empresa;

public class AplicationExecute {
    public static void main(String[] args) {

        //Funcionario -> Gerente
        Funcionario  gerente = new Gerente("Nami",5000);
        Funcionario gerente1 = new Gerente("Kauê de matos oliveira",400);

        System.out.println(gerente + ","+ gerente1);

        Funcionario desenvolvedor = new Desenvolvedor("kaue de matos oliveira",4000,"Java,javascript,HTML,CSS3");
        System.out.println(desenvolvedor);

    }
}
