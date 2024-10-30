package itz;

public class ListaDoble <T>{
    private Nodo<T> p,f;
    public ListaDoble() {
        p = f = null;
    }
    //operaciones basicas
    public void insertarAlInicio(T info){
        Nodo<T> q = new Nodo<T>(info, null, null);
        if(p == null){
            p = f = q;
        }else{
            q.setDer(p);
            p.setIzq(q);
            p = q;
        }
    }
    //insertar al final
    public void insertarAlFinal(T info){
        Nodo<T> q = new Nodo<T>(info, null, null);
        if(p == null){
            p = f = q;
        }else{
            q.setIzq(f);
            f.setDer(q);
            f = q;
        }
    }
    //eliminar al inicio
    public void eliminarAlInicio(){
        if(p == null){
            System.out.println("Lista vacia");
        }else{
            if(p == f){
                p = f = null;
            }else{
                p = p.getDer();
                p.setIzq(null);
            }
        }
    }
    //eliminarFinal
    


}