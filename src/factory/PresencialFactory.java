/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import Entity.Curso;
import Entity.CursoPresencial;
import reportes.ImpresionReporte;
import reportes.ImpresoraConsola;
import service.InscripcionService;

/**
 *
 * @author USUARIO
 */
public class PresencialFactory implements UniversidadFactory{

    @Override
    public Curso crearCurso() {
        return new CursoPresencial();
    }

    @Override
    public InscripcionService crearInscripcionService() {
        return new InscripcionService();
    }

    @Override
    public ImpresionReporte crearImpresion() {
        return new ImpresoraConsola();
    }
    
}
