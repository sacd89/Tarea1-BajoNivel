/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio1.modelos.transportes;

import mx.uach.ingenieria.ejercicio1.interfaces.IArrancar;
import mx.uach.ingenieria.ejercicio1.modelos.Transporte;

/**
 *
 * @author Daniela Santillanes Castro
 * @since 1.0
 */
public class CarroAutomatico extends Transporte implements IArrancar{

    @Override
    public String arranque() {
        return "Automatico";
    }
    
}
