
package controller;

import Entity.Carrera;
import java.util.List;
import service.CarreraService;

public class CarreraController {
    private CarreraService service = new CarreraService();

    public boolean registrar(Carrera carrera){
        return service.registrar(carrera);
    }

    public boolean actualizar(Carrera carrera){
        return service.actualizar(carrera);
    }

    public boolean eliminar(int id){
        return service.eliminar(id);
    }

    public Carrera buscar(int id){
        return service.buscar(id);
    }

    public List<Carrera> listar(){
        return service.listar();
    }

}
