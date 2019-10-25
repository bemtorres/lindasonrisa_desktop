/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author benja
 */
public class ConectarMysql {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";    
    private static final String host = "localhost";
    private static final String user = "root";    
    private static final String password ="";
    private static final String puerto = "3306";   
    private static final String nombre_bd = "lindasonrisa";
    
    public static int cont = 0;
    
    private static final String url = "jdbc:mysql://"+host+":"+puerto+"/"+nombre_bd;
    
    public ConectarMysql(){
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password); 
            if (conn != null) {
                cont++;
                //System.out.println("Conexion Establecida...  contador " + cont);
                
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar "+ e);
        }            
    }
    
    //Conexion a la base de datos
    public Connection getConnection(){
        return conn;
    }
    
    //desconectar
    public void desconectar(){
        conn=null;
        if (conn == null) {
          //  System.out.println("Conexion Terminada... ");
        }
    }
}
