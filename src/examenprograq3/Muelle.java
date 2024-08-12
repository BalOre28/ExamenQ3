/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprograq3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Balto
 */
public class Muelle {
    //la clase main
    private ArrayList<Barco> barcos;
    
    public Muelle(){
        barcos=new ArrayList<>();
    }
    
    public void agregarBarcos(String tipo,String nombre){
        if(buscarBarco(nombre)!=null){
            
        }
    }
    
    
}//final de la clase muelle para no confundir con las llaves
