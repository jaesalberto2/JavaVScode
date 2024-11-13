package itz;
import static javax.swing.JOptionPane.*;
import java.util.Arrays;
public class UsaOrdena {
    static double [] valores;
    public static void main(String[] args) {
        String entrada = showInputDialog("Introduce los valores separados por comas");
        args = entrada.split(",");
        valores = new double[args.length];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.parseDouble(args[i]);
        }
        //Ordena.bubleSort(valores);
        //showMessageDialog(null, Arrays.toString(valores));
        //Ordena.sharkerSort(valores);

        //Ordena.selectionSort(valores);
        Ordena.insertionSort(valores);
        //Ordena.binaryInsertionSort(valores);
        showMessageDialog(null, Arrays.toString(valores));
        

       

        
    }

}
