package br.com.alura.bytebank.domain.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection conector() {

        String database = "bytebank";
        String user = "root";
        String password = "minhasenha";
        try {

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database + "?user=" + user + "&password=" + password);

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro ao se conectar!");
        }
    }
}
