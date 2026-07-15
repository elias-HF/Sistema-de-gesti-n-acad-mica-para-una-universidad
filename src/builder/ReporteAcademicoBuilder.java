/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import Entity.Calificacion;
import Entity.ReporteAcademico;


public class ReporteAcademicoBuilder {
    private ReporteAcademico reporte;


    public ReporteAcademicoBuilder() {
        reporte = new ReporteAcademico();
    }

    public ReporteAcademicoBuilder calificacion(Calificacion calificacion) {
        reporte.setCalificacion(calificacion);
        return this;
    }

    public ReporteAcademicoBuilder observacion(String observacion) {
        reporte.setObservacion(observacion);
        return this;
    }

    public ReporteAcademico build() {
        return reporte;
    }
    
}
