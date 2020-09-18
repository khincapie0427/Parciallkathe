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

// clase CamionConUnEje hereda de vehiculo
public class CamionConUnEje extends Vehiiculos {
    
// constructor vacio
    public CamionConUnEje() {
    }
    
// constructor atributos heredados por vehiculo
    
    public CamionConUnEje ( String placa, String marca) {
        super("Camionconuneje", placa, marca, 30000);
    }
    
    
}
