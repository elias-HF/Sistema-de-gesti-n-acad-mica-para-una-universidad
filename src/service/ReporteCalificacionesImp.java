package service;


import Entity.Calificacion;


/*
    Principio srp
 */
public class ReporteCalificacionesImp implements ReporteCalificaciones{

    @Override
    public Calificacion generarReporte(Calificacion calificacion){

        System.out.println(
                "Generando reporte académico...");

        return calificacion;

    }
    
}
