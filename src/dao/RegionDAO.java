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
import modelo.Region;

/**
 *
 * @author MR-BM
 */
public class RegionDAO {
    ConectarMysql conn;

    public Region buscar(int id) {
        Region obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM region WHERE id_region=" + id + ";";

            ResultSet results = statement.executeQuery(query);

            int id_region;
            String nombre_region;

            while (results.next()) {
                id_region = results.getInt("id_region");
                nombre_region = results.getString("nombre_region");            
       
                if(id_region==id) {
                    obj = new Region(id_region,nombre_region);
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
