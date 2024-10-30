package seleccionFutbol;

import javax.swing.JOptionPane;

public class Menu {

    public void menu(){
        	//Menu
	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:
		
		break;

	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=0);//Remplazar
    }

}
