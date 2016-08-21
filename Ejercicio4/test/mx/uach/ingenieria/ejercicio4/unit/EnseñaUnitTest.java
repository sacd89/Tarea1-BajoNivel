/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio4.unit;

import java.util.ArrayList;
import java.util.List;
import mx.uach.ingenieria.ejercicio4.interfaces.IEnseñar;
import mx.uach.ingenieria.ejercicio4.modelos.materias.Español;
import mx.uach.ingenieria.ejercicio4.modelos.materias.HistoriaMexicana;
import mx.uach.ingenieria.ejercicio4.modelos.materias.Informatica;
import mx.uach.ingenieria.ejercicio4.modelos.materias.Matematica;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class EnseñaUnitTest {
    
    @Test
    public void instanciasTest() {
        IEnseñar e = new Español();
        IEnseñar h = new HistoriaMexicana();
        IEnseñar i = new Informatica();
        IEnseñar m = new Matematica();
        
        List<IEnseñar> materias = new ArrayList<>();
        materias.add(e);
        materias.add(h);
        materias.add(i);
        materias.add(m);
        
        for(IEnseñar materia : materias){
            System.out.println(materia.enseña());
        }
        
        
        assertNotSame(e.enseña(), m.enseña());
        assertNotSame(h.enseña(), i.enseña());
        assertNotSame(i.enseña(), h.enseña());
        assertNotSame(m.enseña(), e.enseña());
    }
}
