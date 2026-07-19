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
    
        private CalificacionDAO dao;

        public CalificacionService(CalificacionDAO dao) {

            this.dao = dao;

        }

        public boolean registrar(Calificacion calificacion) {

            return dao.registrar(calificacion);

        }

        public boolean actualizar(Calificacion calificacion) {

            return dao.actualizar(calificacion);

        }

        public boolean eliminar(int id) {

            return dao.eliminar(id);

        }

        public Calificacion buscar(int id) {

            return dao.buscar(id);

        }

        public List<Calificacion> listar() {

            return dao.listar();

        }

    
    
}
