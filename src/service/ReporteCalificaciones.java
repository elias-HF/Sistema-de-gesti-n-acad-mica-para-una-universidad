package service;


import Entity.Calificacion;


/*
Principio ISP
 */
public interface ReporteCalificaciones {
    Calificacion generarReporte(Calificacion calificacion);
}
