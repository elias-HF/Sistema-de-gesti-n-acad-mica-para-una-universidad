
package controller;

import Entity.Estudiante;
import dao.EstudianteDAOImpl;
import java.util.List;
import service.EstudianteService;


public class EstudianteController {
    
    
    private EstudianteService service;

    public EstudianteController() {
        service = new EstudianteService(new EstudianteDAOImpl());
    }

    public boolean  registrarEstudiante(Estudiante estudiante){
        return service.registrarEstudiante(estudiante);
    }

    public boolean  actualizarEstudiante(Estudiante estudiante){
        return service.actualizarEstudiante(estudiante);
    }

    public boolean eliminarEstudiante(int id){
        return service.eliminarEstudiante(id);
    }

    public Estudiante buscarEstudiante(int id){
        return service.buscarEstudiante(id);
    }

    public List<Estudiante> listarEstudiantes(){
        return service.listarEstudiantes();
    }
}
