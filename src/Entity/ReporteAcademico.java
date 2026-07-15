
package Entity;

import java.time.LocalDate;

/**
 *
 * Builder y adapter
 */
public class ReporteAcademico {

    private int id;
    private Calificacion calificacion;
    private String observacion;
    private LocalDate fechaGeneracion;
    
    public ReporteAcademico() {
    }
    
    public ReporteAcademico(int id,Calificacion calificacion,String observacion, LocalDate fechaGeneracion) {
        this.id = id;
        this.calificacion = calificacion;
        this.observacion = observacion;
        this.fechaGeneracion = fechaGeneracion;
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

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDate fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
    
    
}
