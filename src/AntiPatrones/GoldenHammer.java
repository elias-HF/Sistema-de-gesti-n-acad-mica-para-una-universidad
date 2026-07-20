
package AntiPatrones;


public class GoldenHammer {
    public double calcularCosto(String tipoCurso){

        if(tipoCurso.equals("Presencial")){
            return 500;
        }

        if(tipoCurso.equals("Virtual")){
            return 300;
        }

        if(tipoCurso.equals("Hibrido")){
            return 400;
        }

        if(tipoCurso.equals("Especial")){
            return 700;
        }

        if(tipoCurso.equals("Maestria")){
            return 900;
        }

        if(tipoCurso.equals("Doctorado")){
            return 1200;
        }

        return 0;

    }
}
