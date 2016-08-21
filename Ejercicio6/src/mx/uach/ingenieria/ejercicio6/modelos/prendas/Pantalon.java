/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio6.modelos.prendas;

import mx.uach.ingenieria.ejercicio6.interfaces.IVestir;
import mx.uach.ingenieria.ejercicio6.modelos.Ropa;

/**
 *
 * @author Daniela Santillanes Castro
 * @since 1.0
 */
public class Pantalon extends Ropa implements IVestir{

    @Override
    public String cubrir() {
        return "piernas";
    }
    
}
