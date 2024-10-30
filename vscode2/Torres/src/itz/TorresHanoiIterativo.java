package itz;

import java.util.Stack;

public class TorresHanoiIterativo {

  // Clase para representar un movimiento de disco
  static class Movimiento {
    int desde;
    int hacia;

    Movimiento(int desde, int hacia) {
        this.desde = desde;
        this.hacia = hacia;
    }
}

public static void torresHanoiIterativo(int discos, int torreOrigen, int torreAuxiliar, int torreDestino) {
    Stack<Movimiento> movimientos = new Stack<>();
    int totalMovimientos = (int) Math.pow(2, discos) - 1;

    // Inicializar las torres
    Stack<Integer>[] torres = new Stack[4];
    for (int i = 1; i <= 3; i++) {
        torres[i] = new Stack<>();
    }

    // Colocar todos los discos en la torre de origen
    for (int i = discos; i >= 1; i--) {
        torres[torreOrigen].push(i);
    }

    // Determinar si el número de discos es par o impar
    if (discos % 2 == 0) {
        int temp = torreDestino;
        torreDestino = torreAuxiliar;
        torreAuxiliar = temp;
    }

    for (int i = 1; i <= totalMovimientos; i++) {
        if (i % 3 == 1) {
            moverDisco(torres, torreOrigen, torreDestino);
        } else if (i % 3 == 2) {
            moverDisco(torres, torreOrigen, torreAuxiliar);
        } else if (i % 3 == 0) {
            moverDisco(torres, torreAuxiliar, torreDestino);
        }
    }
}

private static void moverDisco(Stack<Integer>[] torres, int desde, int hacia) {
    if (torres[hacia].isEmpty() || (!torres[desde].isEmpty() && torres[desde].peek() < torres[hacia].peek())) {
        torres[hacia].push(torres[desde].pop());
        System.out.println("Mover disco de Torre " + desde + " a Torre " + hacia);
    } else {
        torres[desde].push(torres[hacia].pop());
        System.out.println("Mover disco de Torre " + hacia + " a Torre " + desde);
    }
}

public static void main(String[] args) {
    int n = 6; // Número de discos
    torresHanoiIterativo(n, 1, 2, 3); // Llamada inicial: mover n discos de la torre 1 a la torre 3 usando la torre 2 como auxiliar
}
}
