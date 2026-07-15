/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Entity.Estudiante;
import java.util.List;
import service.EstudianteService;

/**
 *
 * @author USUARIO
 */
public class EstudianteController {
    
    
    private EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    public void registrarEstudiante(Estudiante estudiante){
        estudianteService.registrarEstudiante(estudiante);
    }

    public void actualizarEstudiante(Estudiante estudiante){
        estudianteService.actualizarEstudiante(estudiante);
    }

    public void eliminarEstudiante(int id){
        estudianteService.eliminarEstudiante(id);
    }

    public Estudiante buscarEstudiante(int id){
        return estudianteService.buscarEstudiante(id);
    }

    public List<Estudiante> listarEstudiantes(){
        return estudianteService.listarEstudiantes();
    }
}
