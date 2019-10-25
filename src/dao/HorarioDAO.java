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
import modelo.Horario;

/**
 *
 * @author MR-BM
 */
public class HorarioDAO {

    ConectarMysql conn;

    public Horario buscar(int id) {
        Horario obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM horario WHERE id_horario=" + id + ";";

            ResultSet results = statement.executeQuery(query);

            int id_horario, activo;
            String horario;

            while (results.next()) {
                id_horario = results.getInt("id_horario");
                horario = results.getString("horario");
                activo = results.getInt("activo");

                if (id_horario == id) {
                    obj = new Horario(id_horario, horario, activo);
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
