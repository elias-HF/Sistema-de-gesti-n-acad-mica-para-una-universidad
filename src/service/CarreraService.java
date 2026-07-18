
package service;

import Entity.Carrera;
import dao.CarreraDAO;
import dao.CarreraDAOImp;
import java.util.List;


public class CarreraService {
    private CarreraDAO dao = new CarreraDAOImp();

    public boolean registrar(Carrera carrera){
        return dao.registrar(carrera);
    }

    public boolean actualizar(Carrera carrera){
        return dao.actualizar(carrera);
    }

    public boolean eliminar(int id){
        return dao.eliminar(id);
    }

    public Carrera buscar(int id){
        return dao.buscar(id);
    }

    public List<Carrera> listar(){
        return dao.listar();
    }
    
    
}
