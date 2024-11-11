package Config;

import java.util.Properties;

public class Loader {//onde vai ter asw informações do banco de dados
    private Properties prop = new Properties();
    public Properties LoaderInforConfig(){
        prop.setProperty("database.url","jdbc:postgresql://localhost:5432/registerCrud");
        prop.setProperty("database.username",System.getenv().getOrDefault("db_username","postgres"));
        prop.setProperty("database.passwrod",System.getenv().getOrDefault("db_username","21328"));

        return prop;
    }
}
