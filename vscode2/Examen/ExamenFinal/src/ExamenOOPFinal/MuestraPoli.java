package ExamenOOPFinal;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraPoli {
    JTextArea salida = new JTextArea();
    String datos ="Nombre\tPeso\tEdad\tSize\tEspecie\tGarras\tVista\n_____________________________________________________________________________________\n";
    public void muestraAguila()
    {
         try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/aguilapoli.txt"))){
			while(true)
			{
				AguilaPoli ap = (AguilaPoli)fichero.readObject();
				datos+=ap.getNombre()+"\t"+ap.getPeso()+"\t"+ap.getEdad()+"\t"+ap.getTamano()+"\t"+ap.getEspecie()+"\t"+ap.getGarras()+
				"\t"+ap.getVista()+"\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datos);
			JOptionPane.showMessageDialog(null, salida, "Datos Aguila", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
        datos="Nombre\tPeso\tEdad\tSize\tEspecie\tGarras\tVista\n_________________________________________________________________________________________\n";
    }
    String datos2="Nombre\tPeso\tEdad\tSize\tEspecie\tLongevidad\n________________________________________________________________________________________\n";
    public void muestraTortuga(){
        try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
        ("C:/Users/ALBERTO/Documents/herramientas/eclipse3/archivos/tortugapoli.txt"))){
    while(true)
    {
        TortugaPoli tp = (TortugaPoli)fichero.readObject();
        datos2+=tp.getNombre()+"\t"+tp.getPeso()+"\t"+tp.getEdad()+"\t"+tp.getTamano()+"\t"+tp.getEspecie()+"\t"+tp.getLongevidad()+"\n";
    }//fin del while
}catch(ClassNotFoundException exc) {
    JOptionPane.showMessageDialog(null, "ERROR!!!");
}catch(EOFException exc) {
    salida.setText(datos2);
    JOptionPane.showMessageDialog(null, salida, "Datos Tortuga", JOptionPane.INFORMATION_MESSAGE);
}catch (IOException exc) {
    JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
            "ERROR!!!",JOptionPane.ERROR_MESSAGE);
}
datos2="Nombre\tPeso\tEdad\tSize\tEspecie\tLongevidad\n___________________________________________________________________________________________________\n";
    }
}
