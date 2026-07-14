
package observer;

import Entity.Calificacion;

/**
 *
 * @author USUARIO
 */
public class CoordinadorObserver implements Observador{

    @Override
    public void actualizar(Calificacion calificacion) {
        System.out.println(

                "Coordinador: Se registró la nota "

                + calificacion.getNota()

                + " del curso "

                + calificacion

                        .getInscripcion()

                        .getCurso()

                        .getNombreCurso()

        );
    }
    
}
