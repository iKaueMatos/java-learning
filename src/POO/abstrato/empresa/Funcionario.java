package POO.abstrato.empresa;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonificacao();
    }



    public abstract void calculaBonificacao();



}
