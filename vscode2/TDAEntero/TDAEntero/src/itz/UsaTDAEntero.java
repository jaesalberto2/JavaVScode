package itz;
import static itz.TADEntero.*;
import java.util.Scanner;

public class UsaTDAEntero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m,n;
        System.out.println("Teclea el primer valor entero");
        n=leer.nextInt();
        System.out.println("Teclea el segundo valor entero");
        m=leer.nextInt();
        //Comprobacion de semantica
        System.out.println(Sucesor(Antecesor(n))+"="+n);
        System.out.println(Antecesor(Sucesor(n))+"="+n);
        System.out.println(Suma(0, n)+"="+n);
        System.out.println(Suma(n, Sucesor(m))+"="+Sucesor(Suma(m, n)));
        System.out.println(Suma(n, Antecesor(m))+"="+Antecesor(Suma(m, n)));
        System.out.println(Diferencia(m, Sucesor(n)));



        
    }

}
