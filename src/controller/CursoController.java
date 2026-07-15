/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Entity.Curso;
import java.util.List;
import service.CursoService;

/**
 *
 * @author USUARIO
 */
public class CursoController {
    private CursoService cursoService;

    public CursoController(CursoService cursoService){
        this.cursoService = cursoService;
    }

    public void registrarCurso(Curso curso){
        cursoService.registrarCurso(curso);
    }

    public void actualizarCurso(Curso curso){
        cursoService.actualizarCurso(curso);
    }

    public void eliminarCurso(int id){
        cursoService.eliminarCurso(id);
    }

    public Curso buscarCurso(int id){
        return cursoService.buscarCurso(id);
    }

    public List<Curso> listarCursos(){
        return cursoService.listarCursos();
    }
}
