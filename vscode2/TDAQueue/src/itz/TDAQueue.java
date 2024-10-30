package itz;
import java.util.LinkedList;
//importar queue
import java.util.Queue;

public class TDAQueue {
    public static void main(String[] args) {
    Queue<Integer> colita = new LinkedList<Integer>();
       colita.add(10);
         colita.add(20);
            colita.add(30);
            colita.add(40);
            colita.add(50);
            System.out.println("El Inicio de la cola es  "+colita.peek());

            @SuppressWarnings("unused")
            int tamano = colita.size();
           //System.out.println("Vaciando la cola");
          //colita.clear();
            while(!colita.isEmpty()){
                System.out.println("Despachando al elemento  "+colita.remove());
            }
        }

}
