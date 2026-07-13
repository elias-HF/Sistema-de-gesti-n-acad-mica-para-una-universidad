/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Entity.Curso;
import dao.CursoDAO;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class CursoService {
    private CursoDAO cursoDAO;

    public CursoService(CursoDAO cursoDAO) {
        this.cursoDAO = cursoDAO;
    }

    public void registrarCurso(Curso curso) {
        cursoDAO.registrar(curso);
    }

    public void actualizarCurso(Curso curso) {
        cursoDAO.actualizar(curso);
    }

    public void eliminarCurso(int id) {
        cursoDAO.eliminar(id);
    }

    public Curso buscarCurso(int id) {
        return cursoDAO.buscarPorId(id);
    }

    public List<Curso> listarCursos() {
        return cursoDAO.listar();
    }
}
