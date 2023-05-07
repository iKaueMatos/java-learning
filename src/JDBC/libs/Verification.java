package JDBC.libs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JDBC.Connector;

public class Verification {

	    private  String nome;

	    private String sobrenome;

	    private int idade;

	    private String bairro;


	    public Verification(String nome, String sobrenome, int idade) {
	        this.nome = nome;
	        this.sobrenome = sobrenome;
	        this.idade = idade;
	    }

	    public static void verificationName(String nome) {
	        boolean alphabetic = Character.isAlphabetic((nome.charAt(nome.length() - 1)));
	        if(Character.isAlphabetic(nome.charAt(0)) && alphabetic) {
	            System.out.println("Correto!");
	        }else{
	            System.out.println("Esse nome não e permitido!");
	        }
	    }

	    public static boolean verificationNumber(int idade){
	        String idadeStr = Integer.toString(idade);
	        boolean match = idadeStr.matches("\\d+");

	        return match;
	    }

	   
	    public static void insertTable(String nome,int idade, String bairro, String sobrenome) throws SQLException {
	        Connection connector = Connector.getConectar();
	        String sql = "INSERT INTO clientes (nome, idade, bairro, sobrenome) VALUES (?, ?, ?, ?)";
	        PreparedStatement executeQuery = connector.prepareStatement(sql);
	        executeQuery.setString(1, nome);
	        executeQuery.setInt(2, idade);
	        executeQuery.setString(3, bairro);
	        executeQuery.setString(4, sobrenome);

	        executeQuery.execute();
	        System.out.println("Dados inseridos com sucesso!");
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
	}

