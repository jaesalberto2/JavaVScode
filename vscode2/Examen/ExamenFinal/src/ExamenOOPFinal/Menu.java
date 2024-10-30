package ExamenOOPFinal;

import javax.swing.JOptionPane;

public class Menu {


    //Ingresa y Muestra de  HERENCIA
    IngresaHer iHer = new IngresaHer();
    MuestraHer mHer = new MuestraHer();

	//Ingresa y Muestra de Polimorfismo
	IngresaPoli iPoli = new IngresaPoli();
	MuestraPoli mPoli = new MuestraPoli();

	//Ingresa y Muestra de Composicion
	IngresaComp iComp = new IngresaComp();
	MuestraComp mComp = new MuestraComp();

    //MENU PRINCIPAL
    public void menuPrincipal(){
        	//Menu
	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-Composicion\n2.-Herencia\n3.-Polimorfismo\n4.-Salir","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:menuComposicion();
		
		break;
    case 2:menuHerencia();
		
		break;
    case 3:menuPolimorfismo();
        break;
    case 4: System.exit(0);
		
	

	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=4);//Remplazar

    }
    //MENU hERENCIA
    public void menuHerencia() {
        	
	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-Ingresar Canino \n2.-Muestra Caninos\n3.-Regresar a Menu Principal","Menu Herencia",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:iHer.ingresaCanino();
		
		break;
    case 2:mHer.muestra();
		
		break;
    case 3: menuPrincipal();
		
		break;

	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=3);//Remplazar
        
    }



    //MENU POLIMORFISMO
    public void menuPolimorfismo() {
        int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-Ingresar Aguila\n2.-Ingresar Tortuga\n3.-Mostrar Aguila\n4.-Mostrar Tortuga\n5.-Regresar a Menu Principal","Menu Polimorfismo",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:iPoli.ingresaAguila();
		
		break;
    case 2:iPoli.ingresaTortuga();

		break;
	case 3:mPoli.muestraAguila();

		break;
	case 4:mPoli.muestraTortuga();

		break;
    case 5: menuPrincipal();
		
		break;
	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=5);
        
    }

    //MENU COMPOSICION

    public void menuComposicion() {
        int opc;
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Ingresa Vehiculo\n"+
			"2.-Muestra Vehiculo\n3.-Menu Principal", "Menu Composicion", 
			JOptionPane.INFORMATION_MESSAGE));
			switch(opc) {
				case 1:iComp.ingresaVehiculo();
				break;
				case 2:mComp.muestra();
				break;
				case 3: menuPrincipal();
				break;
				default: JOptionPane.showMessageDialog(null, "Opcion Invalida !!!", "Error !!!",
				 JOptionPane.ERROR_MESSAGE);
			}
		}while(opc!=3);  
    }  
}
