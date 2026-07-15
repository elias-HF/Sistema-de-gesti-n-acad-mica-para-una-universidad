/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import Entity.Curso;

/**
 *
 * @author USUARIO
 */
public class CursoLeaf implements ComponenteAcademico{
    private Curso curso;
    
    public CursoLeaf(Curso curso){
        this.curso = curso;
    }

    @Override
    public void mostrarEstructura() {
       System.out.println("Curso: " + curso.getNombreCurso());
    }
    
    
}
