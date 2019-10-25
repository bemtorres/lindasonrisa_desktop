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
public class ReservaHora {
    private int id_reservar_hora;
    private int id_centro;
    private String fecha_reserva;
    private int id_horario;
    private int id_estado_reserva;
    private int id_servicio;
    private int id_ficha_cliente;
    private int id_odontologo;
    private String comentario;
    private int activo;
    


    public ReservaHora() {
    }

    public ReservaHora(int id_reservar_hora, int id_centro, String fecha_reserva, int id_horario, int id_estado_reserva, int id_servicio, int id_ficha_cliente, int id_odontologo, String comentario, int activo) {
        this.id_reservar_hora = id_reservar_hora;
        this.id_centro = id_centro;
        this.fecha_reserva = fecha_reserva;
        this.id_horario = id_horario;
        this.id_estado_reserva = id_estado_reserva;
        this.id_servicio = id_servicio;
        this.id_ficha_cliente = id_ficha_cliente;
        this.id_odontologo = id_odontologo;
        this.comentario = comentario;
        this.activo = activo;
    }

    public int getId_reservar_hora() {
        return id_reservar_hora;
    }

    public void setId_reservar_hora(int id_reservar_hora) {
        this.id_reservar_hora = id_reservar_hora;
    }

    public int getId_centro() {
        return id_centro;
    }

    public void setId_centro(int id_centro) {
        this.id_centro = id_centro;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getId_estado_reserva() {
        return id_estado_reserva;
    }

    public void setId_estado_reserva(int id_estado_reserva) {
        this.id_estado_reserva = id_estado_reserva;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_ficha_cliente() {
        return id_ficha_cliente;
    }

    public void setId_ficha_cliente(int id_ficha_cliente) {
        this.id_ficha_cliente = id_ficha_cliente;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "ReservaHora{" + "id_reservar_hora=" + id_reservar_hora + ", id_centro=" + id_centro + ", fecha_reserva=" + fecha_reserva + ", id_horario=" + id_horario + ", id_estado_reserva=" + id_estado_reserva + ", id_servicio=" + id_servicio + ", id_ficha_cliente=" + id_ficha_cliente + ", id_odontologo=" + id_odontologo + ", comentario=" + comentario + ", activo=" + activo + '}';
    }
        
}
