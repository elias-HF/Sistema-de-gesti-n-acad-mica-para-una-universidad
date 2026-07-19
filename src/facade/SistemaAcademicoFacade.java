package facade;


import Entity.Calificacion;
import Entity.Carrera;
import Entity.Curso;
import Entity.CursoBase;
import Entity.Estudiante;
import Entity.Facultad;
import Entity.Inscripcion;
import Entity.ReporteAcademico;
import controller.CalificacionController;
import controller.CarreraController;
import controller.CursoController;
import controller.EstudianteController;
import controller.FacultadController;
import controller.InscripcionController;
import controller.ReporteAcademicoController;
import java.util.List;
import service.CursoService;



public class SistemaAcademicoFacade {
    /*
    Patron Facade
    */
    private FacultadController facultadController;
    private CarreraController carreraController;
    private EstudianteController estudianteController;
    private CursoController cursoController;
    private InscripcionController inscripcionController;
    private CalificacionController calificacionController;
    private ReporteAcademicoController reporteController;

    public SistemaAcademicoFacade() {

        facultadController = new FacultadController();
        carreraController = new CarreraController();
        estudianteController = new EstudianteController();
        cursoController = new CursoController(new CursoService());
        inscripcionController = new InscripcionController();
        calificacionController = new CalificacionController();
        reporteController = new ReporteAcademicoController();

    }

    //================ FACULTAD ==================

    public boolean registrarFacultad(Facultad f){
        return facultadController.registrar(f);
    }

    public List<Facultad> listarFacultades(){
        return facultadController.listar();
    }

    //================ CARRERA ==================

    public boolean registrarCarrera(Carrera c){
        return carreraController.registrar(c);
    }

    public List<Carrera> listarCarreras(){
        return carreraController.listar();
    }

    //================ ESTUDIANTE ==================

    public boolean registrarEstudiante(Estudiante e){
        return estudianteController.registrarEstudiante(e);
    }

    public List<Estudiante> listarEstudiantes(){
        return estudianteController.listarEstudiantes();
    }

    //================ CURSO ==================

    public boolean registrarCurso(CursoBase curso){
        return cursoController.registrar(curso);
    }

    public List<CursoBase> listarCursos(){
        return cursoController.listar();
    }

    //================ INSCRIPCION ==================

    public boolean registrarInscripcion(Inscripcion i){
        return inscripcionController.registrar(i);
    }

    public List<Inscripcion> listarInscripciones(){
        return inscripcionController.listar();
    }

    //================ CALIFICACION ==================

    public boolean registrarCalificacion(Calificacion c){
        return calificacionController.registrar(c);
    }

    public List<Calificacion> listarCalificaciones(){
        return calificacionController.listar();
    }

    //================ REPORTE ==================

    public boolean registrarReporte(ReporteAcademico r){
        return reporteController.registrar(r);
    }

    public List<ReporteAcademico> listarReportes(){
        return reporteController.listar();
    }

}
