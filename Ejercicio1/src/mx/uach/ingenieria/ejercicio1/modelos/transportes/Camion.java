
package mx.uach.ingenieria.ejercicio1.modelos.transportes;

import mx.uach.ingenieria.ejercicio1.interfaces.IArrancar;
import mx.uach.ingenieria.ejercicio1.modelos.Transporte;

/**
 *
 * @author Daniela Santillanes Castro
 * @since 1.0
 */
public class Camion extends Transporte implements IArrancar{

    @Override
    public String arranque() {
        return "Manual";
    }
    
}
