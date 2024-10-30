package itz;

import java.util.Scanner;

public class CalculaFactorial {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("teclea un valor entero positivo de n: ");
        int n= leer.nextInt();
        System.out.println("Solucion Recursiva: "+FactorialRec(n));
        System.out.println("Solucion Iterativa: "+FactorialInter(n));
        
    }
    private static double FactorialInter(int n) {
        double producto =1;
        for (int i=n;i>0;i--){//de manera iterativa descendente5

            producto=producto*i;
        }
        return producto;
    }
    private static double FactorialRec(int n) {
        // TODO Auto-generated method stub
        if (n==0)return 1;//estado base
            else return (n*FactorialRec(n-1));// caso recursivo
    }

}
