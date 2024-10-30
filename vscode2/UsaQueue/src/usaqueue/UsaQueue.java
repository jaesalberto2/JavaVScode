package usaqueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;

public class UsaQueue {

    public static void main(String[] args) {

        ArrayBlockingQueue<String> cola =  new ArrayBlockingQueue<>(10);
        Scanner leer = new Scanner(System.in);
        String persona;
        do{
            System.out.println("Nombre de persona(nada para salir:):");
            persona = leer.nextLine();
            if (persona.length()>0) if(!cola.offer(persona))
            System.out.println("Cola llena");
            //Atiende o elimina los elementos en la cola
            

        }while(persona.length()>0);
        do {
            System.out.println("Se atiende :"+cola.poll());
            
        } while (!cola.isEmpty());
        
        
        
    }
    

}
