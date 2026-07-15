/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class CarreraComposite implements ComponenteAcademico{
    private String nombre;
    private List<ComponenteAcademico> componentes;

    public CarreraComposite(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    public void agregar(ComponenteAcademico componente) {
        componentes.add(componente);
    }

    public void eliminar(ComponenteAcademico componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarEstructura() {

        System.out.println("   Carrera: " + nombre);

        for (ComponenteAcademico componente : componentes) {
            componente.mostrarEstructura();
        }
    }
}
