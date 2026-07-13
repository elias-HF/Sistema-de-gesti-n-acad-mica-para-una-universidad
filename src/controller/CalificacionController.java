/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Entity.Calificacion;
import java.util.List;
import service.CalificacionService;

/**
 *
 * @author USUARIO
 */
public class CalificacionController {
    private CalificacionService calificacionService;

    public CalificacionController(CalificacionService calificacionService) {
        this.calificacionService = calificacionService;
    }

    public void registrarCalificacion(Calificacion calificacion){
        calificacionService.registrarCalificacion(calificacion);
    }

    public void actualizarCalificacion(Calificacion calificacion){
        calificacionService.actualizarCalificacion(calificacion);
    }

    public void eliminarCalificacion(int id){
        calificacionService.eliminarCalificacion(id);
    }

    public Calificacion buscarCalificacion(int id){
        return calificacionService.buscarCalificacion(id);
    }

    public List<Calificacion> listarCalificaciones(){
        return calificacionService.listarCalificaciones();
    }
}
