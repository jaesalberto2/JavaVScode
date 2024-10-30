package Animal;

import javax.swing.JOptionPane;

public class Menu {
	Consulta c = new Consulta();
    Ingresa i = new Ingresa();

public void menu1(){
		//Menu
		int opc;
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
		+ "1.-Ingresa\n2.-Muestra\n3.-Salir","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
		
		switch (opc) {
		case 1:menu();
			
			break;
		case 2:menuI();
			
			break;
		case 3:System.exit(0);
			
			break;
	
		default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
				+ "","Error",JOptionPane.ERROR_MESSAGE);
			break;
		}
		
		}while(opc!=0);//Remplazar
}

    public void menu(){

        	//Menu
	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-Perro\n2.-Lobo\n3.-Regresar","Menu Ingresa",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:menuperro();
		
		break;

    case 2:menuLobo();
		
		break;

    case 3:menu1();
		
		


	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=3);//Remplazar
    }
    public void menuperro(){
        	//Menu
	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-chihuahua\n2.-Aleman\n3.-Regresar a menu anterior","Menu Perro",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:
    { 
        i.ingresaMascota();
        i.ingresaPerro();
        i.ingresaChihuahua();   
    }
		break;
    case 2:
    { 
        i.ingresaMascota();
        i.ingresaPerro();
        i.ingresaAleman(); 
    }
		
		break;
    case 3: menu();
		
		break;

	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=3);//Remplazar
    }

    public void menuLobo(){
        	//Menu
	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-Americano\n2.-Ejipcio\n3.-Regresar a menu principal","Menu Lobo",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:    { 
        i.ingresaMascota();
        i.ingresaLobo();
        i.ingresaAmericano();
		
    }
		
		break;
    case 2:    { 
        i.ingresaMascota();
        i.ingresaLobo();
        i.ingresaEjipcio();
    }
		
		break;
    case 3: menu();
		
		break;

	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=3);//Remplazar
    }






	public void menuI(){

		//Menu
int opc;
do {
opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
+ "1.-Perro\n2.-Lobo\n3.-Regresar","Menu Ingresa",JOptionPane.INFORMATION_MESSAGE));

switch (opc) {
case 1:menuIperro();
	
	break;

case 2:menuILobo();
	
	break;

case 3: System.exit(0);
	
	


default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
		+ "","Error",JOptionPane.ERROR_MESSAGE);
	break;
}

}while(opc!=3);//Remplazar
}
public void menuIperro(){
		//Menu
int opc;
do {
opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
+ "1.-chihuahua\n2.-Aleman\n3.-Regresar a menu anterior","Menu Consulta Perro",JOptionPane.INFORMATION_MESSAGE));

switch (opc) {
case 1:
{ 
	c.consultaChihuahua();
}
	break;
case 2:
{ 
	c.consultaAleman();
}
	
	break;
case 3: menuI();
	
	break;

default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
		+ "","Error",JOptionPane.ERROR_MESSAGE);
	break;
}

}while(opc!=3);//Remplazar
}

public void menuILobo(){
		//Menu
int opc;
do {
opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
+ "1.-Americano\n2.-Ejipcio\n3.-Regresar a menu principal","Menu Consulta Lobo",JOptionPane.INFORMATION_MESSAGE));

switch (opc) {
case 1:    { 
	c.consultaAmericano();
	
}
	
	break;
case 2:    { 
	c.consultaEjipcio();
}
	
	break;
case 3: menuI();
	
	break;

default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
		+ "","Error",JOptionPane.ERROR_MESSAGE);
	break;
}

}while(opc!=3);//Remplazar
}


}
