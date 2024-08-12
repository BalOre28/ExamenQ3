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

public class Muelle {

    private ArrayList<Barco> ListarBarcos;

    public Muelle() {
        ListarBarcos = new ArrayList<>();
    }

    public void agregarBarco(String tipo) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo barco:");
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre inválido.");
            return;
        }
        for (Barco barco : ListarBarcos) {
            if (barco.getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null, "Error: El Nombre del barco ya registrado, por favor ingrese otro nombre");
                return;
            }
        }
        if (tipo.equalsIgnoreCase("PESQUERO")) {
            String tipoPesquero = JOptionPane.showInputDialog("Ingrese el tipo de pesquero (PEQUEÑO/MEDIANO/GRANDE):").toUpperCase();
            TipoPesquero tipoBarcoPesquero;
            try {
                tipoBarcoPesquero = TipoPesquero.valueOf(tipoPesquero);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Tipo de pesquero inválido.");
                return;
            }
            BarcoPesquero nuevoBarcopesquero = new BarcoPesquero(tipoBarcoPesquero);
            ListarBarcos.add(nuevoBarcopesquero);
            JOptionPane.showMessageDialog(null, "Barco pesquero agregado correctamente.");
        } else if (tipo.equalsIgnoreCase("PASAJERO")) {
            int capacidadMaxima;
            double precioBoleto;
            try {
                capacidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad máxima del barco de pasajeros:"));
                precioBoleto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del boleto:"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Capacidad o precio inválido.");
                return;
            }
            BarcoPasajero nuevoBarcopasajero = new BarcoPasajero(capacidadMaxima, precioBoleto);
            ListarBarcos.add(nuevoBarcopasajero);
            JOptionPane.showMessageDialog(null, "Barco de pasajeros agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de barco inválido.");
        }
    }

    public static void main(String[] args) {
        Muelle muelle = new Muelle();
        JFrame frame = new JFrame("Muelle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, muelle);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel, Muelle muelle) {
        panel.setLayout(null);

        JButton agregarBarcoButton = new JButton("Agregar Barco");
        agregarBarcoButton.setBounds(10, 20, 150, 25);
        panel.add(agregarBarcoButton);
        agregarBarcoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tipo = JOptionPane.showInputDialog("Ingrese el tipo de barco (PESQUERO/PASAJERO): ");
                muelle.agregarBarco(tipo);
            }
        });
        
        JButton agregarElementoButton = new JButton("Agregar Elemento");
        agregarElementoButton.setBounds(10, 60, 150, 25);
        panel.add(agregarElementoButton);
        agregarElementoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del barco: ");
                String elemento = JOptionPane.showInputDialog("Ingrese el elemento a agregar: ");
                muelle.agregarElemento(nombre, elemento);
            }
        });

        JButton vaciarBarcoButton = new JButton("Vaciar Barco");
        vaciarBarcoButton.setBounds(10, 100, 150, 25);
        panel.add(vaciarBarcoButton);
        vaciarBarcoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del barco:");
                double total = muelle.vaciarBarco(nombre);
                JOptionPane.showMessageDialog(null, "Total generado: " + total);
            }
        });

        JButton barcosDesdeButton = new JButton("Barcos Desde Año");
        barcosDesdeButton.setBounds(10, 140, 150, 25);
        panel.add(barcosDesdeButton);
        barcosDesdeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));
                muelle.barcosDesde(year);
            }
        });
        
    }
}
