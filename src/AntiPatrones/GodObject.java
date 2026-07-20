
package AntiPatrones;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class GodObject {
    public void registrarEstudiante() {
        System.out.println("Registrando estudiante...");
    }

    public void actualizarEstudiante() {
        System.out.println("Actualizando estudiante...");
    }

    // Gestión de cursos
    public void registrarCurso() {
        System.out.println("Registrando curso...");
    }

    public void actualizarCurso() {
        System.out.println("Actualizando curso...");
    }

    // Gestión de inscripciones
    public void registrarInscripcion() {
        System.out.println("Registrando inscripción...");
    }

    // Gestión de calificaciones
    public void registrarCalificacion() {
        System.out.println("Registrando calificación...");
    }

    // Reportes
    public void generarReporteAcademico() {
        System.out.println("Generando reporte...");
    }

    // Base de datos
    public Connection conectarBD() {
        return null;
    }

    public PreparedStatement prepararConsulta() {
        return null;
    }

    // Notificaciones
    public void enviarCorreo() {
        System.out.println("Enviando correo...");
    }

    public void enviarNotificacion() {
        System.out.println("Notificando...");
    }
}

