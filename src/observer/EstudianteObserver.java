/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import Entity.Calificacion;

/**
 *
 * @author USUARIO
 */
public class EstudianteObserver implements Observador{

    @Override
    public void actualizar(Calificacion calificacion) {
        System.out.println(
            "Estudiante notificado: "
            + calificacion.getEstudiante().getNombre()
            + " obtuvo "
            + calificacion.getNota()
        );
    }
    
}
