
package dao;

import Entity.Facultad;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import database.AccesoDB;
import java.util.ArrayList;
import java.util.List;


public class FacultadDAOImp implements FacultadDAO{

    @Override
    public boolean registrar(Facultad facultad) {
        String sql = "INSERT INTO facultad(nombre) VALUES(?)";

        try(Connection cn = AccesoDB.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql)){

            ps.setString(1, facultad.getNombre());

            return ps.executeUpdate()>0;

        }catch(Exception e){

            e.printStackTrace();

        }

        return false;
    }

    @Override
    public boolean actualizar(Facultad facultad) {
        String sql="UPDATE facultad SET nombre=? WHERE id=?";

        try(Connection cn=AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql)){

            ps.setString(1, facultad.getNombre());
            ps.setInt(2, facultad.getId());

            return ps.executeUpdate()>0;

        }catch(Exception e){

            e.printStackTrace();

        }

        return false;
        }

    @Override
    public boolean eliminar(int id) {
        String sql="DELETE FROM facultad WHERE id=?";

        try(Connection cn=AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql)){

            ps.setInt(1,id);

            return ps.executeUpdate()>0;

        }catch(Exception e){

            e.printStackTrace();

        }

        return false;
    }

    @Override
    public Facultad buscar(int id) {
        String sql="SELECT * FROM facultad WHERE id=?";

        try(Connection cn=AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql)){

            ps.setInt(1,id);

            ResultSet rs=ps.executeQuery();

            if(rs.next()){

                Facultad facultad=new Facultad();

                facultad.setId(rs.getInt("id"));
                facultad.setNombre(rs.getString("nombre"));

                return facultad;

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        return null;
    }

    @Override
    public List<Facultad> listar() {
        List<Facultad> lista=new ArrayList<>();

        String sql="SELECT * FROM facultad";

        try(Connection cn=AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()){

            while(rs.next()){

                Facultad facultad=new Facultad();

                facultad.setId(rs.getInt("id"));
                facultad.setNombre(rs.getString("nombre"));

                lista.add(facultad);

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        return lista;
    }
    
}
