package itz;
import javax.swing.JOptionPane;
//Ejemplo de implementacion de una lista generica ordenada


public class ListaOrdenada <T extends Comparable<T>>//generico
{
//Estructura de datos
    private T[] lista; //arreglo de objetos
    private int n; //numero de elementos
    private int max; //tamaño maximo
//Constructor
    @SuppressWarnings("unchecked")
    public ListaOrdenada(int max) {
        this.max = max;
        lista = (T[]) new Comparable[max]; //artificio convercion eclipse

        n = -1; this.max = max;
    }

    //Busqueda secuencial ordenada
    public int busquedaSecuencial(T dato) {
        int pos = -1;
        for (int i = 0; i <= n; i++) {
            if (lista[i].compareTo(dato) == 0) {
                pos = i;
                break;
            }
            }
            return pos;
        }
    
        public void insertar(T valor) {
            if (n < max - 1) {
                n++;
                int i = n;
                while (i > 0 && lista[i - 1].compareTo(valor) > 0) {
                    lista[i] = lista[i - 1];
                    i--;
                }
                lista[i] = valor;
            } else {
                JOptionPane.showMessageDialog(null, "Lista llena");
            }
        }

        //Eliminar un elemento
        public void eliminar(T valor){
            if (n >= 0) {
                int pos = busquedaSecuencial(valor);
                if (pos != -1) {
                    for (int i = pos; i < n; i++) {
                        lista[i] = lista[i + 1];
                    }
                    n--;
                } else {
                    JOptionPane.showMessageDialog(null, "Elemento no encontrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lista vacia");
            }
        }


        // metodo consultar
        public T consultar(T valor){
            T aux = null;
            int pos = busquedaSecuencial(valor);
            if (pos != -1) {
                aux = lista[pos];
            } else {
                JOptionPane.showMessageDialog(null, "Elemento no encontrado");
            }
            return aux;
        }

        public String listar() {
            String cad = "";
            for (int i = 0; i <= n; i++) {
                cad += lista[i] + "\n";
            }
            return cad;
        }



    
}
