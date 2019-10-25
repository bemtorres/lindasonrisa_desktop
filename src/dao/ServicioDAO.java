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
import modelo.Servicio;

/**
 *
 * @author MR-BM
 */
public class ServicioDAO {

    ConectarMysql conn;

    public Servicio buscar(int id) {
        Servicio obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM servicio WHERE id_servicio=" + id + ";";

            ResultSet results = statement.executeQuery(query);

            int id_servicio, mostrar;
            String nombre;

            while (results.next()) {
                id_servicio = results.getInt("id_servicio");
                nombre = results.getString("nombre_servicio");
                mostrar = results.getInt("mostrar");

                if (id_servicio == id) {
                    obj = new Servicio(id_servicio, nombre, mostrar);
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
