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
    public void registrarEstudiante(Estudiante estudiante) {
        estudianteDAO.registrar(estudiante);
    }

    public void actualizarEstudiante(Estudiante estudiante) {
        estudianteDAO.actualizar(estudiante);
    }

    public void eliminarEstudiante(int id) {
        estudianteDAO.eliminar(id);
    }

    public Estudiante buscarEstudiante(int id) {
        return estudianteDAO.buscarPorId(id);
    }

    public List<Estudiante> listarEstudiantes() {
        return estudianteDAO.listar();
    }
}
