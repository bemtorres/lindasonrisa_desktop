/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.ConectarMysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ReservaHora;

/**
 *
 * @author MR-BM
 */
public class ReservaHoraDAO {

    ConectarMysql conn;

    public ReservaHora buscar(int id) {
        ReservaHora obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM reservar_hora WHERE id_reservar_hora=" + id + ";";

            ResultSet results = statement.executeQuery(query);

            int id_reservar_hora;
            int id_centro;
            String fecha_reserva;
            int id_horario;
            int id_estado_reserva;
            int id_servicio;
            int id_ficha_cliente;
            int id_odontologo;
            String comentario;
            int activo;

            while (results.next()) {

                id_reservar_hora = results.getInt("id_reservar_hora");
                id_centro = results.getInt("id_centro");
                fecha_reserva = results.getString("fecha_reserva");
                id_horario = results.getInt("id_horario");
                id_estado_reserva = results.getInt("id_estado_reserva");
                id_servicio = results.getInt("id_servicio");
                id_ficha_cliente = results.getInt("id_ficha_cliente");
                id_odontologo = results.getInt("id_odontologo");
                comentario = results.getString("comentario");
                activo = results.getInt("activo");

                if (id_reservar_hora == id) {
                    obj = new ReservaHora(id_reservar_hora, id_centro, fecha_reserva, id_horario, id_estado_reserva, id_servicio, id_ficha_cliente, id_odontologo, comentario, activo);
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

    public ArrayList buscarIdFicha(int id) {
        try {

            conn = new ConectarMysql();
            Connection connection = conn.getConnection();
            Statement statement = connection.createStatement();
            String consultaSQL = "SELECT * FROM reservar_hora WHERE id_ficha_cliente="+id+";";
            ResultSet results = statement.executeQuery(consultaSQL);

            int id_reservar_hora;
            int id_centro;
            String fecha_reserva;
            int id_horario;
            int id_estado_reserva;
            int id_servicio;
            int id_ficha_cliente;
            int id_odontologo;
            String comentario;
            int activo;

            arrayReserva.removeAll(arrayReserva);
            while (results.next()) {

                id_reservar_hora = results.getInt("id_reservar_hora");
                id_centro = results.getInt("id_centro");
                fecha_reserva = results.getString("fecha_reserva");
                id_horario = results.getInt("id_horario");
                id_estado_reserva = results.getInt("id_estado_reserva");
                id_servicio = results.getInt("id_servicio");
                id_ficha_cliente = results.getInt("id_ficha_cliente");
                id_odontologo = results.getInt("id_odontologo");
                comentario = results.getString("comentario");
                activo = results.getInt("activo");
                System.out.println("id " + id_estado_reserva + " " + id_horario + " " + fecha_reserva);
                arrayReserva.add(new ReservaHora(id_reservar_hora, id_centro, fecha_reserva, id_horario, id_estado_reserva, id_servicio, id_ficha_cliente, id_odontologo, comentario, activo));
            }
            connection.close();
            conn.desconectar();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayReserva;
    }
    
    private ArrayList<ReservaHora> arrayReserva = new ArrayList<>();

    public ArrayList mostrarDatos() {
        try {

            conn = new ConectarMysql();
            Connection connection = conn.getConnection();
            Statement statement = connection.createStatement();
            String consultaSQL = "SELECT * FROM reservar_hora;";
            ResultSet results = statement.executeQuery(consultaSQL);

            int id_reservar_hora;
            int id_centro;
            String fecha_reserva;
            int id_horario;
            int id_estado_reserva;
            int id_servicio;
            int id_ficha_cliente;
            int id_odontologo;
            String comentario;
            int activo;

            arrayReserva.removeAll(arrayReserva);
            while (results.next()) {

                id_reservar_hora = results.getInt("id_reservar_hora");
                id_centro = results.getInt("id_centro");
                fecha_reserva = results.getString("fecha_reserva");
                id_horario = results.getInt("id_horario");
                id_estado_reserva = results.getInt("id_estado_reserva");
                id_servicio = results.getInt("id_servicio");
                id_ficha_cliente = results.getInt("id_ficha_cliente");
                id_odontologo = results.getInt("id_odontologo");
                comentario = results.getString("comentario");
                activo = results.getInt("activo");
                System.out.println("id " + id_estado_reserva + " " + id_horario + " " + fecha_reserva);
                arrayReserva.add(new ReservaHora(id_reservar_hora, id_centro, fecha_reserva, id_horario, id_estado_reserva, id_servicio, id_ficha_cliente, id_odontologo, comentario, activo));
            }
            connection.close();
            conn.desconectar();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayReserva;
    }

    public ArrayList mostrarPorFecha(String fecha) {
        try {

            conn = new ConectarMysql();
            Connection connection = conn.getConnection();
            Statement statement = connection.createStatement();
            String consultaSQL = "SELECT * FROM reservar_hora WHERE fecha_reserva='" + fecha + "';";
            ResultSet results = statement.executeQuery(consultaSQL);

            int id_reservar_hora;
            int id_centro;
            String fecha_reserva;
            int id_horario;
            int id_estado_reserva;
            int id_servicio;
            int id_ficha_cliente;
            int id_odontologo;
            String comentario;
            int activo;

            arrayReserva.removeAll(arrayReserva);
            while (results.next()) {

                id_reservar_hora = results.getInt("id_reservar_hora");
                id_centro = results.getInt("id_centro");
                fecha_reserva = results.getString("fecha_reserva");
                id_horario = results.getInt("id_horario");
                id_estado_reserva = results.getInt("id_estado_reserva");
                id_servicio = results.getInt("id_servicio");
                id_ficha_cliente = results.getInt("id_ficha_cliente");
                id_odontologo = results.getInt("id_odontologo");
                comentario = results.getString("comentario");
                activo = results.getInt("activo");

                arrayReserva.add(new ReservaHora(id_reservar_hora, id_centro, fecha_reserva, id_horario, id_estado_reserva, id_servicio, id_ficha_cliente, id_odontologo, comentario, activo));
            }
            connection.close();
            conn.desconectar();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayReserva;
    }

    public int modificar(ReservaHora r) {
        int results = 0;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();
            Statement statement = connection.createStatement();
            String consultaSQL = "UPDATE reservar_hora SET id_estado_reserva=" + r.getId_estado_reserva() + ", comentario='" + r.getComentario() + "' WHERE id_reservar_hora=" + r.getId_reservar_hora() + ";";
            results = statement.executeUpdate(consultaSQL);

            connection.close();
            conn.desconectar();
        } catch (Exception e) {
            System.out.println("Error update " + e.toString());
            return -2;
        }

        return results;

    }

    public int modificar2(ReservaHora r) {
        int results = 0;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();
            Statement statement = connection.createStatement();
            String consultaSQL = "UPDATE reservar_hora SET id_estado_reserva=" + r.getId_estado_reserva() + " WHERE id_reservar_hora=" + r.getId_reservar_hora() + ";";
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
