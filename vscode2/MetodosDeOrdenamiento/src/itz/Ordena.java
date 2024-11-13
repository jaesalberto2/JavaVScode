package itz;
import static javax.swing.JOptionPane.showMessageDialog;

//Metodos de ordenamiento interno
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Ordena {
    public static void bubleSort(double[] vector) {
       int iteracion = 0;
       boolean permutation = true;
         while (permutation) {
              permutation = false;
              for (int i = 0; i < vector.length - 1 - iteracion; i++) {
                if (vector[i] > vector[i + 1]) {
                     double aux = vector[i];
                     vector[i] = vector[i + 1];
                     vector[i + 1] = aux;
                     permutation = true;
                }
              }
              iteracion++;
              System.out.println(Arrays.toString(vector));
         }

        
    }

    public static void sharkerSort(double [] vector) {
     boolean permutation;
     int actual=0, dirección=1;
     int comienzo=1, fin=vector.length-1;
     do {
         permutation=false;
         System.out.println(Arrays.toString(vector));

         while (((dirección==1) && (actual<fin)) || ((dirección==-1) && (actual>comienzo))) {
             actual += dirección;
             if (vector[actual]<vector[actual-1]) {
                 double temp = vector[actual];
                 vector[actual]=vector[actual-1];
                 vector[actual-1]=temp;
                 permutation=true;
             }
         }
         if (dirección==1) fin--; else comienzo++;
         dirección = -dirección;
     } while (permutation);
 }

 //Metodo de seleccion
     public static void selectionSort(double [] vector) {
          for (int i=0; i<vector.length-1; i++) {
          int min = i;
          for (int j=i+1; j<vector.length; j++) {
               System.out.println(Arrays.toString(vector));

               if (vector[j]<vector[min]) min=j;
          }
          double temp = vector[i];
          vector[i]=vector[min];
          vector[min]=temp;
          System.out.println(Arrays.toString(vector));
          }
     }
     //metodod de insercion directa
     public static void insertionSort(double [] vector) {
          for (int i=1; i<vector.length; i++) {
               double temp = vector[i];
               int j;
               for (j=i-1; j>=0 && vector[j]<temp; j--) {
                    System.out.println(Arrays.toString(vector));
                    vector[j+1]=vector[j];
               }
               vector[j+1]=temp;
          }
     }

     //metodo de insercion binaria
     public static void binaryInsertionSort(double [] vector) {
          for (int i=1; i<vector.length; i++) {
               double temp = vector[i];
               int izq=0, der=i-1;
               while (izq<=der) {
                    int centro = (izq+der)/2;
                    if (temp<vector[centro]) der=centro-1;
                    else izq=centro+1;
                    System.out.println(Arrays.toString(vector));
               }
               for (int j=i-1; j>=izq; j--) {
                    System.out.println(Arrays.toString(vector));
                    vector[j+1]=vector[j];
               }
               vector[izq]=temp;
          }
     }

}
