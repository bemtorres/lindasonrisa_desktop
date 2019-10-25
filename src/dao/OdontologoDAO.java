/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.ConectarMysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.Odontologo;

/**
 *
 * @author MR-BM
 */
public class OdontologoDAO {

    ConectarMysql conn;

    public Odontologo buscar(int id) {
        Odontologo obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM odontologo WHERE id_odontologo=" + id + ";";

            ResultSet results = statement.executeQuery(query);

            int id_odontologo, activo;
            String username, password, run, nombres, apellidos, telefono, correo;

            while (results.next()) {
                id_odontologo = results.getInt("id_odontologo");
                username = results.getString("username");
                password = results.getString("password");
                run = results.getString("run");
                nombres = results.getString("nombres");
                apellidos = results.getString("apellidos");
                telefono = results.getString("telefono");
                correo = results.getString("correo");
                activo = results.getInt("activo");

                if (id_odontologo == id) {
                    obj = new Odontologo(id_odontologo, username, password, run, nombres, apellidos, telefono, correo, activo);
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

    public Odontologo buscarAcceso(String Nusername) {
        Odontologo obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM odontologo WHERE username='" + Nusername + "';";

            ResultSet results = statement.executeQuery(query);

            int id_odontologo, activo;
            String username, password, run, nombres, apellidos, telefono, correo;

            while (results.next()) {
                id_odontologo = results.getInt("id_odontologo");
                username = results.getString("username");
                password = results.getString("password");
                run = results.getString("run");
                nombres = results.getString("nombres");
                apellidos = results.getString("apellidos");
                telefono = results.getString("telefono");
                correo = results.getString("correo");
                activo = results.getInt("activo");

                if (username.equals(Nusername)) {
                    obj = new Odontologo(id_odontologo, username, password, run, nombres, apellidos, telefono, correo, activo);
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

}
