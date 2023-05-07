package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection connector;

    public int include(String sql,Object... atributos) {
        try {
            PreparedStatement stmt = getConnector().prepareStatement(
                    sql, PreparedStatement.RETURN_GENERATED_KEYS);
            addAtributes(stmt,atributos);

            if(stmt.executeUpdate() > 0) {
                ResultSet result = stmt.getGeneratedKeys();
                if(result.next()) {
                    return result.getInt(1);
                }
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void addAtributes(PreparedStatement stmt,Object[] atributos) throws SQLException {

        int index = 1;
        for(Object atributo : atributos){
            if(atributo instanceof String){
                stmt.setString(index,(String)atributo);
            }else if(atributo instanceof Integer) {
                stmt.setInt(index,(Integer) atributo);
            }
            index ++;
        }
    }

    public void close() throws SQLException {
        getConnector().close();
    }


    private Connection getConnector() {
       try {
           if (connector != null && !connector.isClosed()) {
               return connector;
           }
       }catch(SQLException e){

       }
        connector = Connector.getConectar();
        return connector;
    }
}
