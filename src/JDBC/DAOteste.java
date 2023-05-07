package JDBC;

import java.sql.SQLException;

public class DAOteste {
    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO Clientes (nome) VALUES (?)";
        System.out.println( dao.include(sql,"Joao da silva"));
        System.out.println(dao.include(sql,"Ana julia"));
        System.out.println(dao.include(sql,"Ana julia pereira"));

        try {
            dao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }
    }

