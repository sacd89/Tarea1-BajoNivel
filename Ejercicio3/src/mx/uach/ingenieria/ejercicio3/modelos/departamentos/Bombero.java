/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio3.modelos.departamentos;

import mx.uach.ingenieria.ejercicio3.interfaces.IAyudaDpto;
import mx.uach.ingenieria.ejercicio3.modelos.DepartamentoEmergencia;

/**
 *
 * @author Daniela Santillanes Castro
 * @since 1.0
 */
public class Bombero extends DepartamentoEmergencia implements IAyudaDpto {

    @Override
    public String ayudaGente() {
        return "Fuego";
    }
    
}
