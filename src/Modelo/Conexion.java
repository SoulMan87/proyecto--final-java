
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    final static String url = "jdbc:mysql://localhost:3306/comercializadora?user=root&password=" + "";
    private static Connection conexion;
    
    public static Connection open() throws Exception{
        if (conexion==null || conexion.isClosed()) {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(url);
        }
        return conexion;
    }
}
