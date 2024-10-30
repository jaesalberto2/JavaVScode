package colas;
import java.util.Scanner;

public class UsaBiCola {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        
        int opcion;
        Paciente pacientex;
        BiCola colaHospital = new BiCola<Paciente>(10);
        Scanner entrada = new Scanner(System.in);
       do{
            System.out.println("1.- Agregar paciente por el frente");
            System.out.println("2.- Agregar paciente por el final");
            System.out.println("3.- Eliminar paciente por el frente");
            System.out.println("4.- Eliminar paciente por el final");
            System.out.println("5.- Mostrar Cola");
            System.out.println("6.- Ver estructura de la cola");
            System.out.println("7.- Salir");
            System.out.println("Elige una opcion");
            opcion = entrada.nextInt();
           
            switch(opcion){
                case 1:
                {
                    pacientex = new Paciente();
                    pacientex.pedirDatos();
                    colaHospital.insertarPorFrente(pacientex);

                }
                break;
                case 2:
                {
                    pacientex = new Paciente();
                    pacientex.pedirDatos();
                    colaHospital.insertarPorFinal(pacientex);
                }
                break;
                case 3:
                {
                    pacientex = (Paciente) colaHospital.eliminarFrente();
                    if(pacientex!=null){
                        System.out.println("Paciente eliminado: "+pacientex);
                    }else{
                        System.out.println("Cola vacia");
                    }
                }
                break;
                case 4:
                {
                    pacientex = (Paciente) colaHospital.eliminarFinal();
                    if(pacientex!=null){
                        System.out.println("Paciente eliminado: "+pacientex);
                    }else{
                        System.out.println("Cola vacia");
                    }
                }
                break;
                case 5:
                {
                    colaHospital.mostrarCola();
                }
                break;
                case 6:
                {
                  colaHospital.verEstructura();
                }
                break;
                case 7:
                {
                    System.out.println("Fin del programa");
                    System.exit(0);
                }
                break;
                default:
                {
                    System.out.println("Opcion no valida");
                }
                break;

            }
            
            
        }while(opcion!=5);
        entrada.close();
       }
        

    
}
