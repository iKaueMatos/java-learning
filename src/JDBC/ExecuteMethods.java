package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ExecuteMethods {
	public static void main(String[]args) throws SQLException {
		Connection connect = Connector.getConectar();
		String sql = "CREATE TABLE Clientes (id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,nome VARCHAR(100),idade INT,bairro VARCHAR(50));";
		Statement query = connect.createStatement();
		
		System.out.println("Tabela criada!");
		query.execute(sql);
		
		connect.close();
	
	}
}
