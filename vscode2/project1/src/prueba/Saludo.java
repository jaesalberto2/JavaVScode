package prueba;

import javax.swing.JOptionPane;

public class Saludo {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Hola " + nombre);

    }
    

    
}
