package dao;


import Entity.Estudiante;
import java.util.List;

/*
Principio DIP
*/
public interface EstudianteDAO {
    void registrar(Estudiante estudiante);

    void actualizar(Estudiante estudiante);

    void eliminar(int id);

    Estudiante buscarPorId(int id);

    List<Estudiante> listar();
}
