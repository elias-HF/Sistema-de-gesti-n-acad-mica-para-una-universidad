package service;

import Entity.Curso;
import Entity.Estudiante;
import Entity.Inscripcion;
import java.time.LocalDate;

/*
Principio SRP
 */
public class InscripcionService {
    
    
    
    public Inscripcion inscribir(Estudiante estudiante,Curso curso){

        System.out.println("Inscribiendo estudiante al curso...");

        Inscripcion inscripcion = new Inscripcion(0,estudiante,curso,LocalDate.now());

        return inscripcion;
    }
    
}
