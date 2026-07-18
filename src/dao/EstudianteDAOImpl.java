package dao;

import Entity.Carrera;
import database.AccesoDB;
import Entity.Estudiante;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/*
Principio SRP
 */
public class EstudianteDAOImpl implements EstudianteDAO{
    //se modificara los metodos con procedimientos almacenado
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    @Override
    public boolean registrar(Estudiante estudiante) {

        String sql = "INSERT INTO estudiante(nombre, correo, carrera_id) VALUES(?,?,?)";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getCorreo());
            ps.setInt(3, estudiante.getCarrera().getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;

        }

    }

    @Override
    public boolean actualizar(Estudiante estudiante) {

        String sql = "UPDATE estudiante SET nombre=?, correo=?, carrera_id=? WHERE id=?";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getCorreo());
            ps.setInt(3, estudiante.getCarrera().getId());
            ps.setInt(4, estudiante.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;

        }

    }

    @Override
    public boolean eliminar(int id) {

        String sql = "DELETE FROM estudiante WHERE id=?";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;

        }

    }

    @Override
    public Estudiante buscarPorId(int id) {

        String sql =
            "SELECT e.id, e.nombre, e.correo, " +
            "c.id AS carrera_id, c.nombre " +
            "FROM estudiante e " +
            "INNER JOIN carrera c ON e.carrera_id = c.id " +
            "WHERE e.id=?";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            if(rs.next()){

                Carrera carrera = new Carrera();
                carrera.setId(rs.getInt("carrera_id"));
                carrera.setNombre(rs.getString("nombre"));

                Estudiante estudiante = new Estudiante();

                estudiante.setId(rs.getInt("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setCorreo(rs.getString("correo"));
                estudiante.setCarrera(carrera);

                return estudiante;

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return null;

    }

    @Override
    public List<Estudiante> listar() {

        List<Estudiante> lista = new ArrayList<>();

        String sql =
            "SELECT e.id, e.nombre, e.correo, " +
            "c.id AS carrera_id, c.nombre " +
            "FROM estudiante e " +
            "INNER JOIN carrera c ON e.carrera_id = c.id";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while(rs.next()){

                Carrera carrera = new Carrera();
                carrera.setId(rs.getInt("carrera_id"));
                carrera.setNombre(rs.getString("nombre"));

                Estudiante estudiante = new Estudiante();

                estudiante.setId(rs.getInt("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setCorreo(rs.getString("correo"));
                estudiante.setCarrera(carrera);

                lista.add(estudiante);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return lista;

    }
    
    
}
