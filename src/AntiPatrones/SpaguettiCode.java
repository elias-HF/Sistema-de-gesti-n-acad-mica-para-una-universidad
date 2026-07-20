
package AntiPatrones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class SpaguettiCode {
    public void btnRegistrar(){

        try{

            String nombre="Juan";
            int curso=2;

            Connection con=database.AccesoDB.getConnection();

            PreparedStatement ps=con.prepareStatement(
                "INSERT INTO inscripcion(estudiante_id,curso_id) VALUES(?,?)");

            ps.setInt(1,1);
            ps.setInt(2,curso);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"Registrado");

            PreparedStatement ps2=
                con.prepareStatement(
                "SELECT * FROM inscripcion");

            ps2.executeQuery();

            JOptionPane.showMessageDialog(null,"Consulta realizada");

        }catch(Exception e){

            e.printStackTrace();

        }

    }

}
