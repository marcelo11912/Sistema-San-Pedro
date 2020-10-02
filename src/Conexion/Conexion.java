package Conexion;

import java.sql.*;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/sanpedro?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    PreparedStatement ps;
    ResultSet rs;
   
//useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public Connection Conexion() {
        Connection coneccion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            coneccion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return coneccion;

    }

}











































