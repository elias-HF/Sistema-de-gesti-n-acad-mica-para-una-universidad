
package controller;

import Entity.Estudiante;
import dao.EstudianteDAOImpl;
import java.util.List;
import service.EstudianteService;


public class EstudianteController {
    
    
    private EstudianteService estudianteService;

    public EstudianteController( ) {
        estudianteService = new EstudianteService(new EstudianteDAOImpl());
    }

    public boolean registrarEstudiante(Estudiante estudiante) {
        return estudianteService.registrarEstudiante(estudiante);
    }

    public boolean actualizarEstudiante(Estudiante estudiante) {
        return estudianteService.actualizarEstudiante(estudiante);
    }

    public boolean eliminarEstudiante(int id) {
        return estudianteService.eliminarEstudiante(id);
    }

    public Estudiante buscarEstudiante(int id) {
        return estudianteService.buscarEstudiante(id);
    }

    public List<Estudiante> listarEstudiantes() {
        return estudianteService.listarEstudiantes();
    }
}
