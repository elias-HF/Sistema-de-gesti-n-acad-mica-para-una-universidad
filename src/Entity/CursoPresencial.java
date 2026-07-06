package Entity;


import Entity.Curso;

/*
principio OCP
*/
public class CursoPresencial implements Curso{

    @Override
    public double calcularCosto() {
        return 500;
    }

    @Override
    public String getNombreCurso() {
        return "Curso Presencial";
    }
    
}
