public class Arreglos {
    public static void main(String[] args) {
        int vector[]={10,80,90,100,40,50,60,70,20,30};
        System.out.println("Valores del arreglo de izquierda a derecha");
        escribirArreglo(vector,vector.length-1);
        System.out.println();
        System.out.println("Valores de arreglo de derecha a izquierda");
        escribirArreglo2(vector, vector.length);
        System.out.println();
        System.out.println("La suma de los valores del  arreglo (vuelta atras) :"+
        sumaArreglo(vector,vector.length-1));
        System.out.println("La suma de los valores del arreglo (cola): "+
        sumaArreglo2(vector, vector.length-1,0));
        System.out.println("El mayor de los valores de un arreglo (Inter):"+
        mayorInter(vector,vector.length-1));
        System.out.println("El mayor de los valores de un arreglo (Rec): "+
        mayorRec(vector, vector.length-1,vector[0]));
        
    }

    private static int mayorRec(int[] vector, int n,int mayor) {
        if (n==0) return mayor;
        else {
            if (vector[n]>mayor) mayor = vector[n];
            return mayorRec(vector, n-1, mayor);

        }


    }

    private static int mayorInter(int[] vector, int n) {
        int mayor= vector[0];
        for(int i=0;i<=n;i++)
        if(vector[i]>mayor) mayor=vector[i];
        return mayor;

    }

    private static int sumaArreglo2(int[] vector, int n,int suma) {
        if (n>=0) return sumaArreglo2(vector, n-1, suma+vector[n]);
        else return suma;

    }

    private static int sumaArreglo(int[] vector, int n) {
        if (n!=0) return vector[n]+sumaArreglo(vector, n-1);
        
        else return vector[n];
    }

    private static void escribirArreglo2(int[] vector, int n) {
        if(n>=0){
            System.out.print(vector[n]+",");
            escribirArreglo2(vector, n-1);
        }
    }

    private static void escribirArreglo(int[] vector, int n) {
        if (n!=0) escribirArreglo(vector, n-1);
        System.out.print(vector[n]+",");
    }

}
