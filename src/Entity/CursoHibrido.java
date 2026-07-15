
package Entity;


public class CursoHibrido extends CursoBase{

    public CursoHibrido(){

        super(0,"Curso Híbrido",400,"Híbrido",null);

    }

    @Override
    public Curso clonar(){

        return new CursoHibrido();

    }
    
}
