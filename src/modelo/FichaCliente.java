/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author MR-BM
 */
public class FichaCliente {
    private int id_ficha_cliente;
    private String username;
    private String password;
    private String rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private int id_comuna;
    private String direccion;
    private int bloqueo;
    private int activo;

    public FichaCliente() {
    }

    public FichaCliente(int id_ficha_cliente, String username, String password, String rut, String nombres, String apellidos, String telefono, String correo, int id_comuna, String direccion, int bloqueo, int activo) {
        this.id_ficha_cliente = id_ficha_cliente;
        this.username = username;
        this.password = password;
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.id_comuna = id_comuna;
        this.direccion = direccion;
        this.bloqueo = bloqueo;
        this.activo = activo;
    }

    public int getId_ficha_cliente() {
        return id_ficha_cliente;
    }

    public void setId_ficha_cliente(int id_ficha_cliente) {
        this.id_ficha_cliente = id_ficha_cliente;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(int bloqueo) {
        this.bloqueo = bloqueo;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
    
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }


    @Override
    public String toString() {
        return "FichaCliente{" + "id_ficha_cliente=" + id_ficha_cliente + ", username=" + username + ", password=" + password + ", rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", correo=" + correo + ", id_comuna=" + id_comuna + ", direccion=" + direccion + ", bloqueo=" + bloqueo + ", activo=" + activo + '}';
    }
    
    
}
