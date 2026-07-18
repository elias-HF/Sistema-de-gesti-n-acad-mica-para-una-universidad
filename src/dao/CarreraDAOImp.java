
package dao;

import Entity.Carrera;
import Entity.Facultad;
import database.AccesoDB;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class CarreraDAOImp implements CarreraDAO{
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean registrar(Carrera carrera) {

        String sql = "INSERT INTO carrera(nombre, facultad_id) VALUES(?,?)";

        try {
            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, carrera.getNombre());
            ps.setInt(2, carrera.getFacultad().getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean actualizar(Carrera carrera) {

        String sql = "UPDATE carrera SET nombre=?, facultad_id=? WHERE id=?";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, carrera.getNombre());
            ps.setInt(2, carrera.getFacultad().getId());
            ps.setInt(3, carrera.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean eliminar(int id) {

        String sql = "DELETE FROM carrera WHERE id=?";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public Carrera buscar(int id) {

        String sql =
        "SELECT c.id,c.nombre,f.id AS idFacultad,f.nombre AS facultad " +
        "FROM carrera c INNER JOIN facultad f ON c.facultad_id=f.id WHERE c.id=?";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            if(rs.next()){

                Facultad f = new Facultad(
                        rs.getInt("idFacultad"),
                        rs.getString("facultad"));

                return new Carrera(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        f);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Carrera> listar() {

        List<Carrera> lista = new ArrayList<>();

        String sql =
        "SELECT c.id,c.nombre,f.id AS idFacultad,f.nombre AS facultad " +
        "FROM carrera c INNER JOIN facultad f ON c.facultad_id=f.id";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while(rs.next()){

                Facultad f = new Facultad(
                        rs.getInt("idFacultad"),
                        rs.getString("facultad"));

                Carrera c = new Carrera(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        f);

                lista.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
