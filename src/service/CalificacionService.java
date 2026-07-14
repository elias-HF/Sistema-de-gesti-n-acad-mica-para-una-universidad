package service;


import Entity.Calificacion;
import dao.CalificacionDAO;
import java.util.List;
import util.Validaciones;

/*
 Principio SRP

Registra y valida la nota
 */
public class CalificacionService {
    
    private CalificacionDAO calificacionDAO;

    public CalificacionService(CalificacionDAO calificacionDAO) {
        this.calificacionDAO = calificacionDAO;
    }

    public void registrarCalificacion(Calificacion calificacion){

        if(!Validaciones.validarNota(calificacion.getNota())){
            throw new IllegalArgumentException(
                    "La nota debe estar entre 0 y 20.");
        }

        calificacionDAO.registrar(calificacion);

        System.out.println("Calificación registrada.");

    }

    public void actualizarCalificacion(Calificacion calificacion){
        calificacionDAO.actualizar(calificacion);
    }

    public void eliminarCalificacion(int id){
        calificacionDAO.eliminar(id);
    }

    public Calificacion buscarCalificacion(int id){
        return calificacionDAO.buscarPorId(id);
    }

    public List<Calificacion> listarCalificaciones(){
        return calificacionDAO.listar();
    }

    
    
}
