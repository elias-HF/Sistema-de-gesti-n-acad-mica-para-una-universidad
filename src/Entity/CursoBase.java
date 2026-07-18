
package Entity;

/**
 *
 * @author USUARIO
 */
public abstract class CursoBase implements Curso{
    protected int id;
    protected String nombreCurso;
    protected double costo;
    protected String tipoCurso;

    
    public CursoBase(){}

    public CursoBase(int id,String nombreCurso,double costo,String tipoCurso){
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.costo = costo;
        this.tipoCurso = tipoCurso;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    public double getCosto() {
        return costo;
    }
    
    @Override
    public double calcularCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    
    
    
    @Override
        public String toString() {
            return nombreCurso;
        }
    
}
