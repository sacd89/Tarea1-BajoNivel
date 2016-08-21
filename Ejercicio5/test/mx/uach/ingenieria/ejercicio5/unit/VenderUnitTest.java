/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio5.unit;

import java.util.ArrayList;
import java.util.List;
import mx.uach.ingenieria.ejercicio5.interfaces.IVender;
import mx.uach.ingenieria.ejercicio5.modelos.departamentos.Deporte;
import mx.uach.ingenieria.ejercicio5.modelos.departamentos.Jugueteria;
import mx.uach.ingenieria.ejercicio5.modelos.departamentos.Television;
import mx.uach.ingenieria.ejercicio5.modelos.departamentos.Zapateria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class VenderUnitTest {
    
    @Test
    public void instanciasTest() {
        IVender d = new Deporte();
        IVender t = new Television();
        IVender j = new Jugueteria();
        IVender z = new Zapateria();
        
        List<IVender> ventas = new ArrayList<>();
        ventas.add(d);
        ventas.add(t);
        ventas.add(j);
        ventas.add(z);
        
        for(IVender venta : ventas){
            System.out.println(venta.vender());
        }
        
        
        assertNotSame(d.vender(), z.vender());
        assertNotSame(t.vender(), j.vender());
        assertNotSame(j.vender(), t.vender());
        assertNotSame(z.vender(), d.vender());
    }
}
