
package Entity;


public class CursoHibrido implements Curso{

    @Override
    public String getNombreCurso() {
        return "Curso Hibrido";
    }

    @Override
    public double calcularCosto() {
        return 400.0;
    }

    @Override
    public Curso clonar() {
        return new CursoHibrido();
    }
    
}
