package dao;


import Entity.Estudiante;
import java.util.List;

/*
Principio DIP
*/
public interface EstudianteDAO {
    boolean  registrar(Estudiante estudiante);

    boolean  actualizar(Estudiante estudiante);

    boolean  eliminar(int id);

    Estudiante buscarPorId(int id);

    List<Estudiante> listar();
}
