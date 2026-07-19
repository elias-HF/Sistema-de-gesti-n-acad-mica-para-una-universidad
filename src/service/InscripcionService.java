package service;


import Entity.Inscripcion;
import dao.InscripcionDAO;
import dao.InscripcionDAOImp;
import java.util.List;

/*
Principio SRP
 */
public class InscripcionService {
    
    private InscripcionDAO dao;

    public InscripcionService() {
        dao = new InscripcionDAOImp();
    }

    public boolean registrar(Inscripcion inscripcion) {
        return dao.registrar(inscripcion);
    }

    public boolean actualizar(Inscripcion inscripcion) {
        return dao.actualizar(inscripcion);
    }

    public boolean eliminar(int id) {
        return dao.eliminar(id);
    }

    public Inscripcion buscar(int id) {
        return dao.buscar(id);
    }

    public List<Inscripcion> listar() {
        return dao.listar();
    }
    
}
