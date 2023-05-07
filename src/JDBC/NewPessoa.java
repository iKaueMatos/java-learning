package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewPessoa {
	public static void main(String[] args) throws SQLException{
		
		Scanner output = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = output.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = output.nextLine();
		
		System.out.println("Digite seu idade: ");
		String idade = output.nextLine();
		
		System.out.println("Digite seu bairro: ");
		String bairro = output.nextLine();
		
		Connection connector = Connector.getConectar();
	        String sql = "INSERT INTO clientes (nome, idade, bairro, sobrenome) VALUES (?, ?, ?, ?)";
	        PreparedStatement executeQuery = connector.prepareStatement(sql);
	        executeQuery.setString(1, nome);
	        executeQuery.setString(2, sobrenome);
	        executeQuery.setString(3, idade);
	        executeQuery.setString(4, bairro);
	        
	        executeQuery.execute();
	        System.out.println("Dados inseridos com sucesso!");
		
	}

}
