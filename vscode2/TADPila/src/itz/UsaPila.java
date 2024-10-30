package itz;

import javax.swing.JOptionPane;

public class UsaPila {
    public static void main(String[] args) {
        Pila<Paciente> pilaPacientes = new Pila<Paciente>(5);
        String menu = "1.-Push\n2.-Pop\n3.-Peek\n4.-Vaciar\n5.-Salir";
        int opcion = 0;
        int nssx;String nomx, enfx; Paciente pacx;
        do {
            try {
            opcion = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(menu));
          
                switch (opcion) {
                    case 1:
                        nssx = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("NSS:"));
                        nomx = javax.swing.JOptionPane.showInputDialog("Nombre:");
                        enfx = javax.swing.JOptionPane.showInputDialog("Enfermedad:");
                        pacx = new Paciente(nssx, nomx, enfx);
                        pilaPacientes.push(pacx);
                        break;
                    case 2:
                        pacx = pilaPacientes.pop();
                        if (pacx != null) {
                            JOptionPane.showMessageDialog(null, pacx);
                        }
                        break;
                    case 3:
                        pacx = pilaPacientes.peek();
                        if (pacx != null) {
                            JOptionPane.showMessageDialog(null, pacx);
                        }
                        break;
                    case 4:
                        pilaPacientes.vaciar();
                        break;
                    case 5:
                        javax.swing.JOptionPane.showMessageDialog(null, "Adios");
                        break;
                    default:
                        javax.swing.JOptionPane.showMessageDialog(null, "Opcion no valida");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }


    }while(opcion!=5);
    }

}
