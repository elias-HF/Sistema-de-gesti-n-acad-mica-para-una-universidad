
package dao;

import Entity.Carrera;
import java.util.List;


public interface CarreraDAO {
    boolean registrar(Carrera carrera);

    boolean actualizar(Carrera carrera);

    boolean eliminar(int id);

    Carrera buscar(int id);

    List<Carrera> listar();
}
