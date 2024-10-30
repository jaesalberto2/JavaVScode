package itz;

import java.util.Scanner;

public class PrincipalComida {

    public static void main(String[] args) {
        int tamano;
        try (Scanner in = new Scanner(System.in)) {
            int opc = 0;
            try {
            System.out.println("Ingrese el tamaño de la pila");
            tamano = in.nextInt();
            PilaComida obj = new PilaComida(tamano);
      
            do {
          
                System.out.println("1. Insertar un alimento en la pila");
                System.out.println("2. Eliminar un alimento de la pila");
                System.out.println("3. Mostrar los alimentos de la pila");
                System.out.println("4. Salir");
                System.out.println("Ingrese una opcion");
               
                opc = in.nextInt();
                switch (opc) {
                    case 1:
                        obj.push();
                        break;
                    case 2:
                        obj.pop();
                        break;
                    case 3:
                        obj.mostrarPila();
                        break;
                    case 4: {
                        System.out.println("Programa finalizado");
                        System.exit(0);
                    }
                    break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
        
              
            } while (opc != 4);
        
    } catch (Exception e) {
        System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
        //regresa al inicio del programa
        main(args);
       
   
    }
            }

    }

    

}
