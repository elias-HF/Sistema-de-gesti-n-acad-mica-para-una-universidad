
package reportes;

import Entity.ReporteAcademico;

public class ReporteSimple implements Reporte{
    private ReporteAcademico reporte;

    @Override
    public void mostrarReporte() {
        System.out.println("===== REPORTE ACADÉMICO =====");

        System.out.println("Estudiante: "

                + reporte.getCalificacion()

                        .getInscripcion()

                        .getEstudiante()

                        .getNombre());

        System.out.println("Curso: "

                + reporte.getCalificacion()

                        .getInscripcion()

                        .getCurso()

                        .getNombreCurso());

        System.out.println("Nota: "

                + reporte.getCalificacion()

                        .getNota());

        System.out.println("Observación: "

                + reporte.getObservacion());
    }
}
