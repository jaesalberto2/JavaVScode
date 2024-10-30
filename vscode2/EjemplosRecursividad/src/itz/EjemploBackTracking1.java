package itz;

import java.util.ArrayList;
import java.util.Scanner;

public class EjemploBackTracking1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("teclea el numero  a descompones: ");
        int n= leer.nextInt();
        ArrayList<Integer> numeros= new ArrayList<>();
        combinacionesSuma(n,numeros,0);
        

    }

    private static void combinacionesSuma(int numero, ArrayList<Integer> numeros, int suma) {
        if(suma== numero){
            System.out.println(numeros);
        }else{
            for(int i=1;i<=numero; i++){
                suma+=i;
                if(suma<= numero){
                    numeros.add(i);
                    combinacionesSuma(numero, numeros, suma);
                    numeros.remove(numeros.indexOf(i));
                }
                suma = suma-1;
            }
        }
    }


}
