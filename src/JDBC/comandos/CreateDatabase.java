package JDBC.comandos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import JDBC.Connector;



public class CreateDatabase {
	public static Connection getConnection() {
		
        final String url = "jdbc:mysql://localhost";
        final String usuario = "root";
        final String password = "minhasenha";
    
        
       try {
    	   return  DriverManager.getConnection(url,usuario,password);
       } catch (SQLException e) {
    	   throw new RuntimeException(e);
       
       }
	}
}
