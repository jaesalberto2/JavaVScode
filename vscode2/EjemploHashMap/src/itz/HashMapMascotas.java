package itz;

import java.util.HashMap;
import java.util.Map;

public class HashMapMascotas {
    public static void main(String[] args) {
        // Crear un HashMap de mascotas
        HashMap<Integer, Mascota> mascotas = new HashMap<>();
        // Crear mascotas
        Mascota mascota1 = new Mascota("Firulais", "Perro", 5);
        Mascota mascota2 = new Mascota("Garfield", "Gato", 3);
        Mascota mascota3 = new Mascota("Piolín", "Pájaro", 1);
        // Agregar mascotas al HashMap
        mascotas.put(1, mascota1);
        mascotas.put(2, mascota2);
        mascotas.put(3, mascota3);
        // Recorrer el HashMap
        for (Map.Entry<Integer, Mascota> entry : mascotas.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ". Valor: " + entry.getValue());
        }
        // buscar mascota por su id
        int id = 2;
        if (id==2) {
            System.out.println("Mascota con id 2: " + mascotas.get(id));            
        }else{
            System.out.println("No se encontró la mascota con id: " + id);
        }
        //eliminar una mascota por su id
        int idToRemove = 3;
        if (idToRemove==3) {
            mascotas.remove(idToRemove);
            System.out.println("Mascota con id 3 eliminada");
            
        } else {
            System.out.println("No se encontró la mascota con id: " + idToRemove+" para eliminar");
        }

        // volver a recorrer el hash
        System.out.println("Después de eliminar la mascota con id 3");
        for (Map.Entry<Integer, Mascota> entry : mascotas.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ". Valor: " + entry.getValue());
        }



    }

}
