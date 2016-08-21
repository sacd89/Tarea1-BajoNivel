/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio6.unit;

import java.util.ArrayList;
import java.util.List;
import mx.uach.ingenieria.ejercicio6.interfaces.IVestir;
import mx.uach.ingenieria.ejercicio6.modelos.prendas.Cachucha;
import mx.uach.ingenieria.ejercicio6.modelos.prendas.Calcetin;
import mx.uach.ingenieria.ejercicio6.modelos.prendas.Chamarra;
import mx.uach.ingenieria.ejercicio6.modelos.prendas.Pantalon;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class CubrirUnitTest {
    
    @Test
    public void instanciasTest() {
        IVestir c = new Cachucha();
        IVestir ca = new Calcetin();
        IVestir ch = new Chamarra();
        IVestir p = new Pantalon();
        
        List<IVestir> cubrir = new ArrayList<>();
        cubrir.add(c);
        cubrir.add(ca);
        cubrir.add(ch);
        cubrir.add(p);
        
        for(IVestir cubrirse : cubrir){
            System.out.println(cubrirse.cubrir());
        }
        
        
        assertNotSame(c.cubrir(), p.cubrir());
        assertNotSame(ca.cubrir(), ch.cubrir());
        assertNotSame(ch.cubrir(), ca.cubrir());
        assertNotSame(p.cubrir(), c.cubrir());
    }
}
