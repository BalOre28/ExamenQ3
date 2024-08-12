/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprograq3;

/**
 *
 * @author Balto
 */
public enum TipoPesquero {
    //la clase enum
    PEZ(200),CAMARON(300),LANGOSTA(500);//precio de las capturas
    
    private final double precio;
    TipoPesquero(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {//para optener el precio por las capturas
        return precio;
    }
}//fin de la clase tipoPesquero

