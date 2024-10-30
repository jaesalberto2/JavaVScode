import javax.swing.JOptionPane;

public class Menu {
    public void menu(){

        Ingresa i= new Ingresa();
        	//Menu

	int opc;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
	+ "1.-Estudiante\n2.-MAestro\n3.-Directivo\n4.-Salir","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
	
	switch (opc) {
	case 1:i.ingresaEstudiante();
		
	    break;
    case 2:
		
	    break;
    case 3:
		
	    break;
    case 4:System.exit(0);
		
		break;

	default:JOptionPane.showMessageDialog(null, "Opcion Incorrecta"
			+ "","Error",JOptionPane.ERROR_MESSAGE);
		break;
	}
	
	}while(opc!=0);//Remplazar
    }
}
