/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.ConectarMysql;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import modelo.Users;
import procedimientos.Encryptar;

/**
 *
 * @author benja
 */
public class UsersDAO {
  
    ConectarMysql conn;

    public Users buscarDatos(String username, String password) {
        Users obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM users WHERE username='" + username + "' and password='"+password+"';";

            ResultSet results = statement.executeQuery(query);

            int id_user;
            String username1, password1, run, nombres, apellidos, correo;

            while (results.next()) {
                id_user = results.getInt("id_user");
                run = results.getString("run");
                nombres = results.getString("nombres");
                apellidos = results.getString("apellidos");
                correo = results.getString("correo");
                username1 = results.getString("username");
                password1 = results.getString("password");

                if (username.equals(username1)) {
                    obj = new Users(id_user, username, password, run, nombres, apellidos, 2, correo, 1);
                    break;
                }
            }
            connection.close();
            conn.desconectar();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }
    
       public Users buscarUsername(String username) {
        Users obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM users WHERE username='" + username + "' ;";

            ResultSet results = statement.executeQuery(query);

            int id_user;
            String username1, password, run, nombres, apellidos, correo;

            while (results.next()) {
                id_user = results.getInt("id_user");
                run = results.getString("run");
                nombres = results.getString("nombres");
                apellidos = results.getString("apellidos");
                correo = results.getString("correo");
                username1 = results.getString("username");
                password = results.getString("password");

                if (username.equals(username1)) {
                    obj = new Users(id_user, username, password, run, nombres, apellidos, 2, correo, 1);
                    break;
                }
            }
            connection.close();
            conn.desconectar();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

         
    public Users buscarCorreo(String correo) {
        Users obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM users WHERE correo='" + correo + "' ;";

            ResultSet results = statement.executeQuery(query);

            int id_user;
            String username, password, run, nombres, apellidos, correo1;

            while (results.next()) {
                id_user = results.getInt("id_user");
                run = results.getString("run");
                nombres = results.getString("nombres");
                apellidos = results.getString("apellidos");
                correo1 = results.getString("correo");
                username = results.getString("username");
                password = results.getString("password");

                if (correo.equals(correo1)) {
                    obj = new Users(id_user, username, password, run, nombres, apellidos, 2, correo, 1);
                    break;
                }
            }
            connection.close();
            conn.desconectar();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return obj;
    }

       



    public int actualizarCorreo(String correo, String texto) {
        int results = 0;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();
            Statement statement = connection.createStatement();          
       
            
            String pass =  Encryptar.encryptar(texto);;
            String agregarSQL = "UPDATE users SET  "
                    + " password='" + pass+ "' where correo='"+correo+"';";
            results = statement.executeUpdate(agregarSQL);
            connection.close();
            conn.desconectar();

        } //catching excepcion
        catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }

        return results;
    }   
}
