
package Entity;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Inscripcion {
    private int id;

    private Estudiante estudiante;

    private CursoBase curso;

    private Date fechaInscripcion;

    public Inscripcion() {
    }

    public Inscripcion(int id,
                       Estudiante estudiante,
                       CursoBase curso,
                       Date fechaInscripcion) {

        this.id = id;
        this.estudiante = estudiante;
        this.curso = curso;
        this.fechaInscripcion = fechaInscripcion;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public CursoBase getCurso() {
        return curso;
    }

    public void setCurso(CursoBase curso) {
        this.curso = curso;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
    
    @Override
    public String toString(){

        return estudiante.getNombre()
                + " - "
                + curso.getNombreCurso();

    }
    
}
