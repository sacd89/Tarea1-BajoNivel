/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.ingenieria.ejercicio2.modelos;

import java.util.Date;
import mx.uach.ingenieria.ejercicio2.modelos.enums.EEstadoCivil;
import mx.uach.ingenieria.ejercicio2.modelos.enums.EGenero;
import mx.uach.ingenieria.ejercicio2.modelos.enums.EPosicion;

/**
 *
 * @author Daniela Santillanes Castro
 * @since 1.0
 */
public class Futbolista {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private Integer edad;
    private EGenero genero;
    private Float peso;
    private Float altura;
    private EEstadoCivil estadoCivil;
    private EPosicion posicion;
    
}
