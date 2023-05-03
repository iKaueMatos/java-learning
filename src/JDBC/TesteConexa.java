package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexa {
    public static void main(String[] args) {

        final String url = "";
        final String usuario = "";
        final String password = "";

        try {
            Connection connection = DriverManager.getConnection(url,usuario,password);
            System.out.println("Conectado!");
        } catch (SQLException event) {
            //Para verificarmos se vai dar erro ou não!
            throw new RuntimeException(event);
        }
    }
}
