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

}
