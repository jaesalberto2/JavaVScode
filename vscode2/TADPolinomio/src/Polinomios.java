import javax.swing.JOptionPane;
public class Polinomios {
    private int[] polinomio1;
    private int[] polinomio2;
    private int[] resultado;

    private int grado;
    //Constructor usando el grado del polinomio
    public Polinomios(int grado) {
        this.grado = grado;
        polinomio1 = new int[grado + 1];
        polinomio2 = new int[grado + 1];
        resultado = new int[(grado)*2+4];
        for (int i = 0; i < grado + 1; i++) {
            polinomio1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coeficiente del polinomio 1 en la posición " + i));
            polinomio2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coeficiente del polinomio 2 en la posición " + i));
        }
    }

    //Metodo para leer polinomio
    public String leerPolinomio(int[] polinomio) {
        String polinomioString = "";
        for (int i = 0; i < polinomio.length; i++) {
            if (polinomio[i] == 0) {
                continue;
                
            }else
            if (i == polinomio.length - 1) {
                polinomioString += polinomio[i] + "x^" + i;
            } else
            polinomioString += polinomio[i] + "x^" + i + " + ";
        }
        return polinomioString;
    }

    //Metodo para sumar polinomios
    public void sumarPolinomios() {
        for (int i = 0; i < polinomio1.length; i++) {
            resultado[i] = polinomio1[i] + polinomio2[i];
        }
    }
    //Metodo para restar polinomios
    public void restarPolinomios() {
        for (int i = 0; i < polinomio1.length; i++) {
            resultado[i] = polinomio1[i] - polinomio2[i];
        }
    }
    //Metodo para multiplicar polinomios considerando los grados de los coeficientes
    public void multiplicarPolinomios() {
        for (int i = 0; i < polinomio1.length; i++) {
            for (int j = 0; j < polinomio2.length; j++) {
                resultado[i + j] += polinomio1[i] * polinomio2[j];
            }
        }
    }
    //Metodo para dividir polinomios considerando los grados de los coeficientes usando division sintetica
    public void dividirPolinomios() {
        int[] cociente = new int[grado];
        int[] residuo = new int[grado];
        for (int i = 0; i < grado; i++) {
            cociente[i] = polinomio1[i] / polinomio2[i];
            residuo[i] = polinomio1[i] % polinomio2[i];
        }
        JOptionPane.showMessageDialog(null, "Cociente: " + leerPolinomio(cociente) + "\nResiduo: " + leerPolinomio(residuo));
    
    }

    

    //getters y setters

    public int[] getPolinomio1() {
        return polinomio1;
    }

    public void setPolinomio1(int[] polinomio1) {
        this.polinomio1 = polinomio1;
    }

    public int[] getPolinomio2() {
        return polinomio2;
    }

    public void setPolinomio2(int[] polinomio2) {
        this.polinomio2 = polinomio2;
    }

    public int[] getResultado() {
        return resultado;
    }

    public void setResultado(int[] resultado) {
        this.resultado = resultado;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    


    


   

}
