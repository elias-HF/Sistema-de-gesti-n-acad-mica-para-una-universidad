/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Entity.Curso;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface CursoDAO {
    void registrar(Curso curso);

    void actualizar(Curso curso);

    void eliminar(int id);

    Curso buscarPorId(int id);

    List<Curso> listar();
}
