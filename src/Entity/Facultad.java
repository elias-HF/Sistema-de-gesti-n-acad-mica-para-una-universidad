/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Facultad {
    private int id;
    private String nombre;

    // Relación lógica con Carrera
    private List<Carrera> carreras;

    public Facultad() {
        carreras = new ArrayList<>();
    }

    public Facultad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
}
