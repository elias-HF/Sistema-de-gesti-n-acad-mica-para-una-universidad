
package service;


import Entity.CursoBase;
import dao.CursoDAO;
import dao.CursoDAOImp;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class CursoService {
    private CursoDAO dao;

    public CursoService() {
        dao = new CursoDAOImp();
    }

    public boolean registrar(CursoBase curso) {
        return dao.registrar(curso);
    }

    public boolean actualizar(CursoBase curso) {
        return dao.actualizar(curso);
    }

    public boolean eliminar(int id) {
        return dao.eliminar(id);
    }

    public CursoBase buscar(int id) {
        return dao.buscar(id);
    }

    public List<CursoBase> listar() {
        return dao.listar();
    }
}
