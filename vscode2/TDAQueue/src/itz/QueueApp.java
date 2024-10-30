package itz;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) throws InterruptedException {
        Queue<Persona> cola = new PriorityQueue<Persona>();
       
        cola.add(new Persona(1,"Juan",20));
        cola.add(new Persona(2,"Pedro",30));
        cola.add(new Persona(3,"Maria",25));
        cola.add(new Persona(4,"Ana",22));
        cola.add(new Persona(5,"Luis",35));
       
        while (!cola.isEmpty()) {
            System.out.println("Se Procede a atender a  "+cola.peek());
            System.out.println("Atendio a "+cola.poll());
            Thread.sleep(1000);
            
        }
    
    }

}
