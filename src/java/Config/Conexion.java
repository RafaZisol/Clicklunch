/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
public class Conexion {
    Connection con;
    public static Connection iniciar() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        // Database name to access 
        String dbName = "clicklunch"; 
        String dbUsername = "root"; 
        String dbPassword = "Zisolpri"; 
  
        Class.forName(dbDriver).newInstance(); 
        Connection con = DriverManager.getConnection(dbURL + dbName, 
                                                     dbUsername,  
                                                     dbPassword); 
        System.out.println("se conecto");
        return con; 
        }
    public Connection getConnection(){
           return con;
     }
}
