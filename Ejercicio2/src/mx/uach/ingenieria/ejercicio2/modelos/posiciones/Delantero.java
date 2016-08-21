/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio2.modelos.posiciones;

import mx.uach.ingenieria.ejercicio2.interfaces.IFutbol;
import mx.uach.ingenieria.ejercicio2.modelos.Futbolista;

/**
 *
 * @author Daniela Santillanes Castro
 * @since 1.0
 */
public abstract class Delantero extends Futbolista implements IFutbol{

    @Override
    public Boolean cobrarFalta() {
        return true;
    }

    @Override
    public Boolean meterGol() {
        return true;
    }
    
}
