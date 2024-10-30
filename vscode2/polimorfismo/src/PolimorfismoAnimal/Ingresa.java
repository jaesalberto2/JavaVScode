package PolimorfismoAnimal;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
    String nombre;
    double peso;
    int edad;
    String Habitat;
    String alimento, raza;
    String size;
    JTextArea salida = new JTextArea();
    String datos="Alimento\tNombre\tRaza\tPeso\tEdad\thabitat\n";
    Imprime i = new Imprime();
    public void ingresaCanino(){
        nombre=	JOptionPane.showInputDialog(null,""
		+ "Ingresa Nombre","Canino",JOptionPane.INFORMATION_MESSAGE);
   
        peso=Double.parseDouble(	JOptionPane.showInputDialog(null,""
		+ "Ingresa Peso","Canino",JOptionPane.INFORMATION_MESSAGE));
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,""
		+ "Ingresa Edad","Canino",JOptionPane.INFORMATION_MESSAGE));
        Habitat=	JOptionPane.showInputDialog(null,""
		+ "Ingresa Habitat","Canino",JOptionPane.INFORMATION_MESSAGE);
        alimento=	JOptionPane.showInputDialog(null,""
		+ "Ingresa Alimento","Canino",JOptionPane.INFORMATION_MESSAGE);
        raza=	JOptionPane.showInputDialog(null,""
		+ "Ingresa Raza","Canino",JOptionPane.INFORMATION_MESSAGE);
        size=	JOptionPane.showInputDialog(null,""
		+ "Ingresa Tamaño","Canino",JOptionPane.INFORMATION_MESSAGE);
        
        Animal c = new Canino(nombre, peso, edad, Habitat, alimento, raza, size);
        
        datos+= i.imprime((Canino)c);
        salida.setText(datos);
        JOptionPane.showMessageDialog(null, salida,"Datos del Canino",JOptionPane.INFORMATION_MESSAGE);

    }
}
