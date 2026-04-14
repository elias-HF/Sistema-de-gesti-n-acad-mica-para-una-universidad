/*
Principio LSP
 */
public class ImpresoraConsola implements ImpresionReporte{

    @Override
    public void imprimirReporteCalificacion(Calificacion calificacion) {
        System.out.println("================================================");
        System.out.println("Estudiante: "+ calificacion.getEstudiante());
        System.out.println("Curso: "+ calificacion.getCurso());
        System.out.println("Nota: "+ calificacion.getNota());
        System.out.println("================================================");
    }
    
}
