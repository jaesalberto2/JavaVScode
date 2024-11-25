import java.util.Arrays;

public class TDAvideoTuto71 {
    //constructor
    String [] arreglo;
    int tamaño;
    int contador;
    public TDAvideoTuto71(int tam) {
        this.tamaño = tam;
        this.arreglo = new String[tam];
        Arrays.fill(arreglo, "-1");        
    }
    public void funcionHash(String[] cadenaArreglo, String[] arreglo) {
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento) % arreglo.length;
            System.out.println("El indice es: " + indiceArreglo + " para el elemento " + elemento);
            //Tratando colisiones
            while (arreglo[indiceArreglo] != "-1") {
                indiceArreglo++;
                System.out.println("Ocurrio una colision en el indice: " + (indiceArreglo - 1) + " cambiar al indice: " + indiceArreglo);
                indiceArreglo %= tamaño;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }//fin funcionHash
    //metodo para mostrar la tabla
    public void mostrar() {
        int incremento = 0;
        int contador = 0;
        for (int i = 0; i < 1; i++) {
            incremento += 8;
            System.out.println("------------------------------------------------------------------");
            for (int x = 0; x < 8; x++) {
                System.out.print("| " + x + "  ");
            }
            System.out.println("|");
            System.out.println("------------------------------------------------------------------");
            for (int j = incremento - 8; j < incremento; j++) {
                System.out.print("| " + j + " ");
                if (contador < arreglo.length) {
                    System.out.print("| " + arreglo[contador]);
                } else {
                    System.out.print("| ");
                }
                contador++;
            }
            System.out.println("|");
        }
        System.out.println("------------------------------------------------------------------");
    }

    //metodo para buscar clave
    public String buscarClave(String elemento) {
        int indiceArrglo = Integer.parseInt(elemento) % arreglo.length;
        int contador = 0;
        while (arreglo[indiceArrglo] != "-1") {
            if (arreglo[indiceArrglo] == elemento) {
                System.out.println("El elemento " + elemento + " fue encontrado en el indice " + indiceArrglo);
                return arreglo[indiceArrglo];
            }
            indiceArrglo++;
            indiceArrglo %= tamaño;
            contador++;
            if (contador > tamaño) {
                break;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TDAvideoTuto71 hash = new TDAvideoTuto71(8);
        String[] elementos = {"20", "33", "21", "10", "12", "14", "56", "100"};
        hash.funcionHash(elementos, hash.arreglo);
        hash.mostrar();
        
        String buscar = hash.buscarClave("100");
        if (buscar == null) {
            System.out.println("El elemento no se encuentra en la tabla");
        }
    
    }

}
