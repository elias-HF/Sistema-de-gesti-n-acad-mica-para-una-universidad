package service;


import Entity.Calificacion;
import Entity.Curso;
import Entity.Estudiante;

/*
    Principio srp
 */
public class ReporteCalificacionesImp implements ReporteCalificaciones{

    @Override
    public Calificacion generarReporte(Estudiante estudiante, Curso curso, double nota) {
        
         System.out.println("Generando reporte de calificaciones...");
        
        return new Calificacion(estudiante,curso,nota);
    }
    
}
