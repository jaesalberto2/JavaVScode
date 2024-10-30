package itz;

import java.util.PriorityQueue;
import java.util.Queue;

public class UsaColaPrioridad {
    public static void main(String[] args) {
        Queue<Persona> cola = new PriorityQueue<Persona>();
        cola.add(new Persona("Juan", 1));
        cola.add(new Persona("Pedro", 3));
        cola.add(new Persona("Maria", 3));
        cola.add(new Persona("Ana", 2));
        cola.add(new Persona("Luis", 2));
        cola.add(new Persona("Carlos", 1));
        while (!cola.isEmpty()) {
            Persona a = cola.remove();
            System.out.println(a.getNombre() + " " + a.getTipo());
            
        }
    }

}
