package ExamenOOPFinal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class FicheroPoli {

    public void ingresaAguila(AguilaPoli ag){
        FileOutputStream fichero=null;
		File arch = new File("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/aguilapoli.txt");
		ObjectOutputStream archivo=null;
		try {
			if(arch.exists())
			{
				fichero = new FileOutputStream("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/aguilapoli.txt", true);
				archivo = new ObjectOutputStream(fichero) {@Override
				protected void writeStreamHeader() throws IOException
					{//no hacer nada
					
					}
				};
				}//fin del if
			else
			{
				fichero = new FileOutputStream("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/aguilapoli.txt");
				archivo = new ObjectOutputStream(fichero);
			}
			archivo.writeObject(ag);
			archivo.close();
			JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
		}
    }
    public void ingresaTortuga(TortugaPoli to){
        FileOutputStream fichero=null;
		File arch = new File("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/tortugapoli.txt");
		ObjectOutputStream archivo=null;
		try {
			if(arch.exists())
			{
				fichero = new FileOutputStream("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/tortugapoli.txt", true);
				archivo = new ObjectOutputStream(fichero) {@Override
				protected void writeStreamHeader() throws IOException
					{//no hacer nada
					
					}
				};
				}//fin del if
			else
			{
				fichero = new FileOutputStream("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/tortugapoli.txt");
				archivo = new ObjectOutputStream(fichero);
			}
			archivo.writeObject(to);
			archivo.close();
			JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
		}
    }
    
}
