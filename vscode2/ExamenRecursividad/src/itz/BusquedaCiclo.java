package itz;

public class BusquedaCiclo {
    
    int[] arreglo;
    int x;
    public BusquedaCiclo(int[] arreglo, int x) {
        this.arreglo = arreglo;
        this.x = x;
    }

    public static int buscar(int[] arreglo, int numero) {
        // Recorremos el arreglo con un ciclo for
        for (int i = 0; i < arreglo.length; i++) {
            // Si encontramos el número, retornamos su posición
            if (arreglo[i] == numero) {
                return i;
            }
        }
        // Si no encontramos el número, retornamos -1
        return -1;
    }

}
