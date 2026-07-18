package Entity;

/*
principio OCP
*/
public class CursoPresencial extends CursoBase{
    
    public CursoPresencial() {

        super(0, "Curso Presencial", 500, "Presencial");

    }

    @Override
    public Curso clonar() {
        return new CursoPresencial();
    }
    
}
