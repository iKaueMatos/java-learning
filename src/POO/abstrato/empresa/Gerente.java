package POO.abstrato.empresa;

public class Gerente extends Funcionario {


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    //Metodo reecrito !
    @Override
    public void calculaBonificacao() {
        this.salario = this.salario + this.salario * 20;
    }

    //Metodo da classe filha -> Pessoa()
    @Override
    public void imprime() {
        System.out.println("Imprime");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }


}
