package Entity;

/*
 Principio SRP
 */
@Entity
@Table(name="calificacion")
public class Calificacion {
    private Estudiante estudiante;
    private Curso curso;
    private double nota;

    public Calificacion(Estudiante estudiante, Curso curso, double nota) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.nota = nota;
    }

    public Estudiante getEstudiante()   {return estudiante;}
    public Curso getCurso()             {return curso;}
    public double getNota()             {return nota;}
    
    
    
}
