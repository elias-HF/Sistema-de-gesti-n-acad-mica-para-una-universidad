/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * Builder y adapter
 */
public class ReporteAcademico {

    private int id;

    private Calificacion calificacion;

    private String observacion;

    public ReporteAcademico() {
    }
    
    public ReporteAcademico(int id,Calificacion calificacion,String observacion) {
        this.id = id;
        this.calificacion = calificacion;
        this.observacion = observacion;

    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
}
