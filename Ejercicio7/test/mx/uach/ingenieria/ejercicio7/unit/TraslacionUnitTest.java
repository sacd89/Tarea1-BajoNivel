/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio7.unit;

import java.util.ArrayList;
import java.util.List;
import mx.uach.ingenieria.ejercicio7.interfaces.ITraslacion;
import mx.uach.ingenieria.ejercicio7.modelos.planetas.Marte;
import mx.uach.ingenieria.ejercicio7.modelos.planetas.Mercurio;
import mx.uach.ingenieria.ejercicio7.modelos.planetas.Tierra;
import mx.uach.ingenieria.ejercicio7.modelos.planetas.Venus;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class TraslacionUnitTest {

    @Test
    public void instanciasTest() {
        ITraslacion ma = new Marte();
        ITraslacion me = new Mercurio();
        ITraslacion t = new Tierra();
        ITraslacion v = new Venus();

        List<ITraslacion> traslaciones = new ArrayList<>();
        traslaciones.add(ma);
        traslaciones.add(me);
        traslaciones.add(t);
        traslaciones.add(v);

        for (ITraslacion traslacion : traslaciones) {
            System.out.println(traslacion.diasTraslacion());
        }

        assertNotSame(ma.diasTraslacion(), v.diasTraslacion());
        assertNotSame(me.diasTraslacion(), t.diasTraslacion());
        assertNotSame(t.diasTraslacion(), me.diasTraslacion());
        assertNotSame(v.diasTraslacion(), ma.diasTraslacion());
    }

}
