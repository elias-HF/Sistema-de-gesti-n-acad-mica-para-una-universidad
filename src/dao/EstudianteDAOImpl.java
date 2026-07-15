package dao;


import Entity.Estudiante;
import java.util.ArrayList;
import java.util.List;


/*
Principio SRP
 */
public class EstudianteDAOImpl implements EstudianteDAO{
    //se modificara los metodos con procedimientos almacenados...
    @Override
    public void registrar(Estudiante estudiante) {
        System.out.println("Registrando estudiante...");
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        System.out.println("Actualizando estudiante...");
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando estudiante...");
    }

    @Override
    public Estudiante buscarPorId(int id) {
        System.out.println("Buscando estudiante...");
        return null;
    }

    @Override
    public List<Estudiante> listar() {
        System.out.println("Listando estudiantes...");
        return new ArrayList<>();
    }
    
    
}
