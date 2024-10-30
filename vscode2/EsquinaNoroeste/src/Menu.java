import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        Matriz matriz = null;
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Crear matriz\n2. Imprimir matriz\n3.Esquina noroeste\n4. Salir", "Menu", JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1:
                int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de filas", "Ingrese el numero de filas"));
   
                int columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de columnas", "Ingrese el numero de columnas"));
                    matriz = new Matriz(columnas, filas);
                    matriz.llenarMatriz();
                    break;
                case 2:
                    matriz.imprimirMatriz();
                    break;

                case 3:
                    matriz.esquinaNoroeste();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (opcion != 4);
    }

}
