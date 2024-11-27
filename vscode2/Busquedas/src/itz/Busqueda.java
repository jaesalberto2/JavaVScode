package itz;
//implementacion de busqeuda secuencial y binaria

import java.util.ArrayList;

public class Busqueda {

    private ArrayList<Integer> lista = new ArrayList<Integer>();

    public void  agregar(int valor){
        lista.add(valor);
    }

    public void eliminar(int pos){
        lista.remove(pos);
    }

    //Metodos de Busqueda
    //Secuencial
    public Integer busquedaSecuencial(int valor){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == valor) {
                return lista.get(i);
            }
        }
        return null;
    }

    //metodo de busqueda binaria(Ordenada)

    public Integer BusquedaBinaria(int valor){
        int izq, cen,der;
        boolean band=false;
        izq=0;
        der=lista.size()-1;
        while(izq<=der){
            cen=(izq+der)/2;
            if(lista.get(cen)==valor){
                band=true;
                return lista.get(cen);
            }
            if(lista.get(cen)<valor){
                izq=cen+1;
            }else{
                der=cen-1;
            }


        }
        return null;
    }
    public String toString(){
        String res="";
        for (int i = 0; i < lista.size(); i++) {
            res+=lista.get(i)+"\n";
        }
        return res;
    }

    //Metodo de ordenamiento

    public void ordenar(){
        int aux;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size()-1; j++) {
                if(lista.get(j)>lista.get(j+1)){
                    aux=lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
    }





    

}
