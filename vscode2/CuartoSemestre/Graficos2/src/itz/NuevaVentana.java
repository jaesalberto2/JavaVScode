
package itz;
import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*;

public class NuevaVentana {
    public static void main(String[] args) {
        MarcoVentana marco = new MarcoVentana();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana marco2 = new MarcoVentana();
        marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        marco2.setTitle("Ventana 2");
        marco2.setBounds(900,300,500,300);
    }
}



class MarcoVentana extends JFrame {


    

    public MarcoVentana(){
        setBounds(400,300,500,300);
        setTitle("Eventos en Ventana");
        setVisible(true);
        //instanciamos la clase oyente
        // M_Ventana oyente = new M_Ventana();
        // setVisible(true);

        // //agregamos el oyente a la ventana
        // addWindowListener(oyente);
        addWindowListener(new M_Ventana());
        cambioDeEstado cambio = new cambioDeEstado();
        addWindowStateListener(cambio);
    


        
    }
}
//clase oyente
class M_Ventana extends WindowAdapter {

    //metodo de la clase WindowAdapter
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana Minimizada");
    }
    //metodos de la interfaz
    /* 
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana Activada");
    }
    public void windowClosed(WindowEvent e) {

        System.out.println("Ventana Cerrada");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando Ventana");
    }
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana Desactivada");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana Restaurada");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana Minimizada");
    }
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana Abierta");
    }
 */


}
class cambioDeEstado implements WindowStateListener {
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado");
        // System.out.println(e.getNewState());
        if(e.getNewState() == Frame.MAXIMIZED_BOTH){
            System.out.println("Ventana Maximizada");
    }
    if(e.getNewState() == Frame.NORMAL){
        System.out.println("Ventana Normal");
    }
    if(e.getNewState() == Frame.ICONIFIED){
        System.out.println("Ventana Minimizada");
    }
    

}
}
