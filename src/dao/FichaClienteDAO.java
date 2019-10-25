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
import modelo.FichaCliente;

/**
 *
 * @author MR-BM
 */
public class FichaClienteDAO {

    ConectarMysql conn;

    public FichaCliente buscar(int id) {
        FichaCliente obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM ficha_cliente WHERE id_ficha_cliente=" + id + ";";

            ResultSet results = statement.executeQuery(query);

            int id_ficha_cliente;
            String username;
            String password;
            String rut;
            String nombres;
            String apellidos;
            String telefono;
            String correo;
            int id_comuna;
            String direccion;
            int bloqueo;
            int activo;

            while (results.next()) {

                id_ficha_cliente = results.getInt("id_ficha_cliente");;;
                username = results.getString("username");;
                password = results.getString("password");;
                rut = results.getString("run");;
                nombres = results.getString("nombres");;
                apellidos = results.getString("apellidos");;
                telefono = results.getString("telefono");;
                correo = results.getString("correo");;
                id_comuna = results.getInt("id_comuna");;
                direccion = results.getString("direccion");;
                bloqueo = results.getInt("bloqueo");;
                activo = results.getInt("activo");;

                if (id_ficha_cliente == id) {
                    obj = new FichaCliente(id_ficha_cliente, username, password, rut, nombres, apellidos, telefono, correo, id_comuna, direccion, bloqueo, activo);
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

    public FichaCliente buscarRut(String rutA) {
        FichaCliente obj = null;
        try {
            conn = new ConectarMysql();
            Connection connection = conn.getConnection();

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM ficha_cliente WHERE run='" + rutA + "';";

            ResultSet results = statement.executeQuery(query);

            int id_ficha_cliente;
            String username;
            String password;
            String rut;
            String nombres;
            String apellidos;
            String telefono;
            String correo;
            int id_comuna;
            String direccion;
            int bloqueo;
            int activo;

            while (results.next()) {

                id_ficha_cliente = results.getInt("id_ficha_cliente");;;
                username = results.getString("username");;
                password = results.getString("password");;
                rut = results.getString("run");;
                nombres = results.getString("nombres");;
                apellidos = results.getString("apellidos");;
                telefono = results.getString("telefono");;
                correo = results.getString("correo");;
                id_comuna = results.getInt("id_comuna");;
                direccion = results.getString("direccion");;
                bloqueo = results.getInt("bloqueo");;
                activo = results.getInt("activo");;

                if (rutA.equals(rut)) {
                    obj = new FichaCliente(id_ficha_cliente, username, password, rut, nombres, apellidos, telefono, correo, id_comuna, direccion, bloqueo, activo);
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

    private ArrayList<FichaCliente> arrayFicha = new ArrayList<>();

    public ArrayList mostrarDatos() {
        try {

            conn = new ConectarMysql();
            Connection connection = conn.getConnection();
            Statement statement = connection.createStatement();
            String consultaSQL = "SELECT * FROM ficha_cliente;";
            ResultSet results = statement.executeQuery(consultaSQL);

            int id_ficha_cliente;
            String username;
            String password;
            String rut;
            String nombres;
            String apellidos;
            String telefono;
            String correo;
            int id_comuna;
            String direccion;
            int bloqueo;
            int activo;

            arrayFicha.removeAll(arrayFicha);
            while (results.next()) {

                id_ficha_cliente = results.getInt("id_ficha_cliente");;;
                username = results.getString("username");;
                password = results.getString("password");;
                rut = results.getString("run");;
                nombres = results.getString("nombres");;
                apellidos = results.getString("apellidos");;
                telefono = results.getString("telefono");;
                correo = results.getString("correo");;
                id_comuna = results.getInt("id_comuna");;
                direccion = results.getString("direccion");;
                bloqueo = results.getInt("bloqueo");;
                activo = results.getInt("activo");;

                arrayFicha.add(new FichaCliente(id_ficha_cliente, username, password, rut, nombres, apellidos, telefono, correo, id_comuna, direccion, bloqueo, activo));
            }
            connection.close();
            conn.desconectar();
        } catch (java.lang.Exception ex) {
            System.out.println("Error: " + ex);
        }
        return arrayFicha;
    }
    
    
   
}
