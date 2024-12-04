 import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class UsaPolinomio {
    public static void main(String[] args) {
        Polinomios polinomio = null;
        int grado;
        int opcion;
       
       
        try {

            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion \n1.- Sumar polinomios\n2.- Restar polinomios\n3.- Multiplicar polinomios\n4.- Dividir polinomios\n5.-Ingresar Polinomios\n6.-Leer polinomios\n7.- Salir"));
                switch (opcion) {
                    case 1:
                        polinomio.sumarPolinomios();
                        JOptionPane.showMessageDialog(null, "Resultado: " + polinomio.leerPolinomio(polinomio.getResultado()));
                        break;
                    case 2:
                        polinomio.restarPolinomios();
                        JOptionPane.showMessageDialog(null, "Resultado: " + polinomio.leerPolinomio(polinomio.getResultado()));
                        break;
                    case 3:
                        polinomio.multiplicarPolinomios();
                        JOptionPane.showMessageDialog(null, "Resultado: " + polinomio.leerPolinomio(polinomio.getResultado()));
                        break;
                    case 4:
                        polinomio.dividirPolinomios();
                       
                        break;



                    case 5:
                    grado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el grado del polinomio"));
                    polinomio = new Polinomios(grado);
                        
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Polinomio 1: " + polinomio.leerPolinomio(polinomio.getPolinomio1()) + "\nPolinomio 2: " + polinomio.leerPolinomio(polinomio.getPolinomio2()));
                        break;


                
                    default:
                        break;
                }

            }while (opcion != 7); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El grado debe ser un número entero");
        }
        
    }

}
