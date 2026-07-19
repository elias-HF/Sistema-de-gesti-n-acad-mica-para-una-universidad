
package dao;

import Entity.ReporteAcademico;
import java.util.List;


public interface ReporteAcademicoDAO {
    boolean registrar(ReporteAcademico reporte);

    boolean actualizar(ReporteAcademico reporte);

    boolean eliminar(int id);

    ReporteAcademico buscar(int id);

    List<ReporteAcademico> listar();
}
