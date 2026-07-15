/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import Entity.Curso;
import Entity.CursoVirtual;
import reportes.ImpresionReporte;
import reportes.ImpresoraConsola;
import service.InscripcionService;

/**
 *
 * @author USUARIO
 */
public class VirtualFactory implements UniversidadFactory{

    @Override
    public Curso crearCurso() {
        return new CursoVirtual();
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
