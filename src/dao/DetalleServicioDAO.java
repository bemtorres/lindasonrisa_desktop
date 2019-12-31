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
import java.util.ArrayList;
import modelo.DetalleServicio;

/**
 *
 * @author MR-BM
 */
public class DetalleServicioDAO {

    ConectarMysql conn;

    private ArrayList<DetalleServicio> arrayDetalle = new ArrayList<>();

    public ArrayList mostrarPorServicio(int id_s) {
        try {

            conn = new ConectarMysql();
            Connection connection = conn.getConnection();
            Statement statement = connection.createStatement();
            String consultaSQL = "SELECT * FROM detalle_servicio WHERE id_servicio=" + id_s + ";";
            ResultSet results = statement.executeQuery(consultaSQL);

            int id_detalle_servicio;
            int id_producto;
            int id_servicio, cant;

            arrayDetalle.removeAll(arrayDetalle);

            while (results.next()) {

                id_detalle_servicio = results.getInt("id_detalle_servicio");
                id_producto = results.getInt("id_producto");
                id_servicio = results.getInt("id_servicio");
                cant = results.getInt("cantidad");
                arrayDetalle.add(new DetalleServicio(id_detalle_servicio, id_producto, id_servicio,cant));                
            }
            connection.close();
            conn.desconectar();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayDetalle;
    }
}
