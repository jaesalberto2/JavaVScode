package itz;

import java.util.Scanner;

public class Codigos {
    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame el tamaño de los datos: ");
        n= leer.nextInt();
        System.out.println("El resultado del fragmento 1 = "+ejemplo1(n));
        System.out.println("El resultado del fragmento 2 = "+ejemplo2(n));
        System.out.println("El resultado del fragmento 3 = "+ejemplo3(n));
        System.out.println("El resultado del fragmento 4 = "+ejemplo4(n));
        System.out.println("El resultado del fragmento 5 = "+ejemplo5(n));

    }
    ///a) 5
    // T(n=10)=5 unidades de tiempo
    //Unidades de tiempo totales: Y(n)=20 unidades de tiempo
    //c) 0(1)

    public static int ejemplo1(int n){
        int cuenta = 0;         //2
        for(int i=0;i<5;i++){   //2+5+5
            cuenta++;           //5
        }
            return cuenta;      //1
           
     

    }
            //a)=10
            //b) T(n=10)=n Unidades de tiempo totales: T(n)=3n+5
            //O(n) lineal
    public static int ejemplo2(int n){
        int cuenta = 0;         //2
        for(int i=0;i<n;i++){   //2+n+n
            cuenta++;           //n
        }
            return cuenta;      //1
           


    }
         //a)=100
            //b) T(n)=n^2 Unidades de tiempo totales: T(n)=3n^2+4n+5
            //O(n) lineal
            public static int ejemplo3(int n){
                int cuenta = 0;         //2
                for(int i=0;i<n;i++){   //2+n+n
                            for(int j=0;j<n;j++)       //2n+n^2+n^2     
                    cuenta++;           //n^2
                }
                    return cuenta;      //1
                   
               
        
            }

                     //a)=45
            //b) T(n)=10= n(n-1)/2=10(10-1)/2=90/2=45
            //O(n^2) cuadratico
            //0+1+2+3+4....+(n-1)
            public static int ejemplo4(int n){
                int cuenta = 0;         //2
                for(int i=0;i<n;i++){   //2+n+n
                            for(int j=0;j<i;j++)       //2n+n^2+n^2     
                    cuenta++;           //n^2
                }
                    return cuenta;      //1
                   
               
        
            }
                         //a)=5
            //b) T(n)=n/2 = 10/2=5
           
            public static int ejemplo5(int n){
                int cuenta = 0;         //2
                for(int i=0;i<n;i+=210){   //2+n+n
                                //2n+n^2+n^2     
                    cuenta++;           //n^2
                }
                    return cuenta;      //1
                   
               
        
            }


   
}
