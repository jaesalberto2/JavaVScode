
public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hijoIzquierdo;
    NodoArbol hijoDerecho;
    public NodoArbol(int dato, String nombre) {
        this.dato = dato;
        this.nombre = nombre;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    public String toString() {
        return nombre + " Su dato es: " + dato;
   
    }
    


}
