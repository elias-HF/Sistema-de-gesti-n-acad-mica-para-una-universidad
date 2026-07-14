package Entity;



/*
Principio OCP
 */
public class CursoVirtual extends CursoBase{

    public CursoVirtual(){

        super(0, "Curso Presencial", 500, "Presencial", null);

    }

    @Override
    public Curso clonar() {
        return new CursoVirtual();
    }
    
}
