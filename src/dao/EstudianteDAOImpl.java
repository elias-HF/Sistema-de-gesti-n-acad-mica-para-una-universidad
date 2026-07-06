package dao;


import Entity.Estudiante;
import dao.EstudianteDAO;

/*
Principio SRP
 */
public class EstudianteDAOImpl implements EstudianteDAO{

    @Override
    public void guardar(Estudiante e) {
        System.out.println("Guardando en la Base de Datos....");
    }

    @Override
    public Estudiante buscar(int id) {
        System.out.println("Buscando en la Base de Datos...");
        //por ahora, ya que no esta concetado a la base de datos todavia.
        return null;
    }
    
}
