package JDBC;

public class Dados {

    private int id;
    private  String nome;

    private String sobrenome;

    private int idade;

    private String bairro;



    //Construtor
    public Dados(int id,String nome, String sobrenome, int idade, String bairro) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.bairro = bairro;
    }

    public Dados(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
