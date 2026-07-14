package Entity;



/*
Principio OCP
 */
public class CursoVirtual extends CursoBase{

    public CursoVirtual(){

        super(0, "Curso Virtual", 300, "Virtual", null);

    }

    @Override
    public Curso clonar() {
        return new CursoVirtual();
    }
    
}
