/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.Vehiculos;

import java.util.ArrayList;
import udem.edu.co.listaVehiculos.Automovil;
import udem.edu.co.listaVehiculos.CamionCoMasDeDosEjes;
import udem.edu.co.listaVehiculos.CamionConUnEje;
import udem.edu.co.listaVehiculos.Moto;
import udem.edu.co.listaVehiculos.Vehiiculos;

/**
 *
 * @author Kathe
 */
public class Parcialkathe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //clase principal donde estaras el arrelo json
        
      ArrayList<Vehiiculos> vehiculos= new ArrayList<>();
        vehiculos.add (new Automovil("MMM321","chevrolet"));
        vehiculos.add(new Moto("GTE45K","yamaha"));
        vehiculos.add(new CamionCoMasDeDosEjes("UUU112","nissan"));
        vehiculos.add(new CamionConUnEje("LKJ345","toyota"));
        
        //Imprimo xml
        
        System.out.println(vehiculos);
        System.out.println("En xml un vehiculos");
        System.out.println("<vehiculos>\n" +
"	<Placa = GEM616 Marca = Chevrolet Peaje = 10.000 ></Automovil>\n" +   
"</automovil>");  
        
    
    }
    
}
