
package controller;

import Entity.Inscripcion;
import dao.InscripcionDAOImp;
import java.util.List;
import service.InscripcionService;


public class InscripcionController {
    private InscripcionService inscripcionService;

    public InscripcionController() {
        inscripcionService = new InscripcionService();
    }

    public boolean registrar(Inscripcion inscripcion) {
        return inscripcionService.registrar(inscripcion);
    }

    public boolean actualizar(Inscripcion inscripcion) {
        return inscripcionService.actualizar(inscripcion);
    }

    public boolean eliminar(int id) {
        return inscripcionService.eliminar(id);
    }

    public Inscripcion buscar(int id) {
        return inscripcionService.buscar(id);
    }

    public List<Inscripcion> listar() {
        return inscripcionService.listar();
    }
}
