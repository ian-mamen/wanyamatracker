package models;//package models;
//
//import org.sql2o.Sql2o;
//
//public class Database {
//    public static Sql2o sql2otest2 = new Sql2o("jdbc:postgresql://ec2-54-197-254-117.compute-1.amazonaws.com:5432/d8g80ccr8peoe9", "mfobdzpkynolhm", "3bcbbfcc2650eea139090111e92bcd6bcedcbb699a58734c2b00a41bcd1e6f05");
//}
//


//import org.sql2o.*;
//public class DB {
//
//    public static Sql2o sql2o = new Sql2o( "jdbc:postgresql://localhost:5432/wildlife_tracker", "mamen", "Theyoungstylist007@");
//}


import org.sql2o.*;
import java.net.URI;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Database {
    private static URI dbUri;
    public static Sql2o sql2o;
    static Logger logger = LoggerFactory.getLogger(Database.class);
    static {

        try {
            if (System.getenv("DATABASE_URL") == null) {
                dbUri = new URI("postgres://localhost:4567/wildlife_tracker");
            } else {
                dbUri = new URI(System.getenv("DATABASE_URL"));
            }
            int port = dbUri.getPort();
            String host = dbUri.getHost();
            String path = dbUri.getPath();
            String username = (dbUri.getUserInfo() == "null") ? "null" : dbUri.getUserInfo().split(":")[0];
            String password = (dbUri.getUserInfo() == "null") ? "null" : dbUri.getUserInfo().split(":")[1];
            sql2o = new Sql2o("jdbc:postgresql://" + host + ":" + port + path, username, password);
        } catch (URISyntaxException e ) {
            logger.error("Unable to connect to database.");
        }
    }
}
