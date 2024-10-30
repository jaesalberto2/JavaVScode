package Animal;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Consulta {

    	JTextArea salida = new JTextArea();
	String datos="Habitat\tTamaño\tSizemanada\tComida\tOlfato\tEdad\tRazgosocial\tManada\tColor\tSalud\n";
	public void consultaAmericano()
	{
	
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\americano.txt"))){
			while(true)
			{
				Americano aux = (Americano)fichero.readObject();
				datos+=aux.getHabitat() + "\t" + aux.getTamaño() + "\t"
                + aux.getSizemanada() + "\t" + aux.getComida() + "\t" + aux.getOlfato() + "\t"
                + aux.getEdad() + "\t" + aux.getRazgosocial() + "\t" + aux.getManada()
                + "\t" + aux.getColor()+"\t"+aux.getManada()+"\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida.setText(datos);
			JOptionPane.showMessageDialog(null, salida, "Datos Mascota", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
        datos="Habitat\tTamaño\tSizemanada\tComida\tOlfato\tEdad\tRazgosocial\tManada\tColor\tSalud\n";
		}//Fin del metodo
        JTextArea salida2 = new JTextArea();
	String datos2="Habitat\tTamano\tSizepata\tComida\tOlfato\tgetSizecola\tEdad\tManada\tColor\tSalud\n";
	
    
    public void consultaEjipcio()
	{
		
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
				("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\ejipcio.txt"))){
			while(true)
			{
				Ejipcio aux = (Ejipcio)fichero.readObject();
				datos2+=aux.getHabitat() + "\t" + aux.getTamaño() + "\t"
                + aux.getSizepata() + "\t" + aux.getComida() + "\t" + aux.getOlfato() + "\t"
                + aux.getSizecola() + "\t" + aux.getEdad() + "\t" + aux.getManada() + "\t"
                + aux.getColor() +"\t"+ aux.getOlfato()+"\n";
			}//fin del while
		}catch(ClassNotFoundException exc) {
			JOptionPane.showMessageDialog(null, "ERROR!!!");
		}catch(EOFException exc) {
			salida2.setText(datos2);
			JOptionPane.showMessageDialog(null, salida2, "Datos Mascota", JOptionPane.INFORMATION_MESSAGE);
		}catch (IOException exc) {
			JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
					"ERROR!!!",JOptionPane.ERROR_MESSAGE);
		}
        datos2="Habitat\tTamano\tSizepata\tComida\tOlfato\tgetSizecola\tEdad\tManada\tColor\tSalud\n";
	
		}//Fin del metodo



        JTextArea salida3 = new JTextArea();
        String datos3="Habitat\tRaza\tAgresivo\tComida\tSize\tInteligencia\tEdad\tPelaje\tColor\tDueño\n";
        
        
        public void consultaChihuahua()
        {
            
            try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
                    ("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\chihuahua.txt"))){
                while(true)
                {
                    Chihuahua aux = (Chihuahua)fichero.readObject();
                    datos3+=aux.getHabitat() + "\t" + aux.getRaza() + "\t"
                    + aux.getAgresivo() + "\t" + aux.getComida() + "\t" + aux.getSize() + "\t"
                    + aux.getInteligencia() + "\t" + aux.getEdad() + "\t" + aux.getPelaje() + "\t"
                    + aux.getColor() + "\t" + aux.getDueño()+aux.getInteligencia()+"\n";
                }//fin del while
            }catch(ClassNotFoundException exc) {
                JOptionPane.showMessageDialog(null, "ERROR!!!");
            }catch(EOFException exc) {
                salida3.setText(datos3);
                JOptionPane.showMessageDialog(null, salida3, "Datos Mascota", JOptionPane.INFORMATION_MESSAGE);
            }catch (IOException exc) {
                JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
                        "ERROR!!!",JOptionPane.ERROR_MESSAGE);
            }
            datos3="Habitat\tRaza\tAgresivo\tComida\tSize\tInteligencia\tEdad\tPelaje\tColor\tDueño\n";
        
            }//Fin del metodo



            JTextArea salida4 = new JTextArea();
            String datos4="Habitat\tRaza\tAgresivo\tComida\tSize\tInteligencia\tEdad\tPelaje\tColor\tDueño\n";
            
            
            public void consultaAleman()
            {
                datos4+="___________________\n";
                try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream
                        ("C:\\Users\\ALBERTO\\Documents\\herramientas\\eclipse3\\archivos\\aleman.txt"))){
                    while(true)
                    {
                        Aleman aux = (Aleman)fichero.readObject();
                        datos4+=aux.getHabitat() + "\t" + aux.getRaza() + "\t"
                        + aux.getFidelidad() + "\t" + aux.getComida() + "\t" + aux.getSize() + "\t"
                        + aux.getResistencia() + "\t" + aux.getEdad() + "\t" + aux.getPelaje() + "\t"
                        + aux.getColor() + "\t" + aux.getDueño()+aux.getFidelidad()+"\n";
                    }//fin del while
                }catch(ClassNotFoundException exc) {
                    JOptionPane.showMessageDialog(null, "ERROR!!!");
                }catch(EOFException exc) {
                    salida4.setText(datos4);
                    JOptionPane.showMessageDialog(null, salida4, "Datos Mascota", JOptionPane.INFORMATION_MESSAGE);
                }catch (IOException exc) {
                    JOptionPane.showMessageDialog(null, "Error en la Apertura del Archivo",
                            "ERROR!!!",JOptionPane.ERROR_MESSAGE);
                }
                datos4="Habitat\tRaza\tAgresivo\tComida\tSize\tInteligencia\tEdad\tPelaje\tColor\tDueño\n";
            
                }//Fin del metodo
        
    
}
