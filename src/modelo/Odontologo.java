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
public class Odontologo {
    private int id_odontologo;
    private String username;
    private String password;
    private String run;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private int activo;

    public Odontologo() {
    }

    public Odontologo(int id_odontologo, String username, String password, String run, String nombres, String apellidos, String telefono, String correo, int activo) {
        this.id_odontologo = id_odontologo;
        this.username = username;
        this.password = password;
        this.run = run;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.activo = activo;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
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

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Odontologo{" + "id_odontologo=" + id_odontologo + ", username=" + username + ", password=" + password + ", run=" + run + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", correo=" + correo + ", activo=" + activo + '}';
    }
    
    public String nombreCompleto(){
        String nombre = this.nombres + " " + this.apellidos;
        return nombre;
    }
    
   
}
