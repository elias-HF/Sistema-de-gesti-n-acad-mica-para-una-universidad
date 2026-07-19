
package controller;

import Entity.ReporteAcademico;
import dao.ReporteAcademicoDAOImpl;
import java.util.List;
import service.ReporteAcademicoService;


public class ReporteAcademicoController {
    private ReporteAcademicoService service;

    public ReporteAcademicoController() {
        service = new ReporteAcademicoService(new ReporteAcademicoDAOImpl());
    }

    public boolean registrar(ReporteAcademico reporte) {
        return service.registrar(reporte);
    }

    public boolean actualizar(ReporteAcademico reporte) {
        return service.actualizar(reporte);
    }

    public boolean eliminar(int id) {
        return service.eliminar(id);
    }

    public ReporteAcademico buscar(int id) {
        return service.buscar(id);
    }

    public List<ReporteAcademico> listar() {
        return service.listar();
    }
}
