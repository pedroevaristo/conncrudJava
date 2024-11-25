package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
//por enquanto vou colocar as informações aqui, mas o correto é usar o sprint boot para ler .propities
public class Initialization {
    private Connection conn;
    public Connection InitializationDb(Properties propInit) throws SQLException {
        try{

            String url = propInit.getProperty("database.url");
            String username = propInit.getProperty("database.username");
            String password = propInit.getProperty("database.password");
            return DriverManager.getConnection(url,username,password);//mudei nessa linha aqui 24/11

        }catch (SQLException e) {
            throw new SQLException("Erro ao conectar com banco de dados" + e.getMessage(), e);
        }
    }



}
//aqui tem que retornar a inicialização para outros