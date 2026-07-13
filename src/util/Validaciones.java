/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author USUARIO
 */
public class Validaciones {
    
    public static boolean validarCorreo(String correo){

        return correo != null
                && correo.contains("@")
                && correo.contains(".");

    }

    public static boolean validarNota(double nota){

        return nota >= Constantes.NOTA_MINIMA
                && nota <= Constantes.NOTA_MAXIMA;

    }

    public static boolean validarTexto(String texto){

        return texto != null
                && !texto.trim().isEmpty();

    }
}
