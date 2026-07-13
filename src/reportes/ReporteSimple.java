/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

import Entity.ReporteAcademico;

/**
 *
 * @author USUARIO
 */
public class ReporteSimple implements Reporte{
    private ReporteAcademico reporte;

    @Override
    public void mostrarReporte() {
        System.out.println("===== REPORTE ACADÉMICO =====");

        System.out.println("Estudiante: "
                + reporte.getCalificacion()
                        .getEstudiante()
                        .getNombre());

        System.out.println("Curso: "
                + reporte.getCalificacion()
                        .getCurso()
                        .getNombreCurso());

        System.out.println("Nota: "
                + reporte.getCalificacion()
                        .getNota());

        System.out.println("Observación: "
                + reporte.getObservacion());
    }
}
