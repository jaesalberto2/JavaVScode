package ExamenOOPFinal;

import javax.swing.JOptionPane;

public class IngresaPoli {
    FicheroPoli fp = new FicheroPoli();
    String nombre, tamano, especie, garras, vista;
    double peso;
    int edad, longevidad;
    public void ingresaAguila(){
        nombre=JOptionPane.showInputDialog(null,"Ingresa Nombre","Aguila",
			JOptionPane.INFORMATION_MESSAGE);
        peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa Peso","Aguila",
        JOptionPane.INFORMATION_MESSAGE));
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Edad","Aguila",
        JOptionPane.INFORMATION_MESSAGE));
        tamano=JOptionPane.showInputDialog(null,"Ingresa Size","Aguila",
        JOptionPane.INFORMATION_MESSAGE);
        especie=JOptionPane.showInputDialog(null,"Ingresa Especie","Aguila",
        JOptionPane.INFORMATION_MESSAGE);
        garras=JOptionPane.showInputDialog(null,"Ingresa Garras","Aguila",
        JOptionPane.INFORMATION_MESSAGE);
        vista=JOptionPane.showInputDialog(null,"Ingresa Vista","Aguila",
        JOptionPane.INFORMATION_MESSAGE);
        AnimalPoli aguila = new AguilaPoli(nombre, peso, edad, tamano, especie, garras, vista);
        fp.ingresaAguila((AguilaPoli)aguila);
    }
    public void ingresaTortuga(){
        nombre=JOptionPane.showInputDialog(null,"Ingresa Nombre","Tortuga",
			JOptionPane.INFORMATION_MESSAGE);
        peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa Peso","Tortuga",
        JOptionPane.INFORMATION_MESSAGE));
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Edad","Tortuga",
        JOptionPane.INFORMATION_MESSAGE));
        tamano=JOptionPane.showInputDialog(null,"Ingresa Size","Tortuga",
        JOptionPane.INFORMATION_MESSAGE);
        especie=JOptionPane.showInputDialog(null,"Ingresa Especie","Tortuga",
        JOptionPane.INFORMATION_MESSAGE);
        longevidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Longevidad","Tortuga",
        JOptionPane.INFORMATION_MESSAGE));
        AnimalPoli tortuga = new TortugaPoli(nombre, peso, edad, tamano, especie, longevidad);
        fp.ingresaTortuga((TortugaPoli)tortuga);
    }

    
}
