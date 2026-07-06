package service;


import Entity.Calificacion;
import Entity.Curso;
import Entity.Estudiante;

/*
Principio ISP
 */
public interface ReporteCalificaciones {
    Calificacion generarReporte(Estudiante estudiante, Curso curso, double nota);
}
