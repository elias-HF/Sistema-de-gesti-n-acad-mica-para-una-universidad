
package service;

import Entity.ReporteAcademico;
import dao.ReporteAcademicoDAO;
import java.util.List;


public class ReporteAcademicoService {
    private ReporteAcademicoDAO dao;

    public ReporteAcademicoService(ReporteAcademicoDAO dao) {
        this.dao = dao;
    }

    public boolean registrar(ReporteAcademico reporte){
        return dao.registrar(reporte);
    }

    public boolean actualizar(ReporteAcademico reporte){
        return dao.actualizar(reporte);
    }

    public boolean eliminar(int id){
        return dao.eliminar(id);
    }

    public ReporteAcademico buscar(int id){
        return dao.buscar(id);
    }

    public List<ReporteAcademico> listar(){
        return dao.listar();
    }
}
