
package Entity;


public class CursoHibrido extends CursoBase{

    public CursoHibrido() {

        super(0, "Curso Hibrido", 400, "Hibrido");

    }

    @Override
    public Curso clonar() {
        return new CursoHibrido();
    }
    
}
