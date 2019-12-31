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
public class DetalleServicio {
    private int id_detalle_servicio;
    private int id_producto;
    private int id_servicio;
    private int cant;

    public DetalleServicio() {
    }

    public DetalleServicio(int id_detalle_servicio, int id_producto, int id_servicio, int cant) {
        this.id_detalle_servicio = id_detalle_servicio;
        this.id_producto = id_producto;
        this.id_servicio = id_servicio;
        this.cant = cant;
    }

    public int getId_detalle_servicio() {
        return id_detalle_servicio;
    }

    public void setId_detalle_servicio(int id_detalle_servicio) {
        this.id_detalle_servicio = id_detalle_servicio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }



    
}
