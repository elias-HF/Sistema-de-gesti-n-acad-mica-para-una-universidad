
public class Main {

    public static void main(String[] args) {
    
        EstudianteDB eDB = new EstudianteDBImplementacion();
        EstudianteService estudianteService = new EstudianteService(eDB);

        Estudiante e = new Estudiante(1, "Elias", "Elias@gmail.com");
        estudianteService.registrarEstudiante(e);

        Curso curso = new CursoPresencial();

        InscripcionService inscripcionService = new InscripcionService();
        inscripcionService.inscribir(e, curso);

        CalificacionesService calificacionService = new CalificacionesService();
        calificacionService.asignarNota(e, curso, 18);
        
        ReporteCalificaciones reporte = new ReporteCalificacionesImplementacion();

        // Generar datos del reporte
        Calificacion calificacion = reporte.generarReporte(e, curso, 18);

        ImpresionReporte impresora = new ImpresoraConsola();
        impresora.imprimirReporteCalificacion(calificacion);
        
    }
    
}
