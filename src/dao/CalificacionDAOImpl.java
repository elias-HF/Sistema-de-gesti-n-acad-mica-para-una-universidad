
package dao;

import Entity.Calificacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class CalificacionDAOImpl implements CalificacionDAO{
    //se cambiaran por sus respectivos procedimientos almacenados
    @Override
    public void registrar(Calificacion calificacion) {
        System.out.println("DAO -> Calificación registrada correctamente.");
    }

    @Override
    public void actualizar(Calificacion calificacion) {
        System.out.println("DAO -> Calificación actualizada.");
    }

    @Override
    public void eliminar(int id) {
        System.out.println("DAO -> Calificación eliminada.");
    }

    @Override
    public Calificacion buscarPorId(int id) {
        System.out.println("DAO -> Buscando calificación.");
        return null;
    }

    @Override
    public List<Calificacion> listar() {
        System.out.println("DAO -> Listando calificaciones.");

        return new ArrayList<>();
    }
    
}
