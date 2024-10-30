package itz;

import java.util.ArrayList;
import java.util.Scanner;

public class Dinamico {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar enteros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese números
        System.out.println("Introduce números (introduce -1 para terminar):");
        int numero;
        while ((numero = scanner.nextInt()) != -1) {
            numeros.add(numero);
        }

        // Imprimir los elementos del ArrayList
        System.out.println("Elementos del ArrayList:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento en el índice " + i + ": " + numeros.get(i));
        }

        // Calcular la suma de los elementos del ArrayList
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("La suma de los elementos del ArrayList es: " + suma);
    }

}
