
import javax.swing.JOptionPane;

public class Matriz {

    int columnas;
    int filas;
    double[][] matriz;
    public Matriz(int columnas, int filas) {
        this.columnas = columnas;
        this.filas = filas;
        this.matriz = new double[columnas][filas];
     
    }
    //metodo para llenar la matriz
    public void llenarMatriz() {
        JOptionPane.showMessageDialog(null, "Ingrese los datos en orden con la demanda ubicada en la ultima fila y la oferta en la ultima columna", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la posicion [" + j + "][" + i + "]", "Ingrese el valor"));
            }
        }
    }
    //metodo para imprimir la matriz
    public void imprimirMatriz() {
        String matrizString = "";
        for (int j = 0; j < filas; j++) {
        for (int i = 0; i < columnas; i++) {
   
                matrizString +="["+matriz[i][j]+"]" + "  ";
            }
            matrizString += "\n";
        }
   
        
        JOptionPane.showMessageDialog(null, matrizString, "Matriz", JOptionPane.INFORMATION_MESSAGE);
    }

    //metodo para encontrar la distribucion de oferta y demanda con el metodo de la esquina noroeste
    public void esquinaNoroeste() {
        double suma=0;
        double[][] matrizAux = new double[columnas][filas];
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                matrizAux[i][j] = matriz[i][j];
            }
        }
        double[][] matrizSolucion = new double[columnas][filas];
        double[] oferta = new double[columnas];
        double[] demanda = new double[filas];
        for (int i = 0; i < columnas; i++) {
            oferta[i] = matrizAux[i][filas - 1];
        }
        for (int i = 0; i < filas; i++) {
            demanda[i] = matrizAux[columnas - 1][i];
        }
        int i = 0;
        int j = 0;
        while (i < columnas && j < filas) {
            if (oferta[i] < demanda[j]) {
                matrizSolucion[i][j] = oferta[i];
                demanda[j] -= oferta[i];
                oferta[i] = 0;
                i++;
            } else if (oferta[i] > demanda[j]) {
                matrizSolucion[i][j] = demanda[j];
                oferta[i] -= demanda[j];
                demanda[j] = 0;
                j++;
            } else {
                matrizSolucion[i][j] = oferta[i];
                oferta[i] = 0;
                demanda[j] = 0;
                i++;
                j++;
            }
        }
        String matrizString = "";
        for (int k = 0; k < filas; k++) {
            for (int l = 0; l < columnas; l++) {
                if (matrizSolucion[l][k] == 0) {
                    matrizString += "[XXX]" + "  ";
                } else {
                    matrizString += "[" + matrizSolucion[l][k] + "]" + "   ";
                    suma+=matrizSolucion[l][k]*matriz[l][k];
                    
                }
                
            }
            matrizString += "\n";
        }
        JOptionPane.showMessageDialog(null, matrizString, "Matriz solucion", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El costo total es: "+suma, "Costo total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
