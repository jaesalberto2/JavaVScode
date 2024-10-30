import java.util.Scanner;

public class VentasAnuales {
    static double ventas[]=new double[12];
    static String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
"Octubre","Noviembre","Diciembre"};
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        leerVentas(ventas);
        escribirVentas(ventas);
        double promedio = promedioVentas(ventas);
        System.out.println("El promedio total de ventas = "+promedio);
        mesesMenoresPromedio(ventas,promedio);
        System.out.println("El porcentaje de ventas mayores al promedio = "+porcMayorPromedio(ventas,promedio));
    }

    public static double porcMayorPromedio(double[] ventas, double promedio){
        double c = 0.0;
        for(int i=0; i<ventas.length;i++){
            if(ventas[i]>promedio)c++;
        }
        return(c/ventas.length*100);
    }
    public static void mesesMenoresPromedio(double[] ventas, double promedio){
        for (int i=0;i<ventas.length;i++){
            if(ventas[i]<promedio)
            System.out.printf("El mes  % es menor al promedio\n",meses[i]);
        }
    }

    public static double promedioVentas(double[] ventas){
        double suma=0.0;
        for(int i=0;i<ventas.length;i++)
        suma = suma+ventas[i];
        return(suma/ventas.length);
    }
    public static void leerVentas(double[] ventas){
        for(int i=0;i<ventas.length;i++){
            System.out.printf("Tecla las ventas del mes %s = ",meses[i]);
            ventas[i]=leer.nextDouble();
        }
    }
    public static void escribirVentas(double[] ventas){
        for(int i=0;i<ventas.length;i++){
            System.out.printf("ventas[%s]=%10.2f/n",meses[i],ventas[i]);
        }
    }



}
