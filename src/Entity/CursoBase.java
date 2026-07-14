/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    protected Carrera carrera;
    
    public CursoBase(){}

    public CursoBase(int id,String nombreCurso,double costo,String tipoCurso, Carrera carrera){
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.costo = costo;
        this.tipoCurso = tipoCurso;
        this.carrera = carrera;
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

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
    
}
