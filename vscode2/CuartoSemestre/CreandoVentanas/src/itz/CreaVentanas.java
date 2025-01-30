package itz;
import javax.swing.*;

import java.awt.Color;
import java.util.*;



public class CreaVentanas {
    public static void main(String[] args) {

        int nv = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas ventanas quieres crear?"));
       for(int i=0; i<nv; i++){
        //crear nv instancias de la clase JFrame
            JFrame ventana = new JFrame("Ventana "+(i+1));
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setVisible(true);
            ventana.getContentPane().add(new JLabel("Hola, soy la ventana "+(i+1)));
            ventana.getContentPane().setBackground(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
            ventana.setBounds(50*i, 40*i, 300, 300);


        }
        
    }

}

