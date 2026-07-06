package service;

import Entity.Curso;
import Entity.Estudiante;

/*
Principio SRP
 */
public class InscripcionService {
    public void inscribir(Estudiante estudiante, Curso curso){
        System.out.println("Inscribiendo al estudiante :" + estudiante.getNombre()+" al curso: "+ curso.getNombreCurso());
    }
}
