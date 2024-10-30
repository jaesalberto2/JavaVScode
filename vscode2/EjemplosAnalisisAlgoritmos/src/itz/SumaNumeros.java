package itz;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        long n;
        long res1,res2;
        System.out.println("Tecle el valor de n: ");
        n= leer.nextLong();
        res1 = sumA(n);
        res2 = sumB(n);
        System.out.println("La suma version A = "+res1);
        System.out.println("La suma version B = "+res2);

    }
    public static long sumA(long n) {
        long inicio = System.nanoTime();
        long result = 0;
        for(long i=1;i<=n;i++){10
            result =  result+i;
        }
        long fin = System.nanoTime();
        long tardo = fin-inicio;
        System.out.println("la suma de "+n+" Version A tardo "+tardo+" ns ");
        return result;
        
    }

    public static long sumB(long n){
        long inicio = System.nanoTime();
        long result = n*(n+1)/2;
        long fin = System.nanoTime();
        long tardo = fin - inicio;
        System.out.println("la suma de "+n+" Version B tardo "+tardo+" ns ");  
    return result;  
    }

}
