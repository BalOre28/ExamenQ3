/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprograq3;

/**
 *
 * @author Balto
 */
class BarcoPesquero extends Barco {
    private int pecesCapturados;
    private TipoPesquero tipoPesquero;

    //constructor
    public BarcoPesquero(TipoPesquero tipoPesquero) {
        super("BarcoPesquero");
        this.pecesCapturados = 0;
        this.tipoPesquero = tipoPesquero;
    }

    public void agregarElemento() {//la funcion abstract de barco
        pecesCapturados++;
    }

    public double vaciarCobrar() {//la funcion abstract de barco
        double total = pecesCapturados * tipoPesquero.getPrecio();//entregar los peces, hacer el cobro y ponerlos en 0
        pecesCapturados = 0;
        return total;
    }

    public double precioElemento() {//llamando la clase de tipo pesquero para obtener el precio
        return tipoPesquero.getPrecio();
    }

    public String toString() {
        return super.toString() + " - Tipo de Barco: " + tipoPesquero.name() + ", Cantidad de Peces Capturados: " + pecesCapturados;
    }
}//fin de barcopesquero

