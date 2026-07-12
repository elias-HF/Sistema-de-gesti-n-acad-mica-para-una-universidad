/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

import Entity.Calificacion;

/**
 *
 * @author USUARIO
 */
public class CalificacionAdapter implements RegistroCalificacion{
    private SistemaNotasAntiguo sistema;

    public CalificacionAdapter() {
        sistema = new SistemaNotasAntiguo();
    }
    
    @Override
    public void registrarCalificacion(Calificacion c) {
        sistema.registrar(c.getNota());
    }
    
}
