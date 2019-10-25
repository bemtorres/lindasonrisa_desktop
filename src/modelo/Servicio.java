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
public class Servicio {
    private int id_servicio;
    private String nombre_servicio;
    private int mostrar;

    public Servicio() {
    }

    public Servicio(int id_servicio, String nombre_servicio, int mostrar) {
        this.id_servicio = id_servicio;
        this.nombre_servicio = nombre_servicio;
        this.mostrar = mostrar;
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

    public int getMostrar() {
        return mostrar;
    }

    public void setMostrar(int mostrar) {
        this.mostrar = mostrar;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id_servicio=" + id_servicio + ", nombre_servicio=" + nombre_servicio + ", mostrar=" + mostrar + '}';
    }
    
}
