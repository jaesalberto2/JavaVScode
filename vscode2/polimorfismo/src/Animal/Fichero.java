package Animal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Fichero {
    public void ingresaAmericano(Americano am) { 
		FileOutputStream fichero=null;
		File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\americano.txt");
		ObjectOutputStream archivo=null;
		try {
			if(arch.exists())
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\americano.txt", true);
				archivo = new ObjectOutputStream(fichero) {@Override
				protected void writeStreamHeader() throws IOException
					{//no hacer nada
					
					}
				};
				}//fin del if
			else
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\americano.txt");
				archivo = new ObjectOutputStream(fichero);
			}
			archivo.writeObject(am);
			archivo.close();
			JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}//fin del metodo

    public void ingresaEjipcio(Ejipcio am) { 
		FileOutputStream fichero=null;
		File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\ejipcio.txt");
		ObjectOutputStream archivo=null;
		try {
			if(arch.exists())
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\ejipcio.txt", true);
				archivo = new ObjectOutputStream(fichero) {@Override
				protected void writeStreamHeader() throws IOException
					{//no hacer nada
					
					}
				};
				}//fin del if
			else
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\ejipcio.txt");
				archivo = new ObjectOutputStream(fichero);
			}
			archivo.writeObject(am);
			archivo.close();
			JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}//fin del metodo

    public void ingresaChihuahua(Chihuahua am) { 
		FileOutputStream fichero=null;
		File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\chihuahua.txt");
		ObjectOutputStream archivo=null;
		try {
			if(arch.exists())
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\chihuahua.txt", true);
				archivo = new ObjectOutputStream(fichero) {@Override
				protected void writeStreamHeader() throws IOException
					{//no hacer nada
					
					}
				};
				}//fin del if
			else
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\chihuahua.txt");
				archivo = new ObjectOutputStream(fichero);
			}
			archivo.writeObject(am);
			archivo.close();
			JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}//fin del metodo

    public void ingresaAleman(Aleman am) { 
		FileOutputStream fichero=null;
		File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\aleman.txt");
		ObjectOutputStream archivo=null;
		try {
			if(arch.exists())
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\aleman.txt", true);
				archivo = new ObjectOutputStream(fichero) {@Override
				protected void writeStreamHeader() throws IOException
					{//no hacer nada
					
					}
				};
				}//fin del if
			else
			{
				fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\aleman.txt");
				archivo = new ObjectOutputStream(fichero);
			}
			archivo.writeObject(am);
			archivo.close();
			JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(IOException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
		}
	}//fin del metodo
    
    
}
