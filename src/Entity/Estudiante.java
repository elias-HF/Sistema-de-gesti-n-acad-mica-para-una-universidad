package Entity;

/*
Principio SRP
*/
@Entity
@Table(name="estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String correo;

    public Estudiante(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }
    //getters
    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getCorreo() {return correo;}
    
    
}
