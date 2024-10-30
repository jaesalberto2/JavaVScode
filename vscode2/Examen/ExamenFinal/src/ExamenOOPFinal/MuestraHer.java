package ExamenOOPFinal;


    

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraHer {
	JTextArea salida = new JTextArea();
	String datos="Alimento\tHabitat\tName\tPeso\tEdad\n" ;
	public void muestra()
	{
		datos+="_____________________________________________________\n";
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\caninoHer.txt"))){
			while(true)
			{
				Canino aux = (Canino)fichero.readObject();
				datos+=aux.getAlimento() + "\t" + aux.getHabitat() + "\t" + aux.getName()
                + "\t" + aux.getPeso() + "\t" + aux.getEdad() + "\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datos);
			JOptionPane.showMessageDialog(null, salida, "Datos Canino", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}

        datos="Alimento\tHabitat\tName\tPeso\tEdad\n" ;
		}//Fin del metodo
	}//Fin de la clase

    

