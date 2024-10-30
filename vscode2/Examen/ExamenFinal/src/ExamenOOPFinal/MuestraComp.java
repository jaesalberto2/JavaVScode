package ExamenOOPFinal;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class MuestraComp {
    JTextArea salida = new JTextArea();      
      String datos = "";
    public void muestra()
    {
        datos="Nombre\tApellido\tEdad\tEmail\t\tMatricula\tModelo\tEmpresa\tRfc\tWWW\n";
        datos+="-----------------------------------------------------------------------------------------------------------------------------\n";
            try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\vehiculoComp.txt"))){
			while(true)
			{
				Vehiculo aux = (Vehiculo)fichero.readObject();
				datos+=aux.chofer.getName() + "\t" + aux.chofer.getApellido() + "\t" + aux.chofer.getEdad()
                + "\t" + aux.chofer.getEmail() + "\t" + aux.getMatricula() + "\t"+ aux.getModelo()+ "\t" 
                + aux.empresa.getName()+ "\t" + aux.empresa.getRfc()+ "\t" +aux.empresa.getWww()+"\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datos);
			JOptionPane.showMessageDialog(null, salida, "Datos Vehiculo", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
    }// fin del metodo     
}// fin de la clase   