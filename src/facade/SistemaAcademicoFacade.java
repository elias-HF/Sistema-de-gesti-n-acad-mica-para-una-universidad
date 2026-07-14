package facade;


import Entity.Calificacion;
import service.CalificacionService;
import Entity.Curso;
import Entity.Estudiante;
import Entity.Inscripcion;
import reportes.ImpresionReporte;
import reportes.ImpresoraConsola;
import service.InscripcionService;
import service.EstudianteService;
import service.ReporteCalificaciones;


public class SistemaAcademicoFacade {
    /*
    Patron Facade
    */
    private EstudianteService estudianteService;
    private InscripcionService inscripcionService;
    private CalificacionService calificacionService;
    private ReporteCalificaciones reporteService;

    public SistemaAcademicoFacade(
            EstudianteService estudianteService,
            InscripcionService inscripcionService,
            CalificacionService calificacionService,
            ReporteCalificaciones reporteService) {

        this.estudianteService = estudianteService;
        this.inscripcionService = inscripcionService;
        this.calificacionService = calificacionService;
        this.reporteService = reporteService;
    }

    public void procesoAcademico(Estudiante estudiante,
                                 Curso curso,
                                 double nota) {

        // Registrar estudiante
        estudianteService.registrarEstudiante(estudiante);

        // Crear inscripción
        Inscripcion inscripcion =
                inscripcionService.inscribir(estudiante, curso);

        // Registrar nota
        Calificacion calificacion =
                new Calificacion(
                        0,
                        inscripcion,
                        nota);

        calificacionService.registrarCalificacion(calificacion);

        // Generar reporte
        Calificacion reporte =
                reporteService.generarReporte(calificacion);

        // Imprimir reporte
        ImpresionReporte impresora =
                new ImpresoraConsola();

        impresora.imprimirReporteCalificacion(reporte);

        System.out.println();
        System.out.println("Proceso académico completado correctamente.");

    }

}
