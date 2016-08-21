/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio7.modelos.planetas;

import mx.uach.ingenieria.ejercicio7.interfaces.ITraslacion;
import mx.uach.ingenieria.ejercicio7.modelos.Planeta;

/**
 *
 * @author Daniela Santillanes Castro
 * @since 1.0
 */
public class Mercurio extends Planeta implements ITraslacion{

    @Override
    public String diasTraslacion() {
        return "87 días y 23 horas terrestres";
    }
    
}
