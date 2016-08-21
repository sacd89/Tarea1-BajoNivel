/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio2.unit;

import java.util.ArrayList;
import java.util.List;
import mx.uach.ingenieria.ejercicio2.interfaces.IFutbol;
import mx.uach.ingenieria.ejercicio2.modelos.posiciones.Portero;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class FutbolUnitTest {
    
    @Test
    public void instanciasTest() {
        IFutbol p = new Portero();
        
       System.out.println(p.agarrarConMano());
    }
}
