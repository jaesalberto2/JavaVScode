package itz;

import javax.swing.JOptionPane;

public class UsaBusqueda {
    public static void main(String[] args) {
        
        Busqueda busqueda = new Busqueda();
        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1.- Agregar\n2.- Eliminar\n3.- Busqueda Secuencial\n4.- Busqueda Binaria\n5.Mostrar\n6.- Salir"));
                switch (opcion) {
                    case 1:
                    {
                        int n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de datos a agregar aleatoriamente"));
                        for (int i = 0; i < n; i++) {
                            busqueda.agregar((int)(Math.random()*100));
                        }
                    }
                        break;
                    case 2:
                        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"));
                        busqueda.eliminar(pos);
                        break;
                    case 3:
                        int valorBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar"));
                        Integer resultado = busqueda.busquedaSecuencial(valorBusqueda);
                        if (resultado != null) {
                            JOptionPane.showMessageDialog(null, "El valor " + resultado + " fue encontrado");
                        } else {
                            JOptionPane.showMessageDialog(null, "El valor no fue encontrado");
                        }
                        break;
                    case 4:
                        int valorBusquedaBinaria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar"));
                        Integer resultadoBinario = busqueda.BusquedaBinaria(valorBusquedaBinaria);
                        if (resultadoBinario != null) {
                            JOptionPane.showMessageDialog(null, "El valor " + resultadoBinario + " fue encontrado");
                        } else {
                            JOptionPane.showMessageDialog(null, "El valor no fue encontrado");
                        }
                        break;
                    case 5: 
                        JOptionPane.showMessageDialog(null, busqueda.toString());
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } while (opcion != 5);
    }

}
