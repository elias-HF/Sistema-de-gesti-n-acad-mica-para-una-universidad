package factory;

import Entity.Curso;
import Entity.CursoVirtual;
import Entity.CursoPresencial;


public class CursoFactory {
    /*
    Patron Factory
    **/
    public static Curso crearCurso(String tipo){
        
        switch(tipo.toLowerCase()){
            
            case "presencial":
                
                return new CursoPresencial();
                
            case "virtual":
                
                return new CursoVirtual();
                
            default:
                throw new IllegalArgumentException("Tipo de curso no valido");
        }
    }

    

    
    
}
