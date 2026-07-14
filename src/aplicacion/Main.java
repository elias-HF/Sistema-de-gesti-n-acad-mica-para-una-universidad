package aplicacion;


import service.ReporteCalificaciones;
import dao.EstudianteDAOImpl;
import Entity.Carrera;
import facade.SistemaAcademicoFacade;
import service.CalificacionService;
import service.ReporteCalificacionesImp;
import Entity.Curso;
import Entity.CursoBase;
import Entity.Estudiante;
import Entity.Facultad;
import dao.CalificacionDAO;
import dao.CalificacionDAOImpl;
import service.InscripcionService;
import service.EstudianteService;
import factory.CursoFactory;
import database.MySQLDataBase;
import dao.EstudianteDAO;


public class Main {

    public static void main(String[] args) {
    

        MySQLDataBase db = MySQLDataBase.getInstancia();
    db.conectar();

    EstudianteDAO estudianteDAO = new EstudianteDAOImpl();
    CalificacionDAO calificacionDAO = new CalificacionDAOImpl();

    EstudianteService estudianteService =
            new EstudianteService(estudianteDAO);

    InscripcionService inscripcionService =
            new InscripcionService();

    CalificacionService calificacionService =
            new CalificacionService(calificacionDAO);

    ReporteCalificaciones reporteService =
            new ReporteCalificacionesImp();

    SistemaAcademicoFacade facade =
            new SistemaAcademicoFacade(
                    estudianteService,
                    inscripcionService,
                    calificacionService,
                    reporteService);

    Facultad facultad =
            new Facultad(1, "Ingeniería");

    Carrera carrera =
            new Carrera(
                    1,
                    "Ingeniería de Sistemas",
                    facultad);

    Estudiante estudiante =
            new Estudiante(
                    1,
                    "Elias",
                    "elias@gmail.com",
                    carrera);

    Curso curso =
            CursoFactory.crearCurso("presencial");

    ((CursoBase) curso).setCarrera(carrera);

    facade.procesoAcademico(
            estudiante,
            curso,
            18);

    }
        
    
    
}
