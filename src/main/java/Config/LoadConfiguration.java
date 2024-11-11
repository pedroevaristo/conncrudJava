package Config;

import DataBase.Initialization;

import java.sql.SQLException;
import java.util.Properties;

public class LoadConfiguration {
    private Loader loader;
    public static void LoadConfig() throws SQLException {
        Loader loader = new Loader();
        Properties propInit = loader.LoaderInforConfig();
        Initialization initialization = new Initialization();
        initialization.InitializationDb(propInit);



    }
}
