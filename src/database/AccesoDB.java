/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import util.Constantes;

/**
 *
 * @author USUARIO
 */
public class AccesoDB {
    public static Connection getConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(

                Constantes.URL,

                Constantes.USUARIO,

                Constantes.PASSWORD);
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

    }
}
