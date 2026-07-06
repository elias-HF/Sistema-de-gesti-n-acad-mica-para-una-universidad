package service;

import Entity.Estudiante;
import dao.EstudianteDAO;

/*
 Principio SRP
 */
public class EstudianteService {
    private EstudianteDAO db;
    
    public EstudianteService(EstudianteDAO db){
        this.db = db;
    }
          
    public void registrarEstudiante(Estudiante estudiante){
        db.guardar(estudiante);
    }
}
