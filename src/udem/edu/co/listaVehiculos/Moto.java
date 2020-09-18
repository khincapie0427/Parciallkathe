/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.listaVehiculos;

/**
 *
 * @author Kathe
 */
public class Moto extends Vehiiculos{
    
    // constructor vacio
    public Moto() {
    }

// constructor atributos heredados
    
    public Moto( String placa, String marca) {
        super("Moto", placa, marca, 0);
    }
    
}
