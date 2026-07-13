/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Entity.Calificacion;
import service.ReporteService;

/**
 *
 * @author USUARIO
 */
public class ReporteController {
    private ReporteService reporteService;

    public ReporteController(ReporteService reporteService){
        this.reporteService = reporteService;
    }

    public void generarReporte(Calificacion calificacion){
        reporteService.generarReporte(calificacion);
    }
}
