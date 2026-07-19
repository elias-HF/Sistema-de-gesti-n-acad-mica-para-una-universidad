
package dao;

import Entity.Inscripcion;
import database.AccesoDB;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InscripcionDAOImp implements InscripcionDAO{
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean registrar(Inscripcion inscripcion) {

        String sql = "INSERT INTO inscripcion(estudiante_id,curso_id,fecha_inscripcion) VALUES(?,?,?)";

        try{

            con = AccesoDB.getConnection();

            ps = con.prepareStatement(sql);

            ps.setInt(1, inscripcion.getEstudiante().getId());

            ps.setInt(2, inscripcion.getCurso().getId());

            ps.setDate(3, new java.sql.Date(inscripcion.getFechaInscripcion().getTime()));

            return ps.executeUpdate()>0;

        }catch(Exception e){

            e.printStackTrace();

        }

        return false;

    }

    @Override
    public boolean actualizar(Inscripcion inscripcion) {

        String sql="UPDATE inscripcion SET estudiante_id=?,curso_id=?,fecha_inscripcion=? WHERE id=?";

        try{

            con=AccesoDB.getConnection();

            ps=con.prepareStatement(sql);

            ps.setInt(1,inscripcion.getEstudiante().getId());

            ps.setInt(2,inscripcion.getCurso().getId());

            ps.setDate(3, new java.sql.Date(inscripcion.getFechaInscripcion().getTime()));

            ps.setInt(4,inscripcion.getId());

            return ps.executeUpdate()>0;

        }catch(Exception e){

            e.printStackTrace();

        }

        return false;

    }

    @Override
    public boolean eliminar(int id) {

        String sql="DELETE FROM inscripcion WHERE id=?";

        try{

            con=AccesoDB.getConnection();

            ps=con.prepareStatement(sql);

            ps.setInt(1,id);

            return ps.executeUpdate()>0;

        }catch(Exception e){

            e.printStackTrace();

        }

        return false;

    }

    @Override
    public Inscripcion buscar(int id) {

        String sql=
        "SELECT * FROM inscripcion WHERE id=?";

        try{

            con=AccesoDB.getConnection();

            ps=con.prepareStatement(sql);

            ps.setInt(1,id);

            rs=ps.executeQuery();

            if(rs.next()){

                EstudianteDAO estudianteDAO=new EstudianteDAOImpl();

                CursoDAO cursoDAO=new CursoDAOImp();

                Inscripcion inscripcion=new Inscripcion();

                inscripcion.setId(rs.getInt("id"));

                inscripcion.setEstudiante(
                        estudianteDAO.buscarPorId(rs.getInt("estudiante_id")));

                inscripcion.setCurso(
                        cursoDAO.buscar(rs.getInt("curso_id")));

                inscripcion.setFechaInscripcion(rs.getDate("fecha_inscripcion"));
                
                //validacion
                System.out.println("ID Inscripción: " + inscripcion.getId());

                System.out.println("Estudiante: " + inscripcion.getEstudiante());

                if(inscripcion.getEstudiante() != null){
                    System.out.println(inscripcion.getEstudiante().getNombre());
                }

                System.out.println("Curso: " + inscripcion.getCurso());
                
                return inscripcion;

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        return null;

    }

    @Override
    public List<Inscripcion> listar() {

        List<Inscripcion> lista=new ArrayList<>();

        String sql="SELECT * FROM inscripcion";

        try{

            con=AccesoDB.getConnection();

            ps=con.prepareStatement(sql);

            rs=ps.executeQuery();

            EstudianteDAO estudianteDAO=new EstudianteDAOImpl();

            CursoDAO cursoDAO=new CursoDAOImp();

            while(rs.next()){

                Inscripcion inscripcion=new Inscripcion();

                inscripcion.setId(rs.getInt("id"));

                inscripcion.setEstudiante(
                        estudianteDAO.buscarPorId(
                                rs.getInt("estudiante_id")));

                inscripcion.setCurso(
                        cursoDAO.buscar(
                                rs.getInt("curso_id")));

                inscripcion.setFechaInscripcion(
                        rs.getDate("fecha_inscripcion"));

                lista.add(inscripcion);

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        return lista;

    }
}
