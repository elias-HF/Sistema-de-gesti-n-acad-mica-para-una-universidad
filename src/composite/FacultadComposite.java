
package composite;

import java.util.List;
import java.util.ArrayList;

public class FacultadComposite implements ComponenteAcademico{
    
    private String nombre;
    private List<ComponenteAcademico> componentes = new ArrayList<>();

    public FacultadComposite(String nombre){
        this.nombre = nombre;
    }

    public void agregar(ComponenteAcademico componente){
        componentes.add(componente);
    }
    
    public void eliminar(ComponenteAcademico componente) {
        componentes.remove(componente);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void mostrarEstructura() {
        System.out.println("Facultad: " + nombre);

        for(ComponenteAcademico c : componentes){

            c.mostrarEstructura();

        }
    }
}
