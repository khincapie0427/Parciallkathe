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

// atributos de la clase abtracta vehiculos
public class Vehiiculos {
    
    private String placa;
    private String marca;
    private String tipo;
    private double valorPeaje;
    
// construstor vacio
    
    public Vehiiculos() {
    }
    
//constructor con los atributos de la clase
    
    public Vehiiculos(String placa, String marca, String tipo, double valorPeaje) {
        this.placa = placa;
        this.marca = marca;
        this.valorPeaje = valorPeaje;
        this.tipo = tipo;
    }
    
    //metodo get y set 

    public String getTipo() {
        return placa;
    }

    public void setTipo(String tipo) {
        this.tipo = placa;
    }

  
    
    public String getPlaca() {
        return marca;
    }

    public void setPlaca(String placa) {
        this.placa = marca;
    }

    public String getMarca() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.tipo = marca;
    }

    public double getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(double valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    // Codigo tostring para facilitar la conversion a xml 
    
    @Override
    public String toString() {
        return "{\n" +"\""+ placa + "\""+":{\n \"GEM816\":" + marca + "\","+ "\n \"Chevrolet\":"+  marca + "\","+ "\n \"valor\":" + valorPeaje + "\n }"+"\n}";
    }
}
