package colas;
//Implementacion de una doble cola mediante el uso de arreglos
//Bicola se pueden realizar las inserciones tanto por enfrente como por final

public class BiCola <T> {
    private int frente,fin;
    private int max;
    public boolean errorx;
    public String msgerror;
    private T[] arreglo;

    //Constructor
    public BiCola(int max) {
        arreglo = (T[]) new Object[max];
        this.max = max-1;
        frente = -1;
        fin = -1;
   

    }

    //Metodos u operaciones de las colas
    public void insertarPorFinal(T dato) {
        errorx=false;
        if(((fin==max)&&(frente==0))||(fin+1==frente)){
            errorx=true;
            msgerror="Cola llena";
           
        }else{
            if(fin==max){
                fin=0;
            }else{
                fin++;
                arreglo[fin]=dato;
            }
         
            if (frente==-1){
                frente=0;
            }
        }
    }

    public void insertarPorFrente(T dato) {
        errorx=false;
        if(((fin==max)&&(frente==0))||(fin+1==frente)){
            errorx=true;
            msgerror="Cola llena";
           
        }else{
            if (frente==-1){
                frente=0;
            }
            else if(frente==0){
                frente=max;
            }else{
                frente--;
                arreglo[frente]=dato;
            }
         
   
        }
    }
    public T eliminarFrente(){
        //verificar que existan elementos en la cola
        errorx=false;
        T auxiliar;
        if(frente>=0){
            auxiliar = arreglo[frente];
            arreglo[frente]=null;//borra la referencia
        
            if(frente==fin){
                frente=-1;
                fin=-1;
            }else{
                if(frente==max){
                    frente=0;
                }else{
                    frente++;
                   
                  
                }
             
            }
            return auxiliar;
  
    }else{
        errorx=true;
        msgerror="Cola vacia";
        return null;
    }
    }
    public T eliminarFinal(){
        //verificar que existan elementos en la cola
        errorx=false;
        T auxiliar;
        if(frente>=0){
            auxiliar = arreglo[fin];
            arreglo[fin]=null;//borra la referencia
        
            if(frente==fin){
                frente=-1;
                fin=-1;
            }else{
                if(fin==0){
                    fin=max;
                }else{
                    fin--;
                   
                  
                }
             
            }
            return auxiliar;
  
    }else{
        errorx=true;
        msgerror="Cola vacia";
        return null;
    }
    }

    public void mostrarCola(){//Muestra comoo estructura fifo
 int i;
 if (fin>=frente){
     for(i=frente;i<max;i++){
         System.out.println(arreglo[i]);
 
     
        }
        for(i=0;i<=fin;i++){
            System.out.println(arreglo[i]);
    }

}else{
    for(i=frente;i<=fin;i++){
        System.out.println(arreglo[i]);
    }}

}
    public void verEstructura(){
        for(int i=0;i<max;i++){
            if(arreglo[i]==null){
                System.out.println("Vacio");
           
        }else
            System.out.println(arreglo[i]);
        }
        System.out.println("Frente: "+frente+" Fin: "+fin);
}

}

