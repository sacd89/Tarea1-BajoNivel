/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio1.unit;

import java.util.ArrayList;
import java.util.List;
import mx.uach.ingenieria.ejercicio1.interfaces.IArrancar;
import mx.uach.ingenieria.ejercicio1.modelos.transportes.Bicicleta;
import mx.uach.ingenieria.ejercicio1.modelos.transportes.BicicletaElectrica;
import mx.uach.ingenieria.ejercicio1.modelos.transportes.Camion;
import mx.uach.ingenieria.ejercicio1.modelos.transportes.CarroAutomatico;
import mx.uach.ingenieria.ejercicio1.modelos.transportes.Trailer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class ArrancarUnitTest {
    
    @Test
    public void instanciasTest() {
        IArrancar b = new BicicletaElectrica();
        IArrancar c = new Camion();
        IArrancar ca = new CarroAutomatico();
        IArrancar t = new Trailer();
        
        List<IArrancar> arranques = new ArrayList<>();
        arranques.add(b);
        arranques.add(c);
        arranques.add(ca);
        arranques.add(t);
        
        for(IArrancar arranque : arranques){
            System.out.println(arranque.arranque());
        }
        
        
        assertNotSame(b.arranque(), c.arranque());
        assertNotSame(c.arranque(), ca.arranque());
        assertNotSame(ca.arranque(), t.arranque());
        assertNotSame(t.arranque(), b.arranque());
    }
}
