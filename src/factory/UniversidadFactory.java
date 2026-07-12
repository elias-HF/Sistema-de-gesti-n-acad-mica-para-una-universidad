/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import Entity.Curso;
import reportes.ImpresionReporte;
import service.InscripcionService;

/**
 *
 * @author USUARIO
 */
public interface UniversidadFactory {
    Curso crearCurso();
    InscripcionService crearInscripcionService();
    ImpresionReporte crearImpresion();
}
