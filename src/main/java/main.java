import Config.LoadConfiguration;
import Config.Loader;

import java.sql.SQLException;

public class main {//Fazendo conxeão e crud usando padrões de projeto



    public static void main(String[] args) throws SQLException {
        //refazer a conexão com banco de dados postgreSQL
        LoadConfiguration.LoadConfig();

    }
}
