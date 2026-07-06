package facade;


import service.CalificacionesService;
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
    private CalificacionesService calificacionService;

    public SistemaAcademicoFacade(EstudianteService estudianteService, InscripcionService inscripcionService, CalificacionesService calificacionService) {
        this.estudianteService = estudianteService;
        this.inscripcionService = inscripcionService;
        this.calificacionService = calificacionService;
    }
    
    public void procesoAcademico(Estudiante e, Curso c, double nota){
        estudianteService.registrarEstudiante(e);

        inscripcionService.inscribir(e, c);

        calificacionService.asignarNota(e, c, nota);

        System.out.println("Proceso académico completado.");
    }
}
