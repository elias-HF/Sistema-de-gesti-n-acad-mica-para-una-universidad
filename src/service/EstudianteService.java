package service;

import Entity.Estudiante;
import dao.EstudianteDAO;
import java.util.List;

/*
 Principio SRP
 */
public class EstudianteService {
    private EstudianteDAO estudianteDAO;
    
    
          
    public EstudianteService(EstudianteDAO estudianteDAO) {
        this.estudianteDAO = estudianteDAO;
    }

    //metodos
    public boolean registrarEstudiante(Estudiante estudiante) {
        return estudianteDAO.registrar(estudiante);
    }

    public boolean actualizarEstudiante(Estudiante estudiante) {
        return estudianteDAO.actualizar(estudiante);
    }

    public boolean eliminarEstudiante(int id) {
        return estudianteDAO.eliminar(id);
    }

    public Estudiante buscarEstudiante(int id) {
        return estudianteDAO.buscarPorId(id);
    }

    public List<Estudiante> listarEstudiantes() {
        return estudianteDAO.listar();
    }
}
