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
    boolean registrar(Calificacion calificacion);

    boolean actualizar(Calificacion calificacion);

    boolean eliminar(int id);

    Calificacion buscar(int id);

    List<Calificacion> listar();
}
