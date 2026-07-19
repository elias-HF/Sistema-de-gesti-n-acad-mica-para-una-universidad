
package controller;

import Entity.Calificacion;
import dao.CalificacionDAOImpl;
import java.util.List;
import service.CalificacionService;


public class CalificacionController {
        private CalificacionService service;

        public CalificacionController() {

            service = new CalificacionService(new CalificacionDAOImpl());

        }

        public boolean registrar(Calificacion calificacion) {

            return service.registrar(calificacion);

        }

        public boolean actualizar(Calificacion calificacion) {

            return service.actualizar(calificacion);

        }

        public boolean eliminar(int id) {

            return service.eliminar(id);

        }

        public Calificacion buscar(int id) {

            return service.buscar(id);

        }

        public List<Calificacion> listar() {

            return service.listar();

        }
}
