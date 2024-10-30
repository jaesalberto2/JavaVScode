package itz;
import java.util.Scanner;

public class CalculaFibonacci {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cual termino de fibonacci deseas?");
        int n = leer.nextInt();
        long inicio1,fin1,inicio2,fin2;
        inicio1 = System.nanoTime();
        System.out.println("El termino es (iterativo) :"+fiboIte(n));
        fin1 = System.nanoTime();
        inicio2=System.nanoTime();
        System.out.println("El termino es (recursivo) : "+fiboRec(n));
        fin2= System.nanoTime();
        System.out.println("Iterativo  tardo = "+(fin1-inicio1));
        System.out.println("Recursivo  tardo = "+(fin2-inicio2));

    }

    private static long fiboRec(int n) {
        if((n==0)|| (n==1)) return n; //Estado base
        else return fiboRec(n-1)+fiboRec(n-2);//recursividad multiple
    }

    private static long fiboIte(int n) {
        if (n<=1) return n;
        else{
            long ant =0;
            long sig = 1;
            long aux;
            for(int i=2;i<=n;i++){
                aux = sig;
                sig = sig+ant;
                ant = aux;
            }
            return sig;
        }
    
    }

}
