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
public class BoletaServicio {
                    
    private int id_boleta_servicio;
    private int id_ficha_cliente;
    private String run_cliente;
    private String nombre_cliente;
    private String correo_cliente;
    private int id_odontologo;
    private String nombre_odontologo;
    private String correo_odontologo;
    private String fecha_servicio;
    private int id_horario;
    private String horario;
    private int id_servicio;
    private String nombre_servicio;

    public BoletaServicio() {
    }

    public BoletaServicio(int id_boleta_servicio, int id_ficha_cliente, String run_cliente, String nombre_cliente, String correo_cliente, int id_odontologo, String nombre_odontologo, String correo_odontologo, String fecha_servicio, int id_horario, String horario, int id_servicio, String nombre_servicio) {
        this.id_boleta_servicio = id_boleta_servicio;
        this.id_ficha_cliente = id_ficha_cliente;
        this.run_cliente = run_cliente;
        this.nombre_cliente = nombre_cliente;
        this.correo_cliente = correo_cliente;
        this.id_odontologo = id_odontologo;
        this.nombre_odontologo = nombre_odontologo;
        this.correo_odontologo = correo_odontologo;
        this.fecha_servicio = fecha_servicio;
        this.id_horario = id_horario;
        this.horario = horario;
        this.id_servicio = id_servicio;
        this.nombre_servicio = nombre_servicio;
    }

    public int getId_boleta_servicio() {
        return id_boleta_servicio;
    }

    public void setId_boleta_servicio(int id_boleta_servicio) {
        this.id_boleta_servicio = id_boleta_servicio;
    }

    public int getId_ficha_cliente() {
        return id_ficha_cliente;
    }

    public void setId_ficha_cliente(int id_ficha_cliente) {
        this.id_ficha_cliente = id_ficha_cliente;
    }

    public String getRun_cliente() {
        return run_cliente;
    }

    public void setRun_cliente(String run_cliente) {
        this.run_cliente = run_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }

    public String getNombre_odontologo() {
        return nombre_odontologo;
    }

    public void setNombre_odontologo(String nombre_odontologo) {
        this.nombre_odontologo = nombre_odontologo;
    }

    public String getCorreo_odontologo() {
        return correo_odontologo;
    }

    public void setCorreo_odontologo(String correo_odontologo) {
        this.correo_odontologo = correo_odontologo;
    }

    public String getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(String fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }
    
    
    

}
