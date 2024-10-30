public class Estatico {
    public static void main(String[] args) {
        


                // Declaración y asignación de un array estático de enteros
                int[] numeros = {1, 2, 3, 4, 5};
        
                // Imprimir los elementos del array
                System.out.println("Elementos del array:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println("Elemento en el índice " + i + ": " + numeros[i]);
                }
        
                // Calcular la suma de los elementos del array
                int suma = 0;
                for (int i = 0; i < numeros.length; i++) {
                    suma += numeros[i];
                }
                System.out.println("La suma de los elementos del array es: " + suma);
            
        
    }
    
}
