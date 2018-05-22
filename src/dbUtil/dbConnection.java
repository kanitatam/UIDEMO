package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    private  static  final  String SOCONN = "jdbc:sqlite:mit.sqlite";



    public  static Connection getConnection () throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SOCONN);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

}//class
