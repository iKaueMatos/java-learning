package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexa {
    public static void conectar()  {

        final String url = "jdbc:mysql://localhost";
        final String usuario = "root";
        final String password = "minhasenha";

        try {
            Connection connection = DriverManager.getConnection(url,usuario,password);
            System.out.println("Conectado!");
        } catch (SQLException event) {
            //Para verificarmos se vai dar erro ou não!
            throw new RuntimeException(event);
        }
    }
}
