package directorio;

import java.util.Hashtable;
import java.util.Enumeration;

//Clase para gestionar un directorio de contactos
//Autor : Alberto Escareño
//Fecha : 2024/21/11


public class Directorio {
    //definicion de las Variables
    private Hashtable<String, String> Contactos;
    //Constructor
    public Directorio(){
        Contactos = new Hashtable<String, String>();
    }
    //Agragar contacto
    public int AgregarContacto(String nombre, String telefono){
       int res = 0;
         if(!this.Contactos.containsKey(nombre)){
              res = 1;
        Contactos.put(nombre, telefono);
    }
    return res;
    }
    //Borrar contacto
    public int BorrarContacto(String nombre){
        int res = 0;
        if(this.Contactos.containsKey(nombre)){
            res = 1;
            Contactos.remove(nombre);
        }
        return res;
    }
    //borrar todos los contactos
    public void BorrarTodos(){
        Contactos.clear();
    }
    //Buscar contacto
    public String BuscarContacto(String nombre){
        String res = "";
        if(this.Contactos.containsKey(nombre)){
            res = Contactos.get(nombre);
        }
        return res;
    }
    //Listar contactos
    public void ListarContactos(){
        Enumeration lista = Contactos.keys();
        Object nombre;
        Object telefono;
        while(lista.hasMoreElements()){
            nombre = lista.nextElement();
            telefono = Contactos.get(nombre);
            System.out.println(nombre + " : " + telefono);
        }
    }
    


}
