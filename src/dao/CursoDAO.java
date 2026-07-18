
package dao;

import Entity.Curso;
import Entity.CursoBase;
import java.util.List;


public interface CursoDAO {
    boolean registrar(CursoBase curso);

    boolean actualizar(CursoBase curso);

    boolean eliminar(int id);

    CursoBase buscar(int id);

    List<CursoBase> listar();
}
