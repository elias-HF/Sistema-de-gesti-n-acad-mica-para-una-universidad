
package service;

import Entity.Facultad;
import dao.FacultadDAO;
import dao.FacultadDAOImp;
import java.util.List;
/*
Principio SRP
*/

public class FacultadService {
    private FacultadDAO facultadDAO;

    public FacultadService() {
        facultadDAO = new FacultadDAOImp();
    }

    public boolean registrarFacultad(Facultad facultad) {
        return facultadDAO.registrar(facultad);
    }

    public boolean actualizarFacultad(Facultad facultad) {
        return facultadDAO.actualizar(facultad);
    }

    public boolean eliminarFacultad(int id) {
        return facultadDAO.eliminar(id);
    }

    public Facultad buscarFacultad(int id) {
        return facultadDAO.buscar(id);
    }

    public List<Facultad> listarFacultades() {
        return facultadDAO.listar();
    }
}
