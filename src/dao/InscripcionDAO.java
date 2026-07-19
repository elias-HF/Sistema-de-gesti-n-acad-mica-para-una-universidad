
package dao;

import Entity.Inscripcion;
import java.util.List;


public interface InscripcionDAO {
    boolean registrar(Inscripcion inscripcion);

    boolean actualizar(Inscripcion inscripcion);

    boolean eliminar(int id);

    Inscripcion buscar(int id);

    List<Inscripcion> listar();
}
