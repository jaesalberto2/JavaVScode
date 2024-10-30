package itz;

public class TorresdeHanoi {

    public static void main(String[] args) {
        int n = 6; // Número de discos
        torresHanoi(n, 1, 2, 3); // Llamada inicial: mover n discos de la torre 1 a la torre 3 usando la torre 2 como auxiliar
    }
    public static void torresHanoi(int discos, int torreOrigen, int torreAuxiliar, int torreDestino) {
        // Caso base: si solo hay un disco, muévelo directamente a la torre destino
        if (discos == 1) {
            System.out.println("Mover disco de Torre " + torreOrigen + " a Torre " + torreDestino);
        } else {
            // Mueve n-1 discos de la torre origen a la torre auxiliar
            torresHanoi(discos - 1, torreOrigen, torreDestino, torreAuxiliar);
            // Mueve el disco restante a la torre destino
            System.out.println("Mover disco de Torre " + torreOrigen + " a Torre " + torreDestino);
            // Mueve los n-1 discos de la torre auxiliar a la torre destino
            torresHanoi(discos - 1, torreAuxiliar, torreOrigen, torreDestino);
        }
    }
}
