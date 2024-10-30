public class RegistroDeActivacion {
    public static int c = 10; // contexto global clase
    
    public static void main(String[] args) {
        int a = 100; // contexto solo del metodo
        int b=200; //Memoria estatica
        //Memoria dinamica heap es una referencia
        int vector[] = new int[3];
        vector[0]=10; vector[1]=20; vector[2]=30; // {10,20,30}
        //invocacion o llamada a otro metodo
        //a y b se pasa una copia del valor, vector para su referencia
        metodoA(a,b,c,vector);//parametros actuales
        System.out.println(vector);
        System.out.println("Valor de a = "+a);
        System.out.println("Valor de b = "+b);
        System.out.println("Valor de c = "+c);
        for (int i=0;i<vector.length;i++) //Contexto es dolo para el ciclo
        System.out.printf("vector[%d]=%d\n",i,vector[i]);


        
    }
    public static void metodoA(int a, int b, int c,int lista[]) {
         /*
          * Parametros formales (contexto metodo)
          cada metodo tiene su propia variable a y b ( distintos espaciod de memoria)
          cada metodo tiene su propia variable a y b a traves de su referencia
          */

          a=a*10; //1000
          b=b*10; //2000
          metodoB(a,b,lista); //invocar metodoB
          for (int i=0;i<lista.length;i++)//contexto del ciclo
          lista[i]=lista[i]+5; //{25,35,45}
          c=c+10; //30



    }
    public static void metodoB(int a, int b, int x[]) {
        a=a+a; //2000
        b=b+b; //4000
        for(int i=0;i<x.length;i++)
        x[i]=x[i]+10; //{20,30,40}
        c=c+10;//20

        
    }

}
