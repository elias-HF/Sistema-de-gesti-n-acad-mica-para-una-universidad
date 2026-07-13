/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import Entity.Calificacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Notificador {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador){
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador){
        observadores.remove(observador);
    }

    public void notificar(Calificacion calificacion){

        for(Observador o : observadores){
            o.actualizar(calificacion);
        }

    }
}
