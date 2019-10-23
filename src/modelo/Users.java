/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

public class Users {

    private static final long serialVersionUID = 1L;
   
    
    private int idUser;
    private String username;
    private String password;
    private String run;
    private String nombres;
    private String apellidos;
    private String telefono;
    private int idTipoUser;
    private String correo;
    private Date correoVerifiedAt;
    private String rememberToken;
    private Date createdAt;
    private Date updatedAt;
    private int activo;

    public Users() {
    }


    public Users(int idUser, String username, String password, String run, String nombres, String apellidos, int idTipoUser, String correo, int activo) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.run = run;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idTipoUser = idTipoUser;
        this.correo = correo;
        this.activo = activo;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public int getIdTipoUser() {
        return idTipoUser;
    }

    public void setIdTipoUser(int idTipoUser) {
        this.idTipoUser = idTipoUser;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getCorreoVerifiedAt() {
        return correoVerifiedAt;
    }

    public void setCorreoVerifiedAt(Date correoVerifiedAt) {
        this.correoVerifiedAt = correoVerifiedAt;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }


    @Override
    public String toString() {
        return "modelo.Users[ idUser=" + idUser + " ]";
    }
    
}
