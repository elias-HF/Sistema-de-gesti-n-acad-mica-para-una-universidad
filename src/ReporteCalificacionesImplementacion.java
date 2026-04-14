/*
    Principio srp
 */
public class ReporteCalificacionesImplementacion implements ReporteCalificaciones{

    @Override
    public Calificacion generarReporte(Estudiante estudiante, Curso curso, double nota) {
        return new Calificacion(estudiante,curso,nota);
    }
    
}
