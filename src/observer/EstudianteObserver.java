
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

                + calificacion

                        .getInscripcion()

                        .getEstudiante()

                        .getNombre()

                + " obtuvo "

                + calificacion.getNota()

        );
    }
    
}
