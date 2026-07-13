package service;

import Entity.Curso;
import Entity.Estudiante;

/*
Principio SRP
 */
public class InscripcionService {
    
    
    
    public void inscribir(Estudiante estudiante, Curso curso){

        System.out.println(
                estudiante.getNombre()
                + " inscrito en "
                + curso.getNombreCurso());

    }
}
