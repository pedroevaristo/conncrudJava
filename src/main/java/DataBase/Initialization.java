package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Initialization {//por enquanto vou colocar as informações aqui, mas o correto é usar o sprint boot para ler .propities
    private Connection conn;
    public Properties InitializationDb(Properties propInit) throws SQLException {
        try{

            String url = propInit.getProperty("database.url");
            String username = propInit.getProperty("database.username");
            String password = propInit.getProperty("database.password");
            conn = DriverManager.getConnection(url,username,password);

        }catch (SQLException e){
            throw new SQLException("Erro ao conectar com banco de dados"+ e.getMessage(),e);
        }
        return; //aqui tem que retornar a inicialização para outros
    }



}
