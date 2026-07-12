package aplicacion;


import service.ReporteCalificaciones;
import dao.EstudianteDAOImpl;
import Entity.Calificacion;
import reportes.ImpresoraConsola;
import reportes.ImpresionReporte;
import facade.SistemaAcademicoFacade;
import service.CalificacionesService;
import service.ReporteCalificacionesImp;
import Entity.Curso;
import Entity.Estudiante;
import service.InscripcionService;
import service.EstudianteService;
import factory.CursoFactory;
import database.MySQLDataBase;
import dao.EstudianteDAO;


public class Main {

    public static void main(String[] args) {
    
        EstudianteDAO eDB = new EstudianteDAOImpl();
        EstudianteService estudianteService = new EstudianteService(eDB);
        MySQLDataBase db = MySQLDataBase.getInstancia();
        db.conectar();
        Estudiante e = new Estudiante(1, "Elias", "Elias@gmail.com");
        

        Curso curso = CursoFactory.crearCurso("presencial");

        InscripcionService inscripcionService = new InscripcionService();
        

        CalificacionesService calificacionService = new CalificacionesService();
        
        
        
        ReporteCalificaciones reporte = new ReporteCalificacionesImp();
        
        SistemaAcademicoFacade facade =
        new SistemaAcademicoFacade(
                estudianteService,
                inscripcionService,
                calificacionService);

        facade.procesoAcademico(e, curso, 18);
        
        // Generar datos del reporte
        Calificacion calificacion = reporte.generarReporte(e, curso, 18);

        ImpresionReporte impresora = new ImpresoraConsola();
        impresora.imprimirReporteCalificacion(calificacion);
        
    }
    
}
