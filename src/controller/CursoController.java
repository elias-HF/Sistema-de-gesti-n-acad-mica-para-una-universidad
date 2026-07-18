
package controller;


import Entity.CursoBase;
import java.util.List;
import service.CursoService;

public class CursoController {
     private CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    public boolean registrar(CursoBase curso) {
        return cursoService.registrar(curso);
    }

    public boolean actualizar(CursoBase curso) {
        return cursoService.actualizar(curso);
    }

    public boolean eliminar(int id) {
        return cursoService.eliminar(id);
    }

    public CursoBase buscar(int id) {
        return cursoService.buscar(id);
    }

    public List<CursoBase> listar() {
        return cursoService.listar();
    }
}
