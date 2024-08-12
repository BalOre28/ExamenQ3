/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprograq3;

import java.util.Date;

/**
 *
 * @author Balto
 */
abstract class Barco {
    private String nombre;
    private Date fechaDeCirculacion;

    //constructor
    public Barco(String nombre) {
        this.nombre = nombre;
        this.fechaDeCirculacion = new Date();
    }

    public final String getNombre() {
        return this.nombre;
    }

    public final Date getFechaDeCirculacion() {
        return this.fechaDeCirculacion;
    }
    
    public String toString() {
        return this.nombre;
    }

    public abstract void agregarElemento();//agregar cualquier tipo de elemento para los barcos

    public abstract double vaciarCobrar();// vaciar todos los barcos y hacer los cobors

    public abstract double precioElemento();//precio de los diferentes elementos
}//fin de la clase barco
