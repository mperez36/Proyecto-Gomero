
package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conectar {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/hotel";

    public conectar() {
        conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user,password);
            if(conn !=null){
                System.out.println("Conexion Establecida");
            }
        } catch (ClassNotFoundException | SQLException e ) {
            System.out.println("error al conectar" + e);
            
        
            
        }
    }
     // este metodo nos retorna la conexion
    public Connection getConnection(){
        return conn;
    }
    
    // con este metodo nos desconectamos de la base de datos
    public void desconectar(){
        conn = null;
        if (conn == null){
            System.out.println("Conexion terminada");
        }
    }
    
    
    
}
