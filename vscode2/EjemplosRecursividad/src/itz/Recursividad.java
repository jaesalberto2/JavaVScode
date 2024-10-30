package itz;

public class Recursividad {

    public void Imprimir(int x){
        if(x<=5){
            System.out.print(x+" ");
            Imprimir(x+1);
        }
    }//1 2 3 4 5 

}
