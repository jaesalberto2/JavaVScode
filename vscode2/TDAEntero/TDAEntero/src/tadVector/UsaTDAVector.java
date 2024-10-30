package tadVector;

import java.util.Scanner;

public class UsaTDAVector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m,n,tamano,e,e1;
        System.out.println("teclea el tamaño del vector:"); tamano=leer.nextInt();
        System.out.println("teclea el tamaño de m:"); m=leer.nextInt();
        System.out.println("teclea el tamaño de n:"); n=leer.nextInt();
        System.out.println("teclea el tamaño de e:"); e=leer.nextInt();
        System.out.println("teclea el tamaño de e1:"); e1=leer.nextInt();
        //Creando el Vector
        TADVector v = new TADVector(tamano);
        //comprobacion de axiomas
        System.out.println(v.Existe(v,m)+ "="+false);
        System.out.println(v.Valor(v,m)+ "="+null);
        System.out.println(v.Asignar(v.Asignar(v,m,e1),n,e)+"="+
        ((m==n)?v.Asignar(v,m,e):v.Asignar(v.Asignar(v,n,e),m,e1)));
        System.out.println(v.Valor(v.Asignar(v, m, e), n)+"="+
        ((m==n)?e:v.Valor(v, n)));
        
    }

}
