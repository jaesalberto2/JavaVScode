package itz;
public class Nodo {
    public int dato;
    public Nodo siguiente;//Puentero enlace
    //Constructor para insertar al final
    public Nodo(int d) {
        this.dato = d;
        this.siguiente = null;
        
    }
    //Constructor para insertar al inicio
    public Nodo(int d, Nodo n) {
        dato = d;
        siguiente = n;
    }


}
