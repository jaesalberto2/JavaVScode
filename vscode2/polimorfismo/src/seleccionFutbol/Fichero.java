package seleccionFutbol;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Fichero {
    public void ingresaEntrenador(Entrenador e) { 
        FileOutputStream fichero=null;
        File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\Entrenador.txt");
        ObjectOutputStream archivo=null;
        try {
            if(arch.exists())
            {
                fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\Entrenador.txt", true);
                archivo = new ObjectOutputStream(fichero) {@Override
                protected void writeStreamHeader() throws IOException
                    {//no hacer nada
                    
                    }
                };
                }//fin del if
            else
            {
                fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\Entrenador.txt");
                archivo = new ObjectOutputStream(fichero);
            }
            archivo.writeObject(e);
            archivo.close();
            JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
        }
    }//fin del metodo Fichero 

    public void ingresaFutbolista(Futbolista f) { 
        FileOutputStream fichero=null;
        File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\Futbolista.txt");
        ObjectOutputStream archivo=null;
        try {
            if(arch.exists())
            {
                fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\Futbolista.txt", true);
                archivo = new ObjectOutputStream(fichero) {@Override
                protected void writeStreamHeader() throws IOException
                    {//no hacer nada
                    
                    }
                };
                }//fin del if
            else
            {
                fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\Futbolista.txt");
                archivo = new ObjectOutputStream(fichero);
            }
            archivo.writeObject(f);
            archivo.close();
            JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
        }
    }//fin del metodo Fichero 

    public void ingresaMasajista(Masajista m) { 
        FileOutputStream fichero=null;
        File arch = new File("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\Masajista.txt");
        ObjectOutputStream archivo=null;
        try {
            if(arch.exists())
            {
                fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\Masajista.txt", true);
                archivo = new ObjectOutputStream(fichero) {@Override
                protected void writeStreamHeader() throws IOException
                    {//no hacer nada
                    
                    }
                };
                }//fin del if
            else
            {
                fichero = new FileOutputStream("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\Masajista.txt");
                archivo = new ObjectOutputStream(fichero);
            }
            archivo.writeObject(m);
            archivo.close();
            JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente","Ingresa Datos",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(),"Error de Archivo",JOptionPane.ERROR_MESSAGE);
        }
    }//fin del metodo Fichero 
    
}
