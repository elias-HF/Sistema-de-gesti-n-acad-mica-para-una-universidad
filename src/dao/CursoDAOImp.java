
package dao;

import Entity.Curso;
import Entity.CursoBase;
import Entity.CursoHibrido;
import Entity.CursoPresencial;
import Entity.CursoVirtual;
import database.AccesoDB;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class CursoDAOImp implements CursoDAO{
    //se colocaran con sus respectivos procedimientos almacenados
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
   @Override
    public boolean registrar(CursoBase curso) {

        String sql = "INSERT INTO curso(nombre_curso,tipo_curso,costo) VALUES(?,?,?)";

        try{

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, curso.getNombreCurso());
            ps.setString(2, curso.getTipoCurso());
            ps.setDouble(3, curso.getCosto());

            return ps.executeUpdate()>0;

        }catch(Exception e){

            e.printStackTrace();
            return false;

        }

}

    @Override
    public boolean actualizar(CursoBase curso) {

        String sql = "UPDATE curso SET nombre_curso=?, tipo_curso=?, costo=? WHERE id=?";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, curso.getNombreCurso());
            ps.setString(2, curso.getTipoCurso());
            ps.setDouble(3, curso.getCosto());
            ps.setInt(4, curso.getId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;

        }

    }

    @Override
    public boolean eliminar(int id) {

        String sql = "DELETE FROM curso WHERE id=?";

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
    public CursoBase buscar(int id) {

        String sql = "SELECT * FROM curso WHERE id=?";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {

                String tipo = rs.getString("tipo_curso");

                CursoBase curso;

                switch (tipo) {
                    case "Presencial":
                        curso = new CursoPresencial();
                        break;
                    case "Virtual":
                        curso = new CursoVirtual();
                        break;
                    case "Hibrido":
                        curso = new CursoHibrido();
                        break;
                    default:
                        return null;
                }

                curso.setId(rs.getInt("id"));
                curso.setNombreCurso(rs.getString("nombre_curso"));
                curso.setTipoCurso(tipo);
                curso.setCosto(rs.getDouble("costo"));

                return curso;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<CursoBase> listar() {

        List<CursoBase> lista = new ArrayList<>();

        String sql = "SELECT * FROM curso";

        try {

            con = AccesoDB.getConnection();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                String tipo = rs.getString("tipo_curso");

                CursoBase curso;

                switch (tipo) {
                    case "Presencial":
                        curso = new CursoPresencial();
                        break;
                    case "Virtual":
                        curso = new CursoVirtual();
                        break;
                    case "Hibrido":
                        curso = new CursoHibrido();
                        break;
                    default:
                        continue;
                }

                curso.setId(rs.getInt("id"));
                curso.setNombreCurso(rs.getString("nombre_curso"));
                curso.setTipoCurso(tipo);
                curso.setCosto(rs.getDouble("costo"));

                lista.add(curso);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    
}
