package itz;

public class Pila<T> {

     private T[] pila;

     private int tope;
        private int maximo;
        @SuppressWarnings("unchecked")
        public Pila(int maximo) {
        tope = -1;
        pila = (T[]) new Object[maximo];
        this.maximo = maximo-1;
}
        //Operaciones Basicas
        public boolean estaLLena() {
            if (tope==maximo) return true;
             else return false;
        }
        public boolean estaVacia() {
            if (tope==-1) return true;
             else return false;
        }
        public void push(T dato) {
            if (!estaLLena()) {
                tope++;
                pila[tope] = dato;
            } else {
                System.out.println("La pila esta llena");
            }
        }
        public T pop() {
            if (!estaVacia()) {
                T dato = pila[tope];
                tope--;
                return dato;
            } else {
                System.out.println("La pila esta vacia");
                return null;
            }
        }
        public T peek() {
            if (!estaVacia()) {
                return pila[tope];
            } else {
                System.out.println("La pila esta vacia");
                return null;
            }
        }
        public void vaciar() {
            tope = -1;
        }
        public int getTope() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getTope'");
        }
        public char[][] getPila() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getPila'");
        }
        

    



    }