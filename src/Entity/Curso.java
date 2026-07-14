package Entity;

import prototype.Clonable;

/*
Principio OCP
*/
//@Entity
//@Table(name="curso")
public interface Curso extends Clonable<Curso>{
     
    
     String getNombreCurso();
     
     double calcularCosto();
     
     
     
}
