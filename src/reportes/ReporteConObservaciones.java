/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

/**
 *
 * @author USUARIO
 */
public class ReporteConObservaciones extends ReporteDecorador{

    public ReporteConObservaciones(Reporte reporte) {
        super(reporte);
    }
    
    @Override
    public void mostrarReporte(){

    reporte.mostrarReporte();

    System.out.println("Observaciones: ...");

}
    
}
