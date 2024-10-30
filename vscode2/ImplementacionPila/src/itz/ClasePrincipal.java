package itz;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        Pila obj=new Pila();
        try (Scanner op = new Scanner(System.in)) {
            int opcion;
            do{
                System.out.println("1. Insertar un elemento en la pila");
                System.out.println("2. Eliminar un elemento de la pila");
                System.out.println("3. Mostrar los elementos de la pila");
                System.out.println("4. Salir");
                System.out.println("Ingrese una opcion");
                opcion = op.nextInt();
                switch(opcion){
                    case 1: obj.push();
                    break;
                    case 2: obj.pop();
                    break;
                    case 3: obj.mostrarPila();
                    break;
                    case 4: {System.out.println("Programa finalizado");
                    System.exit(0);}
                    break;
                    default: System.out.println("Opcion incorrecta");
                }
   }while(opcion!=4);
        }
    }

}
