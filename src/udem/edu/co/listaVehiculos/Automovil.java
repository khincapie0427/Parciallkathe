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

// clase CAutomovil hereda de vehiculo
public class Automovil extends Vehiiculos{
    
// constructor vacio
    
    public Automovil() {
    }
// constructor atributos heredados

    public Automovil(String placa, String marca) {
        super("Automovil", placa, marca, 25000);
    }
}
