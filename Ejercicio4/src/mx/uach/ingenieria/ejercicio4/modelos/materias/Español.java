/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio4.modelos.materias;

import mx.uach.ingenieria.ejercicio4.interfaces.IEnseñar;
import mx.uach.ingenieria.ejercicio4.modelos.Materia;

/**
 *
 * @author Daniela Santillanes Castro
 * @since 1.0
 */
public class Español extends Materia implements IEnseñar{

    @Override
    public String enseña() {
        return "Gramatica";
    }
    
}
