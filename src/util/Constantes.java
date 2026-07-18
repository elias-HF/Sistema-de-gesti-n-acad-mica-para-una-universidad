/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author USUARIO
 */
public class Constantes {
    //base de datos Mysql
    //String url = "jdbc:oracle:thin:@172.17.2.243:3306:XE"; se cambio el puerto y los driver por el de MySql
    public static final String URL =
            "jdbc:mysql://localhost:3307/sistema_Academico?useSSL=false&serverTimezone=UTC";
                                        //cambiar "appEmpresa" por el nombre de la db.              
    // obtener objeto conecion

    public static final String USUARIO =
            "root";

    public static final String PASSWORD =
            "admin";
    
    //Notas
    public static final double NOTA_MINIMA = 0;
    public static final double NOTA_MAXIMA = 20;
}
