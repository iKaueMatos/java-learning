package POO.abstrato.empresa;

public class Desenvolvedor extends Funcionario{

    private String hardSkill;

    public Desenvolvedor(String nome, double salario,String hardSkill) {
        super(nome, salario);
        this.hardSkill = hardSkill;
    }

    //Metodo reecrito calculo de bonificação
    @Override
    public void calculaBonificacao() {
       this.salario = this.salario + this.salario * 10;
        System.out.println("Salario calculado com sucesso!" + "Desenvolvedor: " + this.nome);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario= " + salario + "," +
                "HardSkill=" + hardSkill +
                '}';
    }

    @Override
    public void imprime() {

    }
}
