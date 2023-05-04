package JDBC;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static Connection getConectar()  {

    try {
        final String url = "jdbc:mysql://localhost/curso";
        final String usuario = "root";
        final String password = "minhasenha";
        
        return DriverManager.getConnection(url,usuario,password);
      
    } catch (SQLException event) {
            //Para verificarmos se vai dar erro ou não!
            throw new RuntimeException(event);
            
        }
    }
}
