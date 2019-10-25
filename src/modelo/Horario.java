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
public class Horario {
    private int id_horario;
    private String horario;
    private int activo;

    public Horario() {
    }

    public Horario(int id_horario, String horario, int activo) {
        this.id_horario = id_horario;
        this.horario = horario;
        this.activo = activo;
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

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Horario{" + "id_horario=" + id_horario + ", horario=" + horario + ", activo=" + activo + '}';
    }

   
}
