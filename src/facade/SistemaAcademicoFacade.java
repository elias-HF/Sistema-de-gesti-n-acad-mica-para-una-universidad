package facade;


import Entity.Calificacion;
import service.CalificacionService;
import Entity.Curso;
import Entity.Estudiante;
import service.InscripcionService;
import service.EstudianteService;


public class SistemaAcademicoFacade {
    /*
    Patron Facade
    */
    private EstudianteService estudianteService;
    private InscripcionService inscripcionService;
    private CalificacionService calificacionService;

    public SistemaAcademicoFacade(
            EstudianteService estudianteService,
            InscripcionService inscripcionService,
            CalificacionService calificacionService) {

        this.estudianteService = estudianteService;
        this.inscripcionService = inscripcionService;
        this.calificacionService = calificacionService;
    }

    public void procesoAcademico(Estudiante estudiante,
                                 Curso curso,
                                 double nota) {

        estudianteService.registrarEstudiante(estudiante);

        inscripcionService.inscribir(estudiante, curso);

        Calificacion calificacion =
                new Calificacion(estudiante, curso, nota);

        calificacionService.registrarCalificacion(calificacion);

        System.out.println("Proceso académico completado.");
    }
}
