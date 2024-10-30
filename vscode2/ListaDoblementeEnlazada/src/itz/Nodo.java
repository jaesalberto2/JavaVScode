package itz;

public class Nodo <T>{
    private T info; // campo que almacena cualquier objeto
    private Nodo<T> izq;
    private Nodo<T> der;
    public Nodo(T info, Nodo<T> izq, Nodo<T> der) {
        this.info = info;
        this.izq = null;
        this.der = null;
    }
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public Nodo<T> getIzq() {
        return izq;
    }
    public void setIzq(Nodo<T> izq) {
        this.izq = izq;
    }
    public Nodo<T> getDer() {
        return der;
    }
    public void setDer(Nodo<T> der) {
        this.der = der;
    }

    




}
