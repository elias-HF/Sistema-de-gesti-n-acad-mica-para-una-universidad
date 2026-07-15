package Entity;

/*
Principio SRP
*/
//@Entity
//@Table(name="estudiante")
public class Estudiante {
    
    private int id;
    private String nombre;
    private String correo;
    
    private Carrera carrera;
    
    public Estudiante() {
    }
    
    public Estudiante(int id, String nombre, String correo, Carrera carrera) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
    }
    //getters
    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getCorreo() {return correo;}

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setId(int id){
        this.id = id;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
