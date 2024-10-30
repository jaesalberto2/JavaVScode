package itz;

import java.util.Scanner;

public class FactorialCola {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("teclea el valor de n: ");
    int n = leer.nextInt();
    System.out.println("El factorial = "+fact(n));

        
    }

    private static double fact(int n) {
       return tail_fact(n,1);
    }

    private static double tail_fact(int n, double producto) {
        if(n==0)
        return producto;
        else 
        return tail_fact(n-1, n*producto);
        
    }

}
