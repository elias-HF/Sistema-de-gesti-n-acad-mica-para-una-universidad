/*
Principio ISP
 */
public interface ReporteCalificaciones {
    Calificacion generarReporte(Estudiante estudiante, Curso curso, double nota);
}
