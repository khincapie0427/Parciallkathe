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

// clase CamionCoMasDeDosEjes hereda de Vehiculo
public class CamionCoMasDeDosEjes extends Vehiiculos {
    
    // constructor vacio
    public CamionCoMasDeDosEjes() {
    }
// constructor atributos heredados de Vehiculo

    public CamionCoMasDeDosEjes (String placa, String marca) {
        super("Camionconmasdedosejes", placa, marca, 35000);
    } 
    
}
