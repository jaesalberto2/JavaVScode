package itz;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        int[] arreglo = {1,6,5,4,9,7};
        Scanner ingresa = new Scanner(System.in);
   

        System.out.println("Ingresa el numero a buscar con metodo: ");
        int numero=ingresa.nextInt();
        BusquedaRecursiva busqueda = new BusquedaRecursiva(arreglo, numero);
        int resultado = busqueda.buscar(arreglo, numero,0);
        if (resultado != -1) {
            System.out.println("El valor " + numero + " se encuentra en la posición: " + resultado+" (recursivo)");
        } else {
            System.out.println("El valor " + numero + " no se encuentra en el arreglo. (recursivo)");
        }

        BusquedaCiclo busquedaci = new BusquedaCiclo(arreglo, numero);

         int resultadoci = busquedaci.buscar(arreglo, numero);
        if (resultado != -1) {
            System.out.println("El valor " + numero + " se encuentra en la posición: " + resultado+" (Ciclo)");
        } else {
            System.out.println("El valor " + numero + " no se encuentra en el arreglo. (Ciclo)");
        }
       
    }

}
