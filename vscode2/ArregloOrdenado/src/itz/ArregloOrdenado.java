package itz;

public class ArregloOrdenado {

    private long[] arr;
    private int numElems;
    //_____________________________-
    public  ArregloOrdenado(int tam) {
       arr = new long[tam];
    }
    //_________________________________
    public int busquedaBinaria(long dato){
        int minimo = 0;
        int maximo = numElems -1;
        int central;

        while(minimo<=maximo){
        central = (minimo+maximo)/2;

        if(arr[central]==dato){
            return central; //elemento encontrado
        }  else{
            if(dato>arr[central]){
                minimo= central +1;
            }else{
                maximo=central-1;
            }
        }


    }
    return -1;

    
    }
    //-----------------------------------------------

    public void insertar(long dato){
        int j;
        for(j=0;j<numElems;j++){
            if(arr[j]>dato){
                break;  //se detiene el bucle
            }
        }
        //desplaza celdas de arreglo a una posicion arriba
        for(int k= numElems;k>j;k--){
            arr[k]=arr[k-1];

        }
        arr[j]=dato; 
        numElems++;
    }

    //------------------------------------------------------------------------------------------

    public boolean eliminar(long dato){
        int j=busquedaBinaria(dato);
        if (j==-1) {
            return false;
        }else{
            for(int k=j;k<numElems;k++){
                arr[k]=arr[k+1];
            }
            numElems--;
            return true;   //se elimino el elemento
        }
    }
    //______________________________________________________________
    public void mostrarArreglo(){
        for(int j=0;j<numElems;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println("");
    }

    //---------------------------------------------------------------
    public long valorElemento(int i){
        return arr[i];
    }
    //--------------------------------------------------------------

}
