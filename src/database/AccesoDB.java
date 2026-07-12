/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class AccesoDB {
    public static Connection getConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Connection cn;
        try {
            //cargar el driver en memoria
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            // obtener objto conecion
            String url = "jdbc:mysql://localhost:3307/appUni?useSSL=false&serverTimezone=UTC";
            //String url = "jdbc:oracle:thin:@172.17.2.243:3306:XE"; se cambio el puerto y los driver por el de MySql
            
            cn = DriverManager.getConnection(url, "root", "admin");
            return cn;
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

    }
}
