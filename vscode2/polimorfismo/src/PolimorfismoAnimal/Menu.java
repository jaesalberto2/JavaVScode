package PolimorfismoAnimal;

import javax.swing.JOptionPane;

public class Menu {
    public void menu(){
		Ingresa i = new Ingresa();
        	//Menu
	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-Canino\n2.-Salir","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1: i.ingresaCanino();
		
		break;
    case 2:System.exit(0);
		
		break;

	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=0);//Remplazar
    }

    
    
}
