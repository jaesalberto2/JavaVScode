package ExamenOOPFinal;

import javax.swing.JOptionPane;

public class IngresaHer {

     String name;
    float peso;
    int edad;
    String alimento;
    String habitat;
    FicheroHer f = new FicheroHer();

    public void ingresaCanino(){
        name = 	JOptionPane.showInputDialog(null,""
		+ "Ingresa Nombre","Canino",JOptionPane.INFORMATION_MESSAGE);
        peso = Float.parseFloat(	JOptionPane.showInputDialog(null,""
		+ "Ingresa Peso","Canino",JOptionPane.INFORMATION_MESSAGE));

        edad = Integer.parseInt(JOptionPane.showInputDialog(null,""
		+ "Ingresa Edad","Canino",JOptionPane.INFORMATION_MESSAGE));

        alimento = JOptionPane.showInputDialog(null,""
		+ "Ingresa Alimento","Canino",JOptionPane.INFORMATION_MESSAGE);

        habitat = JOptionPane.showInputDialog(null,""
		+ "Ingresa Habitat","Canino",JOptionPane.INFORMATION_MESSAGE);
        Canino c = new Canino(name, peso, edad, alimento, habitat);
        f.ingresaCanino(c);

    }
    
}
