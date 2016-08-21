/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio3.unit;

import java.util.ArrayList;
import java.util.List;
import mx.uach.ingenieria.ejercicio3.interfaces.IAyudaDpto;
import mx.uach.ingenieria.ejercicio3.modelos.departamentos.Bombero;
import mx.uach.ingenieria.ejercicio3.modelos.departamentos.Paramedico;
import mx.uach.ingenieria.ejercicio3.modelos.departamentos.PoliciaEstatal;
import mx.uach.ingenieria.ejercicio3.modelos.departamentos.Transito;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class DptoUnitTest {
    
   @Test
    public void instanciasTest() {
        IAyudaDpto b = new Bombero();
        IAyudaDpto pa = new Paramedico();
        IAyudaDpto pe = new PoliciaEstatal();
        IAyudaDpto t = new Transito();
        
        List<IAyudaDpto> dptos = new ArrayList<>();
        dptos.add(b);
        dptos.add(pa);
        dptos.add(pe);
        dptos.add(t);
        
        for(IAyudaDpto dpto : dptos){
            System.out.println(dpto.ayudaGente());
        }
        
        
        assertNotSame(b.ayudaGente(), t.ayudaGente());
        assertNotSame(pa.ayudaGente(), pe.ayudaGente());
        assertNotSame(pe.ayudaGente(), pa.ayudaGente());
        assertNotSame(t.ayudaGente(), b.ayudaGente());
    }
}
