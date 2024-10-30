package Animal;

import javax.swing.JOptionPane;

public class Ingresa {
    Consulta c = new Consulta();
    String habitat="", comida="", edad="", color="";

    String tamaño="", olfato="", manada="";//Lobo

    String sizemanada="", razgosocial="";//americano
    double sizepata=0.0, sizecola=0.0;//ejipcio

    String raza="", size="", pelaje="", dueño="";//Perro
    String agresivo="", inteligencia="";//chihuahua
    String fidelidad="", resistencia="";//Aleman

    Fichero f = new Fichero();





    public void ingresaMascota(){
         habitat= JOptionPane.showInputDialog(null,""
		+ "Ingresa Habitat","Datos Generales",JOptionPane.INFORMATION_MESSAGE);
        comida=		JOptionPane.showInputDialog(null,""
         + "Ingresa Comida","Datos Generales",JOptionPane.INFORMATION_MESSAGE);
        edad=		JOptionPane.showInputDialog(null,""
          + "Ingresa Edad","Datos Generales",JOptionPane.INFORMATION_MESSAGE);
        color=		JOptionPane.showInputDialog(null,""
           + "Ingresa Color","Datos Generales",JOptionPane.INFORMATION_MESSAGE);


    }

    public void ingresaPerro(){

        raza = JOptionPane.showInputDialog(null,""
		+ "Ingresa raza","Informacion Perro",JOptionPane.INFORMATION_MESSAGE);
        size = JOptionPane.showInputDialog(null,""
         + "Ingresa Tamaño","Informacion Perro",JOptionPane.INFORMATION_MESSAGE);
        pelaje = JOptionPane.showInputDialog(null,""
		+ "Ingresa Pelaje","Informacion Perro",JOptionPane.INFORMATION_MESSAGE);
        dueño = JOptionPane.showInputDialog(null,""
         + "Ingresa Dueño","Informacion Perro",JOptionPane.INFORMATION_MESSAGE);
         

    }
    public void ingresaChihuahua(){
        agresivo = JOptionPane.showInputDialog(null,""
		+ " Agresivo","Informacion Chihuahua",JOptionPane.INFORMATION_MESSAGE);
         inteligencia = JOptionPane.showInputDialog(null,""
         + "Ingresa Inteligencia","Informacion Chihuahua",JOptionPane.INFORMATION_MESSAGE);
         Mascota ch = new Chihuahua(habitat, comida, edad, color, raza, size, pelaje, dueño, agresivo, inteligencia);
    f.ingresaChihuahua((Chihuahua)ch);
   
        }
    public void ingresaAleman(){
        fidelidad = JOptionPane.showInputDialog(null,""
		+ "Ingresa Fidelidad","Informacion Aleman",JOptionPane.INFORMATION_MESSAGE);
         resistencia = JOptionPane.showInputDialog(null,""
         + "Ingresa Resistencia","Informacion Aleman",JOptionPane.INFORMATION_MESSAGE);
         Aleman al= new Aleman(habitat, comida, edad, color, raza, size, pelaje, dueño, fidelidad, resistencia);
    f.ingresaAleman((Aleman)al);
    
    
        }
    public void ingresaLobo(){
        tamaño = JOptionPane.showInputDialog(null,""
		+ "Ingresa Tamaño","Informacion Lobo",JOptionPane.INFORMATION_MESSAGE);
        olfato= JOptionPane.showInputDialog(null,""
         + "Ingresa Olfato","Informacion Lobo",JOptionPane.INFORMATION_MESSAGE);
        manada= JOptionPane.showInputDialog(null,""
          + "Ingresa Manada","Informacion Lobo",JOptionPane.INFORMATION_MESSAGE);
          
    }
    public void ingresaAmericano(){

        sizemanada= JOptionPane.showInputDialog(null,""
		+ "Ingresa Tamaño de manada","Informacion Americano",JOptionPane.INFORMATION_MESSAGE);
         razgosocial= JOptionPane.showInputDialog(null,""
         + "Ingresa Razgo social","Informacion Americano",JOptionPane.INFORMATION_MESSAGE);
         Mascota am = new Americano(habitat, comida, edad, color, tamaño, olfato, manada, sizemanada, razgosocial);
        f.ingresaAmericano((Americano)am);
        
    }
    public void ingresaEjipcio(){
        sizepata=Double.parseDouble( JOptionPane.showInputDialog(null,""
        + "Ingresa Tamaño de pata","Informacion Ejipcio",JOptionPane.INFORMATION_MESSAGE));
        
         sizecola=Double.parseDouble(JOptionPane.showInputDialog(null,""
         + "Ingresa Tamaño de cola","Informacion Ejipcio",JOptionPane.INFORMATION_MESSAGE));

         Mascota ej = new Ejipcio(habitat, comida, edad, color, tamaño, olfato, manada, sizepata, sizecola);
    f.ingresaEjipcio((Ejipcio)ej);
   
        }


    
}
