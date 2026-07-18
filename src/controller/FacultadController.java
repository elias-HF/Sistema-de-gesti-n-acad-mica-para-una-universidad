
package controller;

import Entity.Facultad;
import java.util.List;
import service.FacultadService;


public class FacultadController {
    private FacultadService facultadService;

    public FacultadController() {
        facultadService = new FacultadService();
    }

    public boolean registrar(Facultad facultad) {
        return facultadService.registrarFacultad(facultad);
    }

    public boolean actualizar(Facultad facultad) {
        return facultadService.actualizarFacultad(facultad);
    }

    public boolean eliminar(int id) {
        return facultadService.eliminarFacultad(id);
    }

    public Facultad buscar(int id) {
        return facultadService.buscarFacultad(id);
    }

    public List<Facultad> listar() {
        return facultadService.listarFacultades();
    }

}
