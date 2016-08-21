/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio5.modelos.departamentos;

import mx.uach.ingenieria.ejercicio5.interfaces.IVender;
import mx.uach.ingenieria.ejercicio5.modelos.TiendaDepartamental;

/**
 *
 * @author Daniela Santillanes Castro
 * @since 1.0
 */
public class Zapateria extends TiendaDepartamental implements IVender{

    @Override
    public String vender() {
        return "Zapatos";
    }
    
}
