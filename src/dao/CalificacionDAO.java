/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Entity.Calificacion;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface CalificacionDAO {
    void registrar(Calificacion calificacion);

    void actualizar(Calificacion calificacion);

    void eliminar(int id);

    Calificacion buscarPorId(int id);

    List<Calificacion> listar();
}
