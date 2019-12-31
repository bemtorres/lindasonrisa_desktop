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
import modelo.Producto;

/**
 *
 * @author MR-BM
 */
public class ProductoDAO {

    ConectarMysql conn;

    public Producto buscar(int id) {
        Producto obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM producto WHERE id_producto=" + id + ";";

            ResultSet results = statement.executeQuery(query);

            int id_producto, stock, bloqueo, activo;

            while (results.next()) {

                id_producto = results.getInt("id_producto");
                stock = results.getInt("stock");
                bloqueo = results.getInt("bloqueo");
                activo = results.getInt("activo");

                if (id_producto == id) {
                    obj = new Producto(id_producto, stock, bloqueo, activo);
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

    public int modificar(Producto p) {
        int results = 0;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();
            Statement statement = connection.createStatement();
            String consultaSQL = "UPDATE producto SET stock=" + p.getStock() + " WHERE id_producto=" + p.getId_producto()+ ";";
            results = statement.executeUpdate(consultaSQL);

            connection.close();
            conn.desconectar();
        } catch (Exception e) {
            System.out.println("Error update " + e.toString());
            return -2;
        }

        return results;

    }
}
