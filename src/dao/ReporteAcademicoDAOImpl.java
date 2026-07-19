/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Entity.ReporteAcademico;
import database.AccesoDB;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author USUARIO
 */
public class ReporteAcademicoDAOImpl implements ReporteAcademicoDAO{
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean registrar(ReporteAcademico reporte) {

        String sql="INSERT INTO reporte_academico(calificacion_id,observacion) VALUES(?,?)";

        try{

            con=AccesoDB.getConnection();
            ps=con.prepareStatement(sql);

            ps.setInt(1,reporte.getCalificacion().getId());
            ps.setString(2,reporte.getObservacion());

            return ps.executeUpdate()>0;

        }catch(Exception e){

            e.printStackTrace();

        }

        return false;
    }

    @Override
    public boolean actualizar(ReporteAcademico reporte) {

        String sql="UPDATE reporte_academico SET calificacion_id=?, observacion=? WHERE id=?";

        try{

            con=AccesoDB.getConnection();
            ps=con.prepareStatement(sql);

            ps.setInt(1,reporte.getCalificacion().getId());
            ps.setString(2,reporte.getObservacion());
            ps.setInt(3,reporte.getId());

            return ps.executeUpdate()>0;

        }catch(Exception e){

            e.printStackTrace();

        }

        return false;
    }

    @Override
    public boolean eliminar(int id) {

        String sql="DELETE FROM reporte_academico WHERE id=?";

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
    public ReporteAcademico buscar(int id) {

        String sql="SELECT * FROM reporte_academico WHERE id=?";

        try{

            con=AccesoDB.getConnection();
            ps=con.prepareStatement(sql);

            ps.setInt(1,id);

            rs=ps.executeQuery();

            if(rs.next()){

                CalificacionDAO dao=new CalificacionDAOImpl();

                ReporteAcademico reporte=new ReporteAcademico();

                reporte.setId(rs.getInt("id"));

                reporte.setCalificacion(
                        dao.buscar(rs.getInt("calificacion_id")));

                reporte.setObservacion(
                        rs.getString("observacion"));

                return reporte;

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        return null;

    }

    @Override
    public List<ReporteAcademico> listar() {

        List<ReporteAcademico> lista=new ArrayList<>();

        String sql="SELECT * FROM reporte_academico";

        try{

            con=AccesoDB.getConnection();

            ps=con.prepareStatement(sql);

            rs=ps.executeQuery();

            CalificacionDAO dao=new CalificacionDAOImpl();

            while(rs.next()){

                ReporteAcademico reporte=new ReporteAcademico();

                reporte.setId(rs.getInt("id"));

                reporte.setCalificacion(
                        dao.buscar(rs.getInt("calificacion_id")));

                reporte.setObservacion(
                        rs.getString("observacion"));

                lista.add(reporte);

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        return lista;

    }
}
