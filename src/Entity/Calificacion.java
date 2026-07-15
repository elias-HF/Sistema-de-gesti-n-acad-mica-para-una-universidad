package Entity;

/*
 Principio SRP
 */
//@Entity
//@Table(name="calificacion")
public class Calificacion {
    private int id;

    private Inscripcion inscripcion;

    private double nota;

    public Calificacion() {
    }
    
    public Calificacion(int id,Inscripcion inscripcion,double nota) {
        this.id = id;
        this.inscripcion = inscripcion;
        this.nota = nota;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    
    
}
