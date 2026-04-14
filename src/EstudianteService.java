/*
 Principio SRP
 */
public class EstudianteService {
    private EstudianteDB db;
    
    public EstudianteService(EstudianteDB db){
        this.db = db;
    }
          
    public void registrarEstudiante(Estudiante estudiante){
        db.guardar(estudiante);
    }
}
