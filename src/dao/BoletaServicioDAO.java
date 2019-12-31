/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.ConectarMysql;
import java.sql.Connection;
import java.sql.Statement;
import modelo.BoletaServicio;

/**
 *
 * @author MR-BM
 */
public class BoletaServicioDAO {

    ConectarMysql conn;

    public int agregar(BoletaServicio b){

        try {

            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "INSERT INTO boleta_servicio (id_ficha_cliente,"
                    + "run_cliente,"
                    + "nombre_cliente,"
                    + "correo_cliente,"
                    + "id_odontologo,"
                    + "nombre_odontologo,"
                    + "correo_odontologo,"
                    + "fecha_servicio,"
                    + "id_horario,"
                    + "horario,"
                    + "id_servicio,"
                    + "nombre_servicio,created_at,updated_at) VALUES"
                    + "(" + b.getId_ficha_cliente()
                    + ",'" + b.getRun_cliente() + "'"
                    + ",'" + b.getNombre_cliente() + "'"
                    + ",'" + b.getCorreo_cliente() + "'"
                    + "," + b.getId_odontologo() 
                    + ",'" + b.getNombre_odontologo() + "'"
                    + ",'" + b.getCorreo_odontologo() + "'"
                    + ",'" + b.getFecha_servicio() + "'"
                    + "," + b.getId_horario()
                    + ",'" + b.getHorario() + "'"
                    + "," + b.getId_servicio()
                    + ",'" + b.getNombre_servicio() + "'"
                    + ",'" + b.getFecha_servicio() + "'"
                    + ",'" + b.getFecha_servicio() + "');";

            int results = statement.executeUpdate(query);
            System.out.println(query);
            System.out.println(results);
            connection.close();
            conn.desconectar();
            
            return results;

        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        }

    }
}
