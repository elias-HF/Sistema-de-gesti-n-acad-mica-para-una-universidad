
package dao;

import Entity.Calificacion;
import Entity.Inscripcion;
import database.AccesoDB;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author USUARIO
 */
public class CalificacionDAOImpl implements CalificacionDAO{
        private Connection con;
        private PreparedStatement ps;
        private ResultSet rs;

        @Override
        public boolean registrar(Calificacion calificacion) {

            String sql = "INSERT INTO calificacion(inscripcion_id,nota) VALUES(?,?)";

            try {

                con = AccesoDB.getConnection();
                ps = con.prepareStatement(sql);

                ps.setInt(1, calificacion.getInscripcion().getId());
                ps.setDouble(2, calificacion.getNota());

                return ps.executeUpdate() > 0;

            } catch (Exception e) {

                e.printStackTrace();

            }

            return false;
        }

        @Override
        public boolean actualizar(Calificacion calificacion) {

            String sql = "UPDATE calificacion SET inscripcion_id=?, nota=? WHERE id=?";

            try {

                con = AccesoDB.getConnection();
                ps = con.prepareStatement(sql);

                ps.setInt(1, calificacion.getInscripcion().getId());
                ps.setDouble(2, calificacion.getNota());
                ps.setInt(3, calificacion.getId());

                return ps.executeUpdate() > 0;

            } catch (Exception e) {

                e.printStackTrace();

            }

            return false;
        }

        @Override
        public boolean eliminar(int id) {

            String sql = "DELETE FROM calificacion WHERE id=?";

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
        public Calificacion buscar(int id) {

            String sql = "SELECT * FROM calificacion WHERE id=?";

            try {

                con = AccesoDB.getConnection();
                ps = con.prepareStatement(sql);

                ps.setInt(1, id);

                rs = ps.executeQuery();

                if (rs.next()) {

                    Calificacion c = new Calificacion();

                    c.setId(rs.getInt("id"));

                    InscripcionDAOImp daoInscripcion = new InscripcionDAOImp();

                    Inscripcion inscripcion =
                            daoInscripcion.buscar(rs.getInt("inscripcion_id"));

                    c.setInscripcion(inscripcion);
                    c.setNota(rs.getDouble("nota"));

                    return c;

                }

            } catch (Exception e) {

                e.printStackTrace();

            }

            return null;
        }

        @Override
        public List<Calificacion> listar() {

            List<Calificacion> lista = new ArrayList<>();

            String sql = "SELECT * FROM calificacion";

            try {

                con = AccesoDB.getConnection();
                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

                while (rs.next()) {

                    Calificacion c = new Calificacion();

                    c.setId(rs.getInt("id"));

                    InscripcionDAOImp daoInscripcion = new InscripcionDAOImp();

                    Inscripcion inscripcion =
                            daoInscripcion.buscar(rs.getInt("inscripcion_id"));

                    c.setInscripcion(inscripcion);

                    c.setNota(rs.getDouble("nota"));

                    lista.add(c);

                }

            } catch (Exception e) {

                e.printStackTrace();

            }

            return lista;
        }
    
}
