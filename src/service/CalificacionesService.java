package service;


import Entity.Curso;
import Entity.Estudiante;

/*
 Principio SRP
 */
public class CalificacionesService {
    public void asignarNota(Estudiante estudiante,Curso curso, double nota){
        System.out.println("Asignando nota: "+nota+ "al estudiante "+estudiante.getNombre());
    }
}
