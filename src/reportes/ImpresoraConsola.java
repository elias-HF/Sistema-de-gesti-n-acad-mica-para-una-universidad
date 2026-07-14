package reportes;


import Entity.Calificacion;
import reportes.ImpresionReporte;

/*
Principio LSP
 */
public class ImpresoraConsola implements ImpresionReporte{

    @Override
    public void imprimirReporteCalificacion(Calificacion calificacion) {
        System.out.println("================================");

        System.out.println("Estudiante: "
                + calificacion
                        .getInscripcion()
                        .getEstudiante()
                        .getNombre());

        System.out.println("Curso: "
                + calificacion
                        .getInscripcion()
                        .getCurso()
                        .getNombreCurso());

        System.out.println("Nota: "
                + calificacion.getNota());

        System.out.println("================================");
    }
    
}
