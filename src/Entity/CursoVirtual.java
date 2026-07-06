package Entity;


import Entity.Curso;

/*
Principio OCP
 */
public class CursoVirtual implements Curso{

    @Override
    public double calcularCosto() {
        return 300;
    }

    @Override
    public String getNombreCurso() {
        return "Curso Virtual";
    }
    
}
