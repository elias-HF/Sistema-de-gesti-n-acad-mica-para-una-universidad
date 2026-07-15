/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class UniversidadComposite implements ComponenteAcademico{
    private String nombre;

    private List<ComponenteAcademico> componentes = new ArrayList<>();

    public UniversidadComposite(String nombre){
        this.nombre = nombre;
    }

    public void agregar(ComponenteAcademico componente){

        componentes.add(componente);

    }

    @Override
    public void mostrarEstructura() {
        System.out.println("Universidad: " + nombre);

        for(ComponenteAcademico c : componentes){

            c.mostrarEstructura();

        }
    }
}
