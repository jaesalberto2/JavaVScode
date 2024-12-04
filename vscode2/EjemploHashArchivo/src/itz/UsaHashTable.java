package itz;

public class UsaHashTable {
    public static void main(String[] args) {
        
        try {
        HashTable tabla = new HashTable("Directo.dat", 100, 80);
  
        tabla.insert(191, "Juan Perez Veyna".getBytes());
        tabla.insert(341, "Maria Lopez Garcia".getBytes());
        tabla.insert(291, "Pedro Martinez".getBytes());
        tabla.insert(441, "Jose Perez".getBytes());
        String datos = new String(tabla.find(191));
        System.out.println(datos.trim());
        datos = new String(tabla.find(341));
        System.out.println(datos.trim());
        datos = new String(tabla.find(291));
        System.out.println(datos.trim());
        tabla.delete(291);
        datos = new String(tabla.find(291));
        System.out.println(datos.trim());
        


        

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
