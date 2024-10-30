package itz;

public class BusquedaRecursiva {

  
        int[] arreglo;
        int x;
        
        public BusquedaRecursiva(int[] arreglo, int x) {
            this.arreglo = arreglo;
            this.x = x;
        }
        
        public int buscar(int arreglo[], int numero,int indice){
            if (indice >= arreglo.length) {
                return -1;
            }
            // Si encontramos el número, retornamos su posición
            if (arreglo[indice] == numero) {
                return indice;
            }
            // Llamada recursiva con el siguiente índice
            return buscar(arreglo, numero, indice + 1);



        }


   
    
     
    }
    


