
package dao;

import Entity.Facultad;
import java.util.List;


public interface FacultadDAO {
    boolean registrar(Facultad facultad);

    boolean actualizar(Facultad facultad);

    boolean eliminar(int id);

    Facultad buscar(int id);

    List<Facultad> listar();
}
