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
import modelo.Comuna;

/**
 *
 * @author MR-BM
 */
public class ComunaDAO {

    ConectarMysql conn;

    public Comuna buscar(int id) {
        Comuna obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM comuna WHERE id_comuna=" + id + ";";

            ResultSet results = statement.executeQuery(query);

            int id_comuna, activo;
            String nombre_comuna;

            while (results.next()) {
                id_comuna = results.getInt("id_comuna");
                nombre_comuna = results.getString("nombre_comuna");
                activo = results.getInt("id_region");
               

                if(id_comuna==id) {
                    obj = new Comuna(id_comuna, nombre_comuna, activo);
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
